package za.ac.cput.environmentsustainabilitytracker_fullstack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .authorizeHttpRequests()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/eco-track/login")
                .defaultSuccessUrl("/eco-track/home")
                .failureUrl("/eco-track/login?error=true")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/eco-track/login?logout=true")
                .permitAll();
    }
}
