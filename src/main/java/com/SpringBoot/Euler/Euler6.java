package com.SpringBoot.Euler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component

public class Euler6 {

private final SumSquare sumSquare;


    /**
     *
     * @return gives the difference from the squares 1-100 minus the sum of squares
     */
    public int sumSquaresResult() {
        return (sumSquare.getsquaresumfrom1_100() - sumSquare.getsum_of_squares());

    }


}
