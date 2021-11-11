package com.group2.AllDevices;

import java.util.Scanner;

public class RoomCamera extends Device {

    Scanner sc = new Scanner(System.in);

    public String angle; // int

    public RoomCamera() {
        System.out.println("Initializing Room Camera ...");
        this.angle = "45 degree";
        this.on(); // start recording by default
        System.out.println("Terminating Room Camera !!");
        System.out.println();
    }

    public void RoomCameraFunction() {
        System.out.println("|| ROOM CAMERA FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To Show Recording"); // auto off
        System.out.println("[2] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            showRecording();
        } else {
            System.out.println("Thank You !! Leaving Room Camera !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Camera (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            RoomCameraFunction();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Camera !");
        }
    }

    public void showRecording() {
        System.out.println("Showing ..... ");
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }
}
