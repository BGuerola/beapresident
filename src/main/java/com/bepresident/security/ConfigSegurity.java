package com.bepresident.security;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfigSegurity {
	
    String[] resources = new String[]{
            "/include/**","/css/**","/icons/**","/img/**","/png/**","/js/**","/layer/**"
    };
	
//	@Autowired
//	UsuarioDetailsService usuarioDetailsService;   

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

//	@Bean
//	DataSource dataSource() {
//		return new EmbeddedDatabaseBuilder()
//			.setType(EmbeddedDatabaseType.H2)
//			.addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
//			.build();
//	}
//	
//	@Bean
//	public UserDetailsManager users(EmbeddedDatabase dataSource){
//		UserDetails user = User.builder()
//				.username("username")
//				.password("contrasenya")
//				.roles("rolename")
//				.build();
//		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//		users.createUser(user);
//		return users;
//	}
//	
	@Bean
	public SecurityFilterChain config (HttpSecurity http) throws Exception{
		http
			
			.csrf(csrf -> csrf.ignoringRequestMatchers("/png/**"))
			.csrf(csrf -> csrf.disable()) 
			.authorizeHttpRequests((requests)->requests
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.requestMatchers(resources).permitAll()
				.requestMatchers("/","/index", "/register","/registrar","/h2-console/**","/lista").permitAll()
				.anyRequest().authenticated()
				)
//			.userDetailsService(usuarioDetailsService)

			.formLogin((form)->form
							.loginPage("/login")
							.permitAll()
							.defaultSuccessUrl("/landingCand")
							.failureUrl("/index")
							.usernameParameter("name")
							.passwordParameter("password")
							.and()
							//.csrf().disable()
				)
			.logout((logout)->logout
					.permitAll()
					.logoutSuccessUrl("/login?logout"));
		
		return http.build();
	}

	
//	@Bean
//	public WebSecurityCustomizer webSecurityCustomizer() {
//		return (web)->web.ignoring().requestMatchers(resources);		
//	}  
	

//	   @Bean
//		public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//			auth.userDetailsService(usuarioDetailsService).passwordEncoder(passwordEncoder());
//		}
	

}
	
	



	


