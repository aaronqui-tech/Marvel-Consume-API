package org.aaronquitech.project.dependecy.service;

import org.aaronquitech.project.dependecy.model.MarvelResponse;

/**
 * Service de personajes Marvel
 *
 * @author Aaron Quinonez
 * @since 31/01/2025
 */
public interface MarvelCharacterService {
    /**
     * Servicio para obtener personajes Marvel
     *
     * @return {@link MarvelResponse} objeto con personajes
     */
    MarvelResponse getCharacter();

    /**
     * Servicio para obtener un personaje Marvel
     *
     * @param id de personaje {@link String}
     * @return {@link MarvelResponse} objeto con personaje
     */
    MarvelResponse getCharacterByID(String id);
}
