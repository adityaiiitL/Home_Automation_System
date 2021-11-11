package com.group2.AllDevices;

import java.util.Scanner;

public class Shower extends Device {

    Scanner sc = new Scanner(System.in);

    private String waterState; // cold hot

    public Shower() { // constructor should be public
        System.out.println("Initializing Shower Constructor ...");
        this.waterState = "Cold";
        System.out.println("Terminating Shower Constructor !!");
    }

    public void ShowerFunction() {
        System.out.println("|| SHOWER FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To switch ON ");
        System.out.println("[2] : To switch OFF ");
        System.out.println("[3] : To change water state ");
        System.out.println("[4] : Exit ");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            this.on();
        } else if (choice == 2) {
            this.off();
        } else if (choice == 3) {
            System.out.println("Do you want hot or warm water ?");
            System.out.println();
            System.out.println("[1] : Hot Water");
            System.out.println("[2] : Cold Water");
            System.out.println();
            int ch;
            ch = sc.nextInt();
            System.out.println();

            if (ch == 1) {
                waterState = "Hot";
            } else if (ch == 2) {
                waterState = "Cold";
            }
        } else {
            System.out.println("Thank You !! Leaving shower !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of shower (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            ShowerFunction();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving shower !");
            System.out.println();
        }
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {
        System.out.println("Press 1 to switch shower ON ");
    }
}
