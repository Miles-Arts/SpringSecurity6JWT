package com.cursos.springsecuritycourse.config.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
public class HttpSecurityConfig {




    @Bean
    public SecurityFilerChain securityFilerChain(HttpSecurity http) throws Exception
    {
        http
                .csrf( csrfConfig -> csrfConfig.disable())
                .sessionManagement( sessionMangConfig -> sessionMangConfig.sessionCreationPolicy(SessionCreationPolicy.STATELESS) )
        return http.build();
    }

}
