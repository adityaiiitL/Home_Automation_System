package com.group2.AllDevices;

public abstract class PrimitiveCalculator extends Device {

    public void connectToCentralNode() {
        System.out.println("Use method A to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method A' to end connection from central node ");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public boolean isPrime(int num) {
        System.out.println("Checking prime or not in O(N) time complexity");
        boolean check = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public abstract int remainder(int a, int b);
}
