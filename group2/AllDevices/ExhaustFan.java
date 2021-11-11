package com.group2.AllDevices;

import java.util.Scanner;

public class ExhaustFan extends Device {

    public final int MIN = 0;
    public final int MAX = 5;
    Scanner sc = new Scanner(System.in);

    private int ExhaustFanSpeed;

    public ExhaustFan() {
        System.out.println("Initializing Exhaust Fan Constructor ...");
        ExhaustFanSpeed = 3;
        System.out.println("Terminating Exhaust Fan Constructor !!");
    }

    public void incrementSpeed() {
        if (ExhaustFanSpeed <= 4) {
            ExhaustFanSpeed++;
        }
    }

    public void decrementSpeed() {
        if (ExhaustFanSpeed >= 1) {
            ExhaustFanSpeed--;
        }
    }

    public void ExhaustFanFunc() {
        System.out.println("|| EXHAUST FAN FUNCTIONS || ");
        System.out.println();
        System.out.println("[1] : To set ON");
        System.out.println("[2] : To set OFF");
        System.out.println("[3] : To increase speed");
        System.out.println("[4] : To decrease speed");
        System.out.println("[5] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            this.on();
        } else if (choice == 2) {
            this.off();
        } else if (choice == 3) {
            incrementSpeed();
        } else if (choice == 4) {
            decrementSpeed();
        } else {
            System.out.println("Thank You !! Leaving fan !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of fan (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            ExhaustFanFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving fan !");
        }
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }
}
