package org.aaronquitech.project.dependecy.impl;

import org.aaronquitech.project.dependecy.clienthttp.RestTemplateClient;
import org.aaronquitech.project.dependecy.model.MarvelResponse;
import org.aaronquitech.project.dependecy.util.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

@ExtendWith(MockitoExtension.class)
public class MarvelCharaterImplTest {
    @InjectMocks
    private MarvelCharacterImpl marvelCharacter;

    @Mock
    private Utils utils;

    @Mock
    private RestTemplateClient restTemplateClient;

    @BeforeEach
    public void setUp() {
        ReflectionTestUtils.setField(marvelCharacter,"kPublic","1234");
        ReflectionTestUtils.setField(marvelCharacter,"kPrivate","4567");
        ReflectionTestUtils.setField(marvelCharacter,"characterPath","http://localhost:8080/test");
        ReflectionTestUtils.setField(marvelCharacter,"characterPathId","http://localhost:8080/test");
    }

    @Test
    void getCharacterTest(){
        Mockito.when(this.utils.generateHash(Mockito.anyString()))
                .thenReturn("1234");
        Mockito.when(this.restTemplateClient.getCharacters(Mockito.anyString()))
                .thenReturn(new MarvelResponse());
        Assertions.assertNotNull(this.marvelCharacter.getCharacter());
    }

    @Test
    void getCharacterByIDTest(){
        Mockito.when(this.utils.generateHash(Mockito.anyString()))
            .thenReturn("1234");
        Mockito.when(this.restTemplateClient.getCharactersId(Mockito.anyString()))
                .thenReturn(new MarvelResponse());
        Assertions.assertNotNull(this.marvelCharacter.getCharacterByID("1"));
    }
}
