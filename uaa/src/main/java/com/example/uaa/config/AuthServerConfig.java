package com.example.uaa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author Igor Rybak
 * @since 19-Jul-2018
 */
@Configuration
@EnableAuthorizationServer
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients
            .inMemory()
            .withClient("clientId")
            .secret("clientSecret")
            .redirectUris("http://localhost:8080/")
            .authorizedGrantTypes("authorization_code", "refresh_token")
            .scopes("myscope")
            .autoApprove(false)
            .accessTokenValiditySeconds(30)
            .refreshTokenValiditySeconds(1800);
  }


}
