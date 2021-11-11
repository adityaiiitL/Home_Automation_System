package com.group2.HomePackage;

import com.group2.AllDevices.*;
import java.util.Scanner;

public class Garden {

    Scanner sc = new Scanner(System.in);
    private LawnMower objLawnMower;
    private Sprinkler objSprinkler;
    private Lights objLights;

    public Garden() {
        System.out.println("Adding LawnMower ...");
        objLawnMower = new LawnMower();
        System.out.println("LawnMower added !!");
        System.out.println();

        System.out.println("Adding Sprinkler ...");
        objSprinkler = new Sprinkler();
        System.out.println("Sprinkler added !!");
        System.out.println();

        System.out.println("Adding Lights ...");
        objLights = new Lights();
        System.out.println("Lights added!!");
        System.out.println();
    }

    public void GardenFunctions() {
        System.out.println("|| GARDEN FUNCTIONS ||");

        System.out.println();
        System.out.println("[1] : To use Lawn mower");
        System.out.println("[2] : To use sprinkler");
        System.out.println("[3] : To use lights");
        System.out.println("[4] : Exit");

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            objLawnMower.LawnMowerFunc();
        } else if (choice == 2) {
            objSprinkler.SprinklerFunc();
        } else if (choice == 3) {
            objLights.LightFunction();
        } else {
            System.out.println("Thank You !! Leaving Garden to use existing functions");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions on Garden (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            GardenFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Garden to use existing functions !");
            System.out.println();
        }
    }

    public static void main(String[] args) {}
}
