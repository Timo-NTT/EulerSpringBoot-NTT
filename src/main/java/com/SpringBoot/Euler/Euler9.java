package com.SpringBoot.Euler;

import org.springframework.stereotype.Component;

@Component
public class Euler9 {

    public int pythagoreischesTriplet() {
        for (int a = 1; a < 300; a++) {
            for (int b = 1; b < 400; b++) {
                for (int c = 1; c < 500; c++) {
                    if (checkTriplet(a, b, c)) {
                        return a * b * c;
                    }
                }
            }
        }
        return 0;
    }

    private boolean checkTriplet(int a, int b, int c) {
        if (a + b + c == 1000) {
            if (a * a + b * b == c * c) {
                return true;
            }

        }
        return false;
    }
}

