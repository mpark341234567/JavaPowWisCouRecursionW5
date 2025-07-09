package org.example;

public class TriangleNumberCalculator {
    public int value(int i){
        if (i == 1) {
            return 1;
        }
        return value(i - 1) + i;
    }
    public int add(int i, int j) {
        return (value(i) + value(j));
    }
    public int subtract(int i, int j){
        return (value(i) - value(j));
    }
}