package org.aaronquitech.project.dependecy.clienthttp;

import org.aaronquitech.project.dependecy.model.MarvelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Cliente RestTemplate
 *
 * @author Aaron Quinonez
 * @since 01/02/2025
 */
@Service
public class RestTemplateClient {

    /** Inyección de dependecia. */
    @Autowired
    private RestTemplate restTemplate;

    /** Metodo para obtener personajes
     *
     * @param url de API Marvel de Personajes
     * @return {@link MarvelResponse} objeto con personajes
     */
    public MarvelResponse getCharacters(String url) {
        try {
            return restTemplate.getForObject(url, MarvelResponse.class);
        } catch (RestClientException e) {
            throw new RuntimeException(e);
        }
    }

    /** Metodo para obtener personaje por id
     *
     * @param url de API Marvel de Personaje por id
     * @return {@link MarvelResponse} objeto con personaje
     */
    public MarvelResponse getCharactersId(String url) {
        try {
            return restTemplate.getForObject(url, MarvelResponse.class);
        } catch (RestClientException e) {
            throw new RuntimeException(e);
        }
    }
}
