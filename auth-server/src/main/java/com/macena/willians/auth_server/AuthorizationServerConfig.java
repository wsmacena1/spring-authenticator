package com.macena.willians.auth_server;

import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.server.authorization.settings.AuthorizationServerSettings;

public class AuthorizationServerConfig {

    @Bean
    AuthorizationServerSettings authorizationServerSettings(){
        return AuthorizationServerSettings.builder().build();
    }
}
