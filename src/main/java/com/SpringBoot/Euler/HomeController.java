package com.SpringBoot.Euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private Euler7 euler7;

    @Autowired
    private Euler8 euler8;

    /**
     * Define the URL.
     *
     * @return the error that should be displayed on the screen.
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> index() {
        logger.info("Application name: {}", appName);
        return ResponseEntity.status(404).body("not found");
    }

    /**
     * Define the URL on which you can open and type in the nth prime number you want to check.
     *
     * @param input the input from the website.
     * @return the nth prime number that gets displayed on the website.
     */
    @GetMapping(value = "/euler7/{input}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> getNthPrimeNumber(@PathVariable("input") int input) throws Exception {
        int result = euler7.getNthPrimeNumber(input);
        return ResponseEntity.ok(result);
    }

    /**
     * REST endpoint that returns the largest product of 13 consecutive digits (Euler problem 8).
     *
     * @return JSON with the result
     */
    @GetMapping(value = "/euler8", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> test2() {

        // N-te Primzahl berechnen
        long result = euler8.highestSumOf13DigitsInARow();

        return ResponseEntity.ok(result);
    }
}