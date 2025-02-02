package org.aaronquitech.project.dependecy.impl;

import org.aaronquitech.project.dependecy.clienthttp.RestTemplateClient;
import org.aaronquitech.project.dependecy.model.MarvelResponse;
import org.aaronquitech.project.dependecy.service.MarvelCharacterService;
import org.aaronquitech.project.dependecy.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Implementacion del servicio de personajes Marvel
 *
 * @author Aaron Quinonez
 * @since 01/02/2025
 */
@Service
public class MarvelCharacterImpl implements MarvelCharacterService {
    /** Inyeccion de clase Utileria. */
    @Autowired
    private Utils utils;
    /** Inyeccion de clase cliente Rest. */
    @Autowired
    private RestTemplateClient restTemplateClient;

    /** Valor externo llave publica. */
    @Value("${marvel.key.public}")
    private String kPublic;
    /** Valor externo llave privada. */
    @Value("${marvel.key.key.private}")
    private String kPrivate;
    /** Valor externo path API personajes. */
    @Value("${marvel.path.character}")
    private String characterPath;
    /** Valor externo path API personaje. */
    @Value("${marvel.path.character.id}")
    private String characterPathId;

    /** {@inheritDoc}. */
    @Override
    public MarvelResponse getCharacter() {
        System.out.println("Entra a metodo getCharacter");
        Long timeStamp = Math.round(Math.random());
        String hash = utils.generateHash(
                    timeStamp
                        + this.kPrivate
                        + this.kPublic);
        return restTemplateClient.getCharacters(
                String.format(this.characterPath, timeStamp, kPublic, hash));
    }

    /** {@inheritDoc}. */
    @Override
    public MarvelResponse getCharacterByID(String id) {
        System.out.println("Entra a metodo getCharacter por id");
        Long timeStamp = Math.round(Math.random());
        String hash = utils.generateHash(
                timeStamp
                        + this.kPrivate
                        + this.kPublic);
        return restTemplateClient.getCharactersId(
                String.format(this.characterPathId, id, timeStamp, kPublic, hash));
    }
}
