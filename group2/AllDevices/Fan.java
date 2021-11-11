package com.group2.AllDevices;

import java.util.Scanner;

public class Fan extends Device {

    private final int MIN;
    private final int MAX;
    Scanner sc = new Scanner(System.in);

    private int fanSpeed;

    public Fan() {
        System.out.println("Initializing Fan Constructor ...");
        MIN = 0;
        MAX = 5;
        this.fanSpeed = 0;
        System.out.println("Terminating Fan Constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying Fan State -");
        System.out.println("a) Current speed - " + fanSpeed);
        System.out.println("b) Current is on - " + isON());
        System.out.println();
        //System.out.println("-------------------------------------");
    }

    public void incrementSpeed() {
        if (fanSpeed <= MAX - 1) {
            fanSpeed++;
        }
    }

    public void decrementSpeed() {
        if (fanSpeed >= MIN + 1) {
            fanSpeed--;
        }
    }

    public void FanFunc() {
        System.out.println("|| FAN FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To set ON");
        System.out.println("[2] : To set OFF");
        System.out.println("[3] : To increase speed");
        System.out.println("[4] : To decrease speed");
        System.out.println("[5] : To display current state");
        System.out.println("[6] : Exit");
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
        } else if (choice == 5) {
            display();
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
            FanFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving fan !");
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
