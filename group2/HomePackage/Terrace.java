package com.group2.HomePackage;

import com.group2.AllDevices.*;
import java.util.Scanner;

public class Terrace {

    Scanner sc = new Scanner(System.in);

    private SolarPanel objSolarPanel;
    private WaterTank objWaterTank;
    private WaterMotor objWaterMotor;
    private Lights objLights;

    public Terrace() {
        System.out.println("Adding SolarPanel ...");
        objSolarPanel = new SolarPanel();
        System.out.println("SolarPanel added !! ");
        System.out.println();

        System.out.println("Adding WaterTank ...");
        objWaterTank = new WaterTank();
        System.out.println("WaterTank added !! ");
        System.out.println();

        System.out.println("Adding WaterMotor ... ");
        objWaterMotor = new WaterMotor();
        System.out.println("WaterMotor Added !!");
        System.out.println();

        System.out.println("Adding Lights ...");
        objLights = new Lights();
        System.out.println("Lights Added !!");
        System.out.println();
    }

    public void TerraceFunctions() {
        System.out.println("|| TERRACE FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use Solar Panel ");
        System.out.println("[2] : To run Water Motor to increase Water level in Water Tank");
        System.out.println("[3] : To use lights");
        System.out.println("[4] : Exit ");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            objSolarPanel.SolarPanelFunctions();
        } else if (choice == 2) {
            objWaterMotor.runMotor(objWaterTank);
        } else if (choice == 3) {
            objLights.LightFunction();
        } else {
            System.out.println("Thank You !! Leaving Terrace to use existing functions !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of terrace (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            TerraceFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving terrace to use existing functions !");
        }
    }

    public static void main(String[] args) {}
}
