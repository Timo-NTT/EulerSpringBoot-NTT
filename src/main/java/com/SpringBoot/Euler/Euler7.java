package com.SpringBoot.Euler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@RequiredArgsConstructor
@Component
public class Euler7 {
    private final MathHelper mathHelper;


    /**
     * Index starts by 1
     *
     * @return Nth Prime number.
     */
    public int getNthPrimeNumber(int targetPrimeNumberIndex) throws Exception {
        if (targetPrimeNumberIndex <= 0) {
            throw new IOException("Invalid Number");
        }

        int i = 1;
        int currentPrimeNumberIndex = 0;
        while (true) {
            i += 1;
            if (mathHelper.isPrimenumber(i)) {
                currentPrimeNumberIndex += 1;
                if (currentPrimeNumberIndex == targetPrimeNumberIndex) {
                    return i;
                }
            }
        }

    }
}
