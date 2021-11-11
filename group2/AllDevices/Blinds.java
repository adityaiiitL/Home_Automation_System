package com.group2.AllDevices;

import java.util.Scanner;

public class Blinds extends Device {

    Scanner sc = new Scanner(System.in);
    private String state;
    // 0 close
    // 1 half
    // 2 full

    private String[] StateList = new String[] { "Close", "Half", "Full" };

    public Blinds() {
        System.out.println("Initializing Blinds Constructor ...");
        state = StateList[0]; // close
        System.out.println("Terminating Blinds Constructor !!");
    }

    public void BlindFunctions() {
        System.out.println("|| BLIND FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To show current state ");
        System.out.println("[2] : To fully open");
        System.out.println("[3] : To close");
        System.out.println("[4] : To half open");
        System.out.println("[5] : Exit");

        int choice;
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Current state : " + state);
        } else if (choice == 2) {
            state = StateList[2];
        } else if (choice == 3) {
            state = StateList[0];
        } else if (choice == 4) {
            state = StateList[1];
        } else {
            System.out.println("Thank You !! Leaving blinds !");
            System.out.println();
            return;
        }

        char ch;
        System.out.println("Do you want to use more functions of blinds (Y/N) : ");
        System.out.println();
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            BlindFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving blinds !");
            System.out.println();
        }
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {}
}
