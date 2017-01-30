package org.programirame;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultiplicationTest {

    private SimpleCalculator calculator;

    @Parameterized.Parameters(name = "{index}: multiply({0},{1})={2}")
    public static Iterable<Integer[]> testData() {
        return Arrays.asList(new Integer[][] {{1,2,2},
                {2,3,6}, {12,3,36}, {18,2,36}, {-2,3,-6}});
    }

    @Parameterized.Parameter
    public int argumentX;

    @Parameterized.Parameter(value = 1)
    public int argumentY;

    @Parameterized.Parameter(value = 2)
    public int result;

    @Before
    public void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    public void shouldMultiplyNumbers() throws Exception {
        assertEquals(calculator.multiply(argumentX, argumentY), result);
    }
}