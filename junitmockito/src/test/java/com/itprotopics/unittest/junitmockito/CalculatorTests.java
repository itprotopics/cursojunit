package com.itprotopics.unittest.junitmockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    public Calculator calculator;
    public Calculator calculatorNull;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testCalculatorNotNull() {
        assertNotNull(calculator, "Calculator debe ser not null");
    }
    
    @Test
    void testAdd() {
        
    }

    @Test
    void testSubstract() {

    }
}
