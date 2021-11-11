package com.group2.AllDevices;

import java.util.Scanner;

public class Lights extends Device {

    Scanner sc = new Scanner(System.in);

    private String color;
    private String intensity;

    private String[] CustomColor = new String[] {
            "Candle Light",
            "Warm Yellow",
            "Bright White Light",
            "Bright Blue-white light",
            "Bright Bluish",
            "Cool White",
    }; // color set

    private String[] SetIntensity = new String[] { "Low", "Medium", "High" }; // intensity set

    public Lights() {
        System.out.println("Initializing Lights Constructor ...");
        this.on();
        this.color = "Cool White";
        this.intensity = "Medium";
        System.out.println("Terminating Lights Constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying Lights current state - ");
        System.out.println();
        System.out.println("Current speed - " + color);
        System.out.println("Current range - " + intensity);
        System.out.println("Current state (ON/OFF) - " + isON());
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public void LightFunction() {
        System.out.println("|| LIGHTS FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To Set Custom Color ");
        System.out.println("[2] : To Set Intensity ");
        System.out.println("[3] : To display current state");
        System.out.println("[4] : To turn it ON");
        System.out.println("[5] : To turn it OFF");
        System.out.println("[6] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            System.out.println("Select one from the given Custom Colors : ");

            int index = 1;
            for (String x : CustomColor) {
                System.out.println(index + " : " + x);
                index++;
            }
            System.out.println();
            int ch;
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            System.out.println();

            color = CustomColor[ch - 1];

            System.out.println("Current Color is set to: " + color);
            System.out.println();

        } else if (choice == 2) {
            System.out.println("Select one from the given Intensities : ");

            int index = 1;
            for (String x : SetIntensity) {
                System.out.println(index + " : " + x);
                index++;
            }

            int ch;
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            System.out.println();

            intensity = SetIntensity[ch - 1];

            System.out.println("Current Intensity is set to : " + intensity);
            System.out.println();
        } else if (choice == 3) {
            this.display();
        } else if (choice == 4) {
            this.on();
        } else if (choice == 5) {
            this.off();
        } else {
            System.out.println("Thank You !! Leaving lights !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Lights (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            LightFunction();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving lights !");
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
