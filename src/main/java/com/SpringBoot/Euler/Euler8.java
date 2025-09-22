package com.SpringBoot.Euler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Euler8 {
    public static final int NumberOfDigitsYouWantMultiplied = 13;
    long highestNumber = 1L;
    long testhighnumber = 1L;
    int indexHighestnumber = 0;
    public String digitString; // <-- wieder Feld hinzufügen

    @Autowired
    private InputWithRessources reader;
    public final String fileName = "/euler8text.txt";

    /**
     * Finds the largest product of 13 consecutive digits in the number bigDigit.
     *
     * @return The largest product found.
     */
    public long highestSumOf13DigitsInARow() {
        this.digitString = reader.loadNumberFromFile(fileName).replace("\n", "");
        for (int i = 0; i < this.digitString.length() - NumberOfDigitsYouWantMultiplied; i++) {
            highestNumber = checksProductOfNNumbersAfterI(i);
        }
        System.out.println(highestNumber);
        return highestNumber;
    }

    private long checksProductOfNNumbersAfterI(int i) {
        long testHighNumber = 1L;
        for (int x = 0; x < NumberOfDigitsYouWantMultiplied; x++) {
            char rowOfNumbersAfterDigiti = this.digitString.charAt(i + x);
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
