package com.group2.AllDevices;

import java.util.Scanner;

public class Sprinkler extends Device {

    Scanner sc = new Scanner(System.in);

    // function
    private float speed;
    private float[] speedselect = new float[] { 1, 2, 2.5f, 3, 3.5f, 4, 4.5f, 5 };

    private int range;
    private int[] rangeselect = new int[] { 10, 20, 30, 40, 50 };

    public Sprinkler() {
        System.out.println("Initializing Sprinklers constructor ...");
        speed = 2f;
        range = 30;
        System.out.println("Terminating Sprinklers constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying Sprinkler current state - ");
        System.out.println();
        System.out.println("Current speed - " + speed);
        System.out.println("Current range - " + range);
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public void setSpeed() {
        System.out.println("Select speed to set : ");

        int index = 1;
        for (float x : speedselect) {
            System.out.println(index + " : " + x);
            index++;
        }

        int ch;
        System.out.print("Enter your choice : ");
        ch = sc.nextInt();
        System.out.println();

        speed = speedselect[ch - 1];

        System.out.println("Current Speed changed to : " + speed);

        System.out.println("Speed is set successfully! ");
        System.out.println();
    }

    public float getSpeed() {
        return speed;
    }

    public void setRange() {
        System.out.println("Select speed to set : ");

        int index = 1;
        for (int x : rangeselect) {
            System.out.println(index + " : " + x);
            index++;
        }

        int ch;
        System.out.print("Enter your choice : ");
        ch = sc.nextInt();
        System.out.println();

        range = rangeselect[ch - 1];

        System.out.println("Current Speed changed to : " + range);

        System.out.println("Speed is set successfully! ");
        System.out.println();
    }

    public int getRange() {
        return range;
    }

    public void SprinklerFunc() {
        System.out.println("|| SPRINKLER FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To set speed ");
        System.out.println("[2] : To set range");
        System.out.println("[3] : To display current state ");
        System.out.println("[4] : To turn it ON");
        System.out.println("[5] : To turn it OFF");
        System.out.println("[6] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            setSpeed();
        } else if (choice == 2) {
            setRange();
        } else if (choice == 3) {
            this.display();
        } else if (choice == 4) {
            this.on();
        } else if (choice == 5) {
            this.off();
        } else {
            System.out.println("Thank You !! Leaving Sprinklers !! ");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Sprinklers (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            SprinklerFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Sprinklers ! ");
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
