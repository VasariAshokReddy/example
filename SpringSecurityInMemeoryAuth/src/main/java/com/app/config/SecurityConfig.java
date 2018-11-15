package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private BCryptPasswordEncoder pwdEnc;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Sam")
		.password(pwdEnc.encode("Sam")).authorities("EMP");
		auth.inMemoryAuthentication().withUser("Ram")
		.password(pwdEnc.encode("Ram")).authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("Vicky")
		.password(pwdEnc.encode("Vicky")).authorities("STUDENT" , "MGR");
	}
	protected void configur(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/all").permitAll()
		.antMatchers("/emp").hasAuthority("EMP")
		.antMatchers("/admin").hasAuthority("/ADMIN")
		.anyRequest().authenticated()
		.and().formLogin().defaultSuccessUrl("/view")
		.and().logout().logoutRequestMatcher
		(new AntPathRequestMatcher("/logout"))
		.and().exceptionHandling().accessDeniedPage("/denied");
	}
}
