package com.SpringBoot.Euler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SumSquareTest {

    @InjectMocks
    private SumSquare sumSquare;
    @Test
    void getSquareSumFrom1_100Test(){
        int result = sumSquare.getsquaresumfrom1_100();
        assertEquals(result,25502500);
    }

    @Test
    void getSumOfSquaresTest(){
        int result = sumSquare.getsum_of_squares();
        assertEquals(result,338350);
    }
}