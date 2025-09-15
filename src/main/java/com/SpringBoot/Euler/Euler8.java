package com.SpringBoot.Euler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Euler8 {
    public static final int NumberOfDigitsYouWantMultiplied = 13;
    long highestNumber = 1L;
    long testhighnumber = 1L;
    int indexHighestnumber = 0;
    String bigDigit = getDigits();


    public static String getDigits() {
        // Normally loads digits from a file or DB
        return "73167176531330624919225119674426574742355349194934\n" +
                "96983520312774506326239578318016984801869478851843\n" +
                "85861560789112949495459501737958331952853208805511\n" +
                "12540698747158523863050715693290963295227443043557\n" +
                "66896648950445244523161731856403098711121722383113\n" +
                "62229893423380308135336276614282806444486645238749\n" +
                "30358907296290491560440772390713810515859307960866\n" +
                "70172427121883998797908792274921901699720888093776\n" +
                "65727333001053367881220235421809751254540594752243\n" +
                "52584907711670556013604839586446706324415722155397\n" +
                "53697817977846174064955149290862569321978468622482\n" +
                "83972241375657056057490261407972968652414535100474\n" +
                "82166370484403199890008895243450658541227588666881\n" +
                "16427171479924442928230863465674813919123162824586\n" +
                "17866458359124566529476545682848912883142607690042\n" +
                "24219022671055626321111109370544217506941658960408\n" +
                "07198403850962455444362981230987879927244284909188\n" +
                "84580156166097919133875499200524063689912560717606\n" +
                "05886116467109405077541002256983155200055935729725\n" +
                "71636269561882670428252483600823257530420752963450";
    }
    /**
     * Finds the largest product of 13 consecutive digits in the number bigDigit.
     *
     * @return The largest product found.
     */
    public long highestSumOf13DigitsInARow() {
        System.out.println(bigDigit);
        bigDigit = bigDigit.replace("\n", "");
        for (int i = 0; i < bigDigit.length() - NumberOfDigitsYouWantMultiplied; i++) {
            highestNumber = checksProductOfNNumbersAfterI(i);
        }
        System.out.println(highestNumber);
        return highestNumber;
    }

    private long checksProductOfNNumbersAfterI(int i) {
        long testHighNumber = 1L;
        for (int x = 0; x < NumberOfDigitsYouWantMultiplied; x++) {
            char rowOfNumbersAfterDigiti = bigDigit.charAt(i + x);
            int digitValue = Character.getNumericValue(rowOfNumbersAfterDigiti);
            testHighNumber *= digitValue;
            if (testHighNumber > highestNumber) {
                highestNumber = testHighNumber;
                indexHighestnumber = i;
            }
        }
        return highestNumber;
    }


}
