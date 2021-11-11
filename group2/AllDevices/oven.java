package com.group2.AllDevices;

import java.util.Scanner;

public class oven extends Device implements Runnable {

    public int temp;
    public String mode; // high mid low

    Scanner sc = new Scanner(System.in);

    public oven() {
        System.out.println("Initializing Oven Constructor ...");
        temp = -1;
        mode = "mid";
        System.out.println("Terminating Oven Constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Display current state -  ");
        System.out.println();
        System.out.println("Temperature :  " + temp);
        System.out.println("Mode : " + mode);
    }

    public void OvenFunc() {
        System.out.println("|| OVEN FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use OVEN");
        System.out.println("[2] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            useOven();
        } else {
            System.out.println("Thank You !! Leaving oven !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of oven (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            OvenFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving oven !");
            System.out.println();
        }
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + " Oven is running ... ");
        }
    }

    public void useOven() {
        on();

        System.out.print("Enter the temperature you want to have : ");
        temp = sc.nextInt();
        System.out.println();

        System.out.println("Enter mode - ");
        System.out.println();
        System.out.println("[1] : For low ");
        System.out.println("[2] : For mid ");
        System.out.println("[3] : For high ");
        System.out.println();
        int x = sc.nextInt();
        System.out.println();
        if (x == 1) {
            mode = "low";
        } else if (x == 2) {
            mode = "mid";
        } else if (x == 3) {
            mode = "high";
        }

        display();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Ring Alarm ... close to given " + temp);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Done !! Your food is ready !");
        System.out.println();

        this.off();
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {}
}
