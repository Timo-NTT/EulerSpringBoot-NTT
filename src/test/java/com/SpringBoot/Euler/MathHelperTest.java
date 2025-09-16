package com.SpringBoot.Euler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class MathHelperTest {
    @InjectMocks
    private MathHelper mathHelper;

    @Test
    void testIsPrimeNumber_IsPrimeNumber() throws IOException {
        assertTrue(mathHelper.isPrimenumber(2L));
        assertTrue(mathHelper.isPrimenumber(3L));
        assertTrue(mathHelper.isPrimenumber(5L));
    }

    @Test
    void testIsPrimeNumber_IsNoPrimeNumber() throws IOException {
        assertFalse(mathHelper.isPrimenumber(4L));
        assertFalse(mathHelper.isPrimenumber(16L));
    }

    @Test
    void testIsPrimenumber_IsNegativeNumber() throws IOException {
        assertThrows(IOException.class, () -> mathHelper.isPrimenumber(-2));
    }

    @Test
    void testIsPrimenumber_IsZeroNumber() throws IOException {
        assertThrows(IOException.class, () -> mathHelper.isPrimenumber(0));
    }
    @Test
    void testIsPrimenumber_IsNumberOne() throws IOException {
        assertThrows(IOException.class, () -> mathHelper.isPrimenumber(1));
    }
}