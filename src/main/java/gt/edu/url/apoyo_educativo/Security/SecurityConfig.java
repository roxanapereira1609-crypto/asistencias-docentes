
package gt.edu.url.apoyo_educativo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain seguridadAsistencias(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/login",
                    "/acceso-denegado",
                    "/error",
                    "/estilos.css"
                ).permitAll()
                .requestMatchers(HttpMethod.GET, "/asistencias/nuevo")
                    .hasAnyRole("ADMIN", "DOCENTE")
                .requestMatchers(HttpMethod.POST, "/asistencias")
                    .hasAnyRole("ADMIN", "DOCENTE")
                .requestMatchers("/asistencias/editar/**")
                    .hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/asistencias/**")
                    .hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .formLogin(login -> login
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/asistencias", true)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?salio")
                .invalidateHttpSession(true)
                .permitAll()
            )
            .exceptionHandling(errores ->
                errores.accessDeniedPage("/acceso-denegado")
            );

        return http.build();
    }
}
