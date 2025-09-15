package com.SpringBoot.Euler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HomeControllerTest {

    @InjectMocks
    private HomeController homeController;
    @Mock
    private Euler8 euler8;
    @Mock
    private Euler7 euler7;

    @Test
    void getNthPrimeNumberTest() throws Exception {
        // Mock für den Fall, dass der 7. Primzahlwert abgefragt wird
        when(euler7.getNthPrimeNumber(7)).thenReturn(17);

        // Die Methode im Controller aufrufen
        ResponseEntity<Integer> response = homeController.getNthPrimeNumber(7);

        // Überprüfen, ob der Statuscode 200 (OK) ist
        assertEquals(200, response.getStatusCodeValue());

        // Überprüfen, ob der Wert im ResponseEntity der erwarteten Primzahl entspricht
        assertEquals(17, response.getBody());
    }

    @Test
    void ControllerEuler8Test() throws Exception {
        when(euler8.highestSumOf13DigitsInARow()).thenReturn(23514624000L);
        ResponseEntity<Long> response = homeController.ControllerEuler8();
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(23514624000L, response.getBody());
    }
}