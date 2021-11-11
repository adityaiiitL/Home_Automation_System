package com.group2.AllDevices;

import java.util.Scanner;

public class SolarPanel {

    Scanner sc = new Scanner(System.in);
    private final int powerPerHours;
    private int powerGenerated;

    public SolarPanel() {
        System.out.println("Initializing Solar Panel Constructor ...");
        powerPerHours = 200;
        powerGenerated = 0;
        System.out.println("Terminating Solar Panel Constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying Solar panel current state - ");
        System.out.println();
        System.out.println("Power generated Per Hours - " + powerPerHours);
        System.out.println("Power Generated till now - " + powerGenerated);
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public void SolarPanelFunctions() {
        System.out.println("|| SOLAR PANEL FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To display current state");
        System.out.println("[2] : To Start generating power");
        System.out.println("[3] : Exit");
        System.out.println();
        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            display();
        } else if (choice == 2) {
            storeEnergy();
        } else {
            System.out.println("Thank You !! Leaving solar panel !");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Solar panel (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            SolarPanelFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving solar panel ! ");
            System.out.println();
        }
    }

    public void storeEnergy() {
        int time; // in hours
        System.out.print("Enter the time you want to store the energy : ");
        time = sc.nextInt();
        powerGenerated = powerGenerated + time * powerPerHours;
        System.out.println();

        // sleep
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Power Generated : " + powerGenerated);
        System.out.println();
    }

    public static void main(String[] args) {}
}
