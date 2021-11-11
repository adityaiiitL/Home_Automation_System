package com.group2.AllDevices;

import java.util.Scanner;

public class Geyser extends Device implements Runnable {

    Scanner sc = new Scanner(System.in);

    private int temp;

    public Geyser() {
        System.out.println("Initializing Geyser Constructor ...");
        temp = 40;
        System.out.println("Terminating Geyser Constructor !!");
        System.out.println();
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + " Geyser is running ... ");
        }
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void GeyserFunc() {
        System.out.println("|| GEYSER FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use geyser !!");
        System.out.println("[2] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the temperature : ");
            temp = sc.nextInt();
            System.out.println();
            this.on();

            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("Ring Alarm ... close to given " + temp);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("Temperature set to : " + temp);

            this.off();
        } else {
            System.out.println("Thank You !! Leaving geyser !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of geyser (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            GeyserFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving geyser !");
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
