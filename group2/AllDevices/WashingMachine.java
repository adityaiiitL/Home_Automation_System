package com.group2.AllDevices;

import java.util.Scanner;

public class WashingMachine extends Device {

    Scanner sc = new Scanner(System.in);

    private int CurrTemp;
    private String CurrMode;
    private int[] temp = new int[] { 40, 20, 20, 40, 50 }; // wash depending on mode
    private String[] Mode = new String[] {
            "Cotton",
            "Delicate",
            "Wool",
            "Mix",
            "Sports wear",
    }; // wash

    public WashingMachine() { // constructor should be public
        System.out.println("Initializing washing machine constructor ...");

        CurrTemp = 40;
        CurrMode = "Cotton";
        System.out.println("Terminating washing machine constructor !!");
        System.out.println();
    }

    public void WashingMachineFunc() {
        System.out.println("|| WASHING MACHINE ||");
        System.out.println();
        System.out.println("[1] : To Wash clothes");
        System.out.println("[2] : To Rinse clothes");
        System.out.println("[3] : To Dry clothes");
        System.out.println("[4] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            this.on();
            this.washClothes();
            this.off();
        } else if (choice == 2) {
            this.on();
            this.rinse();
            this.off();
        } else if (choice == 3) {
            this.on();
            this.drier();
            this.off();
        } else {
            System.out.println("Thank You !! Leaving Washing machine !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Washing machine (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            WashingMachineFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Washing machine !");
            System.out.println();
        }
    }

    public void washClothes() {
        System.out.println("Select one from the given modes : ");

        int index = 1;
        for (String x : Mode) {
            System.out.println(index + " : " + x);
            index++;
        }
        int ch;
        System.out.println("Enter your choice : ");
        ch = sc.nextInt();

        CurrMode = Mode[ch - 1];
        CurrTemp = temp[ch - 1];

        System.out.println("Current Mode : " + CurrMode);
        System.out.println("Current Temp : " + CurrTemp);
        System.out.println();

        // sleep
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Ring Alarm ... About to finish ...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("You can take your clothes !!");
        System.out.println();
    }

    public void rinse() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Ring Alarm ... About to finish ...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("You can take your clothes !!");
        System.out.println();
    }

    public void drier() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Ring Alarm ... About to finish ...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("You can take your clothes !!");
        System.out.println();
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }
}
