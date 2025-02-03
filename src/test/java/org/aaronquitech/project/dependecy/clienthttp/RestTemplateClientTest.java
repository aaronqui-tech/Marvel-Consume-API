package org.aaronquitech.project.dependecy.clienthttp;

import org.aaronquitech.project.dependecy.model.MarvelResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
public class RestTemplateClientTest {
    @InjectMocks
    private RestTemplateClient restTemplateClient;

    @Mock
    RestTemplate restTemplate;

    /**
     * Inicializa los componentes de mockito.
     */
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getCharactersTest(){
        Mockito.when(restTemplate.getForObject(Mockito.anyString(),
                Mockito.any())).thenReturn(new MarvelResponse());
        Assertions.assertNotNull(this.restTemplateClient.getCharacters("url"));
    }

    @Test
    void getCharactersExceptionTest(){
        Mockito.when(restTemplate.getForObject(Mockito.anyString(),
                Mockito.any())).thenThrow(RestClientException.class);
        Assertions.assertThrows(RuntimeException.class,() -> {
            this.restTemplateClient.getCharacters("url");});
    }

    @Test
    void getCharactersIdTest(){
        Mockito.when(restTemplate.getForObject(Mockito.anyString(),
                Mockito.any())).thenReturn(new MarvelResponse());
        Assertions.assertNotNull(this.restTemplateClient.getCharactersId("url"));
    }

    @Test
    void getCharactersIdExceptionTest(){
        Mockito.when(restTemplate.getForObject(Mockito.anyString(),
                Mockito.any())).thenThrow(RestClientException.class);
        Assertions.assertThrows(RuntimeException.class,() -> {
            this.restTemplateClient.getCharactersId("url");});
    }

}
