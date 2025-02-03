package org.aaronquitech.project.dependecy.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UtilsTest {
    @InjectMocks
    private Utils utils;

    @Test
    void generateHashTest(){
        Assertions.assertNotNull(this.utils.generateHash("1"));
    }
}
