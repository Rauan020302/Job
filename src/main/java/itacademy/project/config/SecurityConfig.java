package itacademy.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
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
        http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeRequests()
                .antMatchers("/api/auth/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/user").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/user").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/api/student/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/student/**").hasAnyRole("TEACHER","ADMIN")
                .antMatchers(HttpMethod.GET,"/api/student/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/timetable").hasAnyRole("TEACHER", "ADMIN")
                .antMatchers(HttpMethod.POST,"/api/timetable").hasAnyRole("TEACHER", "ADMIN")
                .antMatchers(HttpMethod.GET,"/api/timetable").permitAll()
                .antMatchers("/api/teacher").permitAll()/*hasAnyRole("TEACHER","ADMIN")*/
                .antMatchers(HttpMethod.POST,"/api/task").permitAll()/*hasRole("TEACHER")*/
                .antMatchers(HttpMethod.DELETE,"/api/task").hasRole("TEACHER")
                .antMatchers(HttpMethod.GET,"/api/task").permitAll()
                .antMatchers("/api/subject").permitAll()/*hasRole("ADMIN")*/
                .antMatchers("/api/cabinet").permitAll()/*hasAnyRole("ROLE_ADMIN","ROLE_TEACHER")*/
                .and().httpBasic().and().logout().and().formLogin();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select login, user_password, status from a_user where login = ?")
                .authoritiesByUsernameQuery("select u.login,ur.role_name from user_role ur join a_user u on ur.user_id = u.id where u.login = ? and status = 1");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
