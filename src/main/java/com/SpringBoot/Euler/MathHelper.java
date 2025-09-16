package com.SpringBoot.Euler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class MathHelper {


    public boolean isPrimenumber(long testNumber) throws IOException {
        if (testNumber <= 1) {
            throw new IOException("Invalid Number");
        }
        for (long x = 2L; x < (testNumber / 2) + 1; x++) {
            if (testNumber % x == 0) {
                return false;
            }

        }
        return true;
    }
}