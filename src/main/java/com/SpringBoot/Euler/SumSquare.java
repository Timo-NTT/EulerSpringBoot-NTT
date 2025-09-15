package com.SpringBoot.Euler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class SumSquare {


    /**
     * gives to sum from the numbers from 1-100 and squares that
     *
     * @return the squared sum from 1-100
     */
    public int getsquaresumfrom1_100() {
        int squarsum = 0;
        for (int i = 0; i <= 100; i++) {
            squarsum += i;
        }
        return squarsum * squarsum;
    }

    /**
     * squares every number from 1-100 and additons it
     *
     * @return sum of the squares from 1-100
     */
    public int getsum_of_squares() {
        int sumofsquare = 0;
        for (int i = 0; i <= 100; i++) {
            sumofsquare += i * i;
        }
        return sumofsquare;
    }
}
