package org.aaronquitech.project.dependecy.config;

import org.aaronquitech.project.dependecy.impl.MarvelCharacterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Clase de configuracion de Beans
 *
 * @author Aaron Quinonez
 * @since 31/01/2025
 */
@Configuration
@ComponentScan(basePackages = "org.aaronquitech.project.dependecy")
public class AppBeanConfig {

    /** Bean personajes marvel. */
    @Bean
    public MarvelCharacterImpl characterBean() {
        return new MarvelCharacterImpl();
    }
}
