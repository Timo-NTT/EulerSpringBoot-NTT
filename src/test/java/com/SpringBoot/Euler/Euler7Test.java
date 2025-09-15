package com.SpringBoot.Euler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Euler7Test {

    @Mock
    private MathHelper mathHelper;

    @InjectMocks
    private Euler7 euler7;


    @Test
    void testFirstPrimeWithMock() throws Exception {
        when(mathHelper.isPrimenumber(2)).thenReturn(true);
        assertEquals(2, euler7.getNthPrimeNumber(1));
    }

    @Test
    void testSecondPrimeWithMock() throws Exception {
        when(mathHelper.isPrimenumber(2)).thenReturn(true);
        when(mathHelper.isPrimenumber(3)).thenReturn(true);
        assertEquals(3, euler7.getNthPrimeNumber(2));
    }

    @Test
    void invalidBehavier() {
        assertThrows(IOException.class, ()-> euler7.getNthPrimeNumber(-2) );
    }
}