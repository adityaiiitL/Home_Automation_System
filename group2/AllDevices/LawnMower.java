package com.group2.AllDevices;

import java.util.Scanner;

public class LawnMower extends Device {

    //On Off

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    // Grasslevel
    // Speed

    Scanner sc = new Scanner(System.in);

    private int currSpeed;
    private String currMode;
    private int[] speed = new int[] { 10, 20, 30 };
    private String[] GrassMode = new String[] {"CleanGrass", "Medium Shredding", "SimpleCutting",};

    public LawnMower() {
        System.out.println("Initializing Lawn Mower Constructor ...");
        currSpeed = 10;
        currMode = "CleanGrass";
        System.out.println("Terminating Lawn Mower Constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying LawnMover Current State - ");
        System.out.println();
        System.out.println("Current speed - " + currSpeed);
        System.out.println("Current mode - " + currMode);
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public void LawnMowerFunc() {
        System.out.println("|| LAWN MOWER FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To set speed");
        System.out.println("[2] : To set GrassMode");
        System.out.println("[3] : To display current state");
        System.out.println("[4] : To turn it ON");
        System.out.println("[5] : To turn it OFF");
        System.out.println("[6] ; Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            this.SetSpeed();
        } else if (choice == 2) {
            this.SetGrassMode();
        } else if (choice == 3) {
            this.display();
        } else if (choice == 4) {
            this.on();
        } else if (choice == 5) {
            this.off();
        } else {
            System.out.println("Thank You !! Leaving Lawn Mower to Garden !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Lawn Mower (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            LawnMowerFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Lawn Mower to Garden !");
            System.out.println();
        }
    }

    public void SetSpeed() {
        System.out.println("Select speed to set : ");

        int index = 1;
        for (int x : speed) {
            System.out.println(index + " : " + x);
            index++;
        }
        System.out.println();

        int ch;
        System.out.print("Enter your choice : ");
        ch = sc.nextInt();
        System.out.println();
        currSpeed = speed[ch - 1];

        System.out.println("Current Speed changed to : " + currSpeed);
        //
        //        // sleep
        //        try{
        //            Thread.sleep(1000);
        //        }
        //        catch (Exception e){
        //            System.out.println(e);
        //        }
        //
        //        this.off();

        System.out.println("Speed is set successfully! ");
        System.out.println();
    }

    public void SetGrassMode() {
        System.out.println("Select grass mode to set : ");

        int index = 1;
        for (String x : GrassMode) {
            System.out.println(index + " : " + x);
            index++;
        }
        System.out.println();
        int ch;
        System.out.print("Enter your choice : ");
        ch = sc.nextInt();
        System.out.println();

        currMode = GrassMode[ch - 1];

        System.out.println("Current Speed : " + currMode);

        //        // sl
        //        try{
        //            Thread.sleep(1000);
        //        }
        //        catch (Exception e){
        //            System.out.println(e);
        //        }
        //
        //        this.off();

        System.out.println("Grass Mode is set successfully! ");
        System.out.println();
    }
}
