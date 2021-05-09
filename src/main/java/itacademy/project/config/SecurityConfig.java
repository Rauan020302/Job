package itacademy.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers( "/api/user").permitAll()
                .antMatchers("api/auth/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/user").hasRole("ADMIN")
                .antMatchers("/api/student/**").hasRole("STUDENT")
                .antMatchers("/api/teacher").hasRole("TEACHER")
                .antMatchers("/api/mark").hasRole("ADMIN")
                .antMatchers("/api/task").hasRole("TEACHER")
                .antMatchers("/api/timetable").hasAnyRole("TEACHER", "ADMIN")
                .antMatchers("/api/subject").hasRole("ADMIN")
                .antMatchers("/api/cabinet").hasAnyRole("ADMIN","TEACHER")
                .and().httpBasic().and().logout().and().formLogin();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select login, password, status from user where username = ?")
                .authoritiesByUsernameQuery("select u.login,ur.role_name from user_role ur join user u on ur.user_id = u.id where u.login = ? and status = 1");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
