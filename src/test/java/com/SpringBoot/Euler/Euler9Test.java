package com.SpringBoot.Euler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class Euler9Test {
@InjectMocks
    private Euler9 euler9;
@Test
    public void testPythagoreischesTriplet_PositiveCase() {
    int result = euler9.pythagoreischesTriplet();
    assertEquals(31875000, result);
}
}