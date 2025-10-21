package com.macena.willians.auth_server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserStoreConfig {
    @Bean
    UserDetailsService userDetailsService(){
        var userDetailsManager = new InMemoryUserDetailsManager();

        userDetailsManager.createUser(
            User.withUsername("user")
        .password("{noop}12345678")
        .roles("USER")
        .build()
        );

        return userDetailsManager;
    }
}
