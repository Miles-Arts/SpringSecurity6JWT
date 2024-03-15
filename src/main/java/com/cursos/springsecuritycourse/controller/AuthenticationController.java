package com.cursos.springsecuritycourse.controller;

import com.cursos.springsecuritycourse.dto.AuthenticationRequest;
import com.cursos.springsecuritycourse.dto.AuthenticationResponse;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

        @PostMapping("/autehticate")

        public ResponseEntity<AuthenticationResponse> login(@RequestBody @Valid AuthenticationRequest authRequest)

                return null;


}
