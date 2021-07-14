package it.academy.jwt.controller;

import it.academy.jwt.dto.AuthRequestDto;
import it.academy.jwt.entity.User;
import it.academy.jwt.security.jwt.JwtTokenProvider;
import it.academy.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1/auth/")
public class AuthControllerV1 {
    private final AuthenticationManager authenticationManager;

    private final JwtTokenProvider jwtTokenProvider;

    private final UserService userService;

    public AuthControllerV1(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthRequestDto authRequestDto){
        try{
            String username = authRequestDto.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,authRequestDto.getPassword()));
            User user = userService.findByUserName(username);

            if (user == null){
                throw new UsernameNotFoundException("User with username " + username + " not found ");
            }
            String token = jwtTokenProvider.createToken(username, user.getRoles());
            Map<Object,Object> response = new HashMap<>();
            response.put("username", username);
            response.put("token",token);
            return ResponseEntity.ok(response);
        }catch (AuthenticationException e){
            throw new BadCredentialsException("Invalid username or password");
        }

    }
}
