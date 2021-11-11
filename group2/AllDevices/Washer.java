package com.group2.AllDevices;

import java.util.Scanner;

public class Washer extends Device {

    Scanner sc = new Scanner(System.in);

    public Washer() {
        System.out.println("Initializing washer constructor ...");
        System.out.println("Terminating washer constructor !!");
    }

    public void wash(String vehicle) {
        System.out.println("Starting to wash " + vehicle + "...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Alarm : about to finish !!");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(vehicle + " washed successfully !! ");
        System.out.println(vehicle + " ready for a ride !!");
    }

    public void objWasherFunc() {
        System.out.println("|| CAR WASHER FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To wash Car ");
        System.out.println("[2] : To wash Bike ");
        System.out.println("[3] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            wash("Car");
        } else if (choice == 2) {
            wash("Bike");
        } else {
            System.out.println("Thank You !! Leaving Washer !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of washer (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            objWasherFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving washer ! ");
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
