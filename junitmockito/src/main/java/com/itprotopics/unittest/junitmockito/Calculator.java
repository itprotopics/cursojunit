package com.itprotopics.unittest.junitmockito;

public class Calculator {

    private int result;

    public int add (int n1, int n2) {
        result = n1 + n2;
        return result;
    }
    public int substract(int n1, int n2) {
        result = n1 - n2;
        return result;
    }
}