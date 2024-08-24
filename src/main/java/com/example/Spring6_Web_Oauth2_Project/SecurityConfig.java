package com.example.Spring6_Web_Oauth2_Project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // Shënon këtë klasë si një klasë konfigurimi në Spring.
@EnableWebSecurity // Aktivizon mbështetjen e sigurisë së uebit në aplikacionin Spring.
public class SecurityConfig {

    @Bean // Krijon dhe menaxhon një SecurityFilterChain si një komponent në Spring.
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Konfigurimi i sigurisë për kërkesat HTTP.
        return http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                // Çdo kërkesë HTTP që vjen duhet të jetë e autentikuar.
                .oauth2Login(Customizer.withDefaults()) // Aktivizon login-in me OAuth2 me cilësimet standarde.
                .build(); // Ndërton dhe kthen objektin SecurityFilterChain të konfiguruar.
    }
}
