package com.SpringBoot.Euler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MathHelper {


    public boolean isPrimenumber(long testNumber) {
        for (long x = 2L; x < (testNumber / 2) + 1; x++) {
            if (testNumber % x == 0) {
                return false;
            }

        }
        return true;
    }

}