package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleNumberCalculatorTest {
    @Test
    void valueWorks(){
        TriangleNumberCalculator triangleNumberCalculator = new TriangleNumberCalculator();
        assertEquals(1, triangleNumberCalculator.value(1), 0.01);
        assertEquals(3, triangleNumberCalculator.value(2), 0.01);
        assertEquals(10, triangleNumberCalculator.value(4), 0.01);
    }
    @Test 
    void addWorks(){
        TriangleNumberCalculator triangleNumberCalculator = new TriangleNumberCalculator();
        assertEquals(2, triangleNumberCalculator.add(1,1), 0.01);
        assertEquals(9, triangleNumberCalculator.add(2,3), 0.01);
        assertEquals(13, triangleNumberCalculator.add(4,2), 0.01);
    }
    @Test 
    void subtractWorks(){
        TriangleNumberCalculator triangleNumberCalculator = new TriangleNumberCalculator();
        assertEquals(0, triangleNumberCalculator.subtract(1,1), 0.01);
        assertEquals(-3, triangleNumberCalculator.subtract(2,3), 0.01);
        assertEquals(7, triangleNumberCalculator.subtract(4,2), 0.01);
    }
}
