package com.shwe.authserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class UsersConfig extends GlobalAuthenticationConfigurerAdapter {

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("shweaye").password("{noop}supersecure1").roles("ADMIN").and()
		.withUser("simple1").password("{noop}simplesecure").roles("USER").and()
		.withUser("simple2").password("{noop}simplesecure").roles("USER").and()
		.withUser("simple3").password("{noop}simplesecure").roles("USER").and()
		.withUser("simple4").password("{noop}simplesecure").roles("USER").and()
		.withUser("simple5").password("{noop}simplesecure").roles("USER").and()
		.withUser("simple6").password("{noop}simplesecure").roles("USER").and()
		.withUser("simple7").password("{noop}simplesecure").roles("USER").and()
		.withUser("simple8").password("{noop}simplesecure").roles("USER");


	}

}
