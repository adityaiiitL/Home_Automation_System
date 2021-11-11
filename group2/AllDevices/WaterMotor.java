package com.group2.AllDevices;

import java.util.Scanner;

public class WaterMotor {

    Scanner sc = new Scanner(System.in);

    public WaterMotor() {
        System.out.println("Initializing Water Motor constructor ... ");
        System.out.println("Terminated water motor constructor !!");
        System.out.println();
    }

    public void runMotor(WaterTank obj) {
        System.out.println("Before starting motor - ");
        obj.display();

        System.out.println("Enter the new level (0-100) : ");
        int newLevel = sc.nextInt();

        System.out.println("Starting motor ...");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        obj.setCurrLevel(newLevel);

        System.out.println("Turning off motor ... ");

        System.out.println("New Level set to " + obj.getCurrLevel());
        System.out.println("After starting motor - ");
        System.out.println();
        obj.display();
    }

    public static void main(String[] args) {}
}
