package com.group2.HomePackage;

import com.group2.AllDevices.*;
import java.util.Scanner;

public class ParkingArea {

    Scanner sc = new Scanner(System.in);

    private Washer objWasher;
    private Lights objLights;
    private CarCharger objCarCharger;

    public ParkingArea() {
        System.out.println("Adding Washer ...");
        objWasher = new Washer();
        System.out.println("Washer added !!");
        System.out.println();

        System.out.println("Adding Lights ...");
        objLights = new Lights();
        System.out.println("Lights added !!");
        System.out.println();

        System.out.println("Adding CarCharger ...");
        objCarCharger = new CarCharger();
        System.out.println("CarCharger added !! ");
        System.out.println();
    }

    public void ParkingAreaFunctions() {
        System.out.println("|| PARKING AREA FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use Washer");
        System.out.println("[2] : To use CarCharger to charge");
        System.out.println("[3] : To use lights");
        System.out.println("[4] : Exit");
        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objWasher.objWasherFunc();
        } else if (choice == 2) {
            objCarCharger.objCarChargerFunc();
        } else if (choice == 3) {
            objLights.LightFunction();
        } else {
            System.out.println("Thank You !! Leaving Parking area to use existing functions !");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Parking area (Y/N) : ");
        System.out.println();
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            ParkingAreaFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Parking area to use existing functions !");
            System.out.println();
        }
    }

    public static void main(String[] args) {}
}
