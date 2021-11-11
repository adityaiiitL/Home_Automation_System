package com.group2.AllDevices;

import java.util.Scanner;

public class AC extends Device {

    Scanner sc = new Scanner(System.in);

    private int Temp;
    private String SwingMode;
    private int currSpeed;

    public AC() {
        System.out.println("Initializing AC constructor ..");
        this.Temp = 23;
        this.SwingMode = "OFF";
        this.currSpeed = 2;
        System.out.println("Terminating AC constructor !! ");
    }

    public void display() {
        System.out.println("a) Current Temperature : " + Temp);
        System.out.println("b) Swing state : " + SwingMode);
        System.out.println("c) Fan Speed : " + currSpeed);
        System.out.println("d) Current is on - " + isON());
    }

    public void ACfunc() {
        System.out.println("|| AC FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To ON Ac and change ON state function"); // auto off
        System.out.println("[2] : To OFF Ac");
        System.out.println("[3] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            onStateFunction();
        } else if (choice == 2) {
            off();
        } else {
            System.out.println("Thank You !! Leaving AC ! ");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of AC (Y/N) : ");
        System.out.println();
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            ACfunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving AC !");
            System.out.println();
        }
    }

    public void onStateFunction() {
        on();

        System.out.println("|| ON STATE AC FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To Check current states");
        System.out.println("[2] : To increase temp");
        System.out.println("[3] : To decrease temp");
        System.out.println("[4] : To change swing");
        System.out.println("[5] : To increase fan speed");
        System.out.println("[6] : To decrease fan speed");

        int nextChoice;
        nextChoice = sc.nextInt();
        if (nextChoice == 1) {
            this.display();
        } else if (nextChoice == 2) {
            this.increaseTemp();
        } else if (nextChoice == 3) {
            this.decreaseTemp();
        } else if (nextChoice == 4) {
            this.changeSwing();
        } else if (nextChoice == 5) {
            this.incrementSpeed();
        } else if (nextChoice == 6) {
            this.decrementSpeed();
        } else {
            System.out.println("Thank You !! Leaving on state function AC ! ");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions on state function AC (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            onStateFunction();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving on state function AC !");
            System.out.println();
        }
    }

    public void changeSwing() {
        if (SwingMode.equals("OFF")) {
            SwingMode = "ON";
        }
    }

    public void incrementSpeed() {
        if (currSpeed <= 4) {
            currSpeed++;
        }
    }

    public void decrementSpeed() {
        if (currSpeed >= 1) {
            currSpeed--;
        }
    }

    public void increaseTemp() {
        Temp++;
    }

    public void decreaseTemp() {
        Temp--;
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {}
}
