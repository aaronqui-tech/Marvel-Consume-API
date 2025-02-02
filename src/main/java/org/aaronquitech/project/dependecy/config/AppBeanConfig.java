package org.aaronquitech.project.dependecy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Clase de configuracion de Beans
 *
 * @author Aaron Quinonez
 * @since 31/01/2025
 */
@Configuration
@ComponentScan(basePackages = "org.aaronquitech.project.dependecy")
public class AppBeanConfig {
        /**
     * Bean RestTemplate Http
     *
     * @return {@link RestTemplate} Bean
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
