package org.example;

import java.util.ArrayList;

public class TriangleNumberCalculator {
    public int value(int n){
        if (n == 1) {
            return 1;
        }
        return value(n - 1) + n;
    }
    public int add(int n, int m) {
        return (value(n) + value(m));
    }
    public int subtract(int n, int m){
        return (value(n) - value(m));
    }
    public int multiply(int n, int m){
        return (value(n) * value(m));
    }
    public double divide(int n, int m){
        return (((double) value(n)) / ((double) value(m)));
    }
    public ArrayList<Integer> sequence(int n){
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 1; i < (n + 1); i++) {
            sequence.add(value(i));
        }
        return sequence;
    }
}