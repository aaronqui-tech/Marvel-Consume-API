package org.aaronquitech.project.dependecy;

import org.aaronquitech.project.dependecy.config.AppBeanConfig;
import org.aaronquitech.project.dependecy.service.MarvelCharacterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Clase principal de main.
 *
 * @author Aaron Quinonez
 * @since 31/01/2025
 */
public class App 
{
    /** Metodo Principal de la aplicación. */
    public static void main( String[] args )
    {
        /** Contexto de Spring. */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppBeanConfig.class);
        /** Obtiene el bean de la implementación. */
        MarvelCharacterService servicio = context.getBean(MarvelCharacterService.class);
        /** Cierra el contexto. */
        context.close();
    }
}
