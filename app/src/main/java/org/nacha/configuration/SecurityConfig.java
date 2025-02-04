package org.nacha.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                // Payments
                http
                        .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/payments/**")
                        .authenticated().anyRequest().permitAll());

                // Users
                http
                        .authorizeHttpRequests(auth -> auth
                                .requestMatchers("/admin/**").hasRole("ADMIN")
                                .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
                                .anyRequest().authenticated());

                
                return http.build();
        }
}
