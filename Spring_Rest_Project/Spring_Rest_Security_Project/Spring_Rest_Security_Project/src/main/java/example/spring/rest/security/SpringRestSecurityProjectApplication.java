package example.spring.rest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity // Enabling the Security Customization defined by SecurityFilterChain
public class SpringRestSecurityProjectApplication {

	@Bean
	public BCryptPasswordEncoder enchoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(auth -> {
			auth.requestMatchers("/doGreet").permitAll();
			auth.requestMatchers("/doAdminWork").hasAnyRole("ADMIN");
			auth.requestMatchers("/doRegularWork").hasAnyRole("ADMIN", "REGULAR");

		});
		http.csrf(csrf -> csrf.disable());
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());

		return http.build();
	}

	@Bean
	public UserDetailsService getUserDetailsService() {
		UserDetails adminUser = User.withUsername("admin")
				.password(enchoder().encode("admin"))
				.roles("ADMIN")
				.build();
		UserDetails regularUser = User.withUsername("regular")
				.password(enchoder().encode("regular"))
				.roles("REGULAR")
				.build();

		UserDetailsService detailsServiceRef = new InMemoryUserDetailsManager(adminUser, regularUser);
		return detailsServiceRef;

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityProjectApplication.class, args);
	}

}
