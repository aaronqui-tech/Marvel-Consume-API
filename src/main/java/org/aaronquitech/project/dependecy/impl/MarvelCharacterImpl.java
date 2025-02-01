package org.aaronquitech.project.dependecy.impl;

import org.aaronquitech.project.dependecy.service.MarvelCharacterService;

/**
 *
 * @author Aaron Quinonez
 * @since 01/02/2025
 */
public class MarvelCharacterImpl implements MarvelCharacterService {
    @Override
    public String getCharacter() {
        return "Aqui consumire la API al endpoint Character...";
    }
    @Override
    public String getCharacterByID(int id) {
        return "Aqui consumire la API al endpoint Character by ID...";
    }
}
