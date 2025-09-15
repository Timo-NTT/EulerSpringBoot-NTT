package com.SpringBoot.Euler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class MathHelperTest {
    @InjectMocks
    private MathHelper mathHelper;

    @Test
    void isPrimenumberTest() {
        assertTrue(mathHelper.isPrimenumber(2L)); // Primzahl
        assertTrue(mathHelper.isPrimenumber(3L)); // Primzahl
        assertFalse(mathHelper.isPrimenumber(4L)); // Keine Primzahl
        assertTrue(mathHelper.isPrimenumber(5L)); // Primzahl
        assertFalse(mathHelper.isPrimenumber(16L)); // Keine Primzahl
    }
}