package org.programirame;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AdditionTest {

    private SimpleCalculator calculator;

    @Parameterized.Parameters
    public static Iterable<Integer[]> testData() {
        return Arrays.asList(new Integer[][] {{1,2,3},
                {2,3,5}, {12,3,15}, {18,2,20}, {-2,3,1}});
    }

    private int argumentX;
    private int argumentY;
    private int result;

    public AdditionTest(int x, int y, int z) {
        this.argumentX = x;
        this.argumentY = y;
        this.result = z;
    }

    @Before
    public void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    public void shouldAddNumbers() throws Exception {
        assertEquals(calculator.add(argumentX, argumentY), result);
    }
}