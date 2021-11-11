package com.group2.AllDevices;

// door locks --> create class and types using inheritance with extra security and features

import java.util.Scanner;

public class Door extends Device {

    private boolean isOpen;
    private DoorLock objDoorLock;
    Scanner sc = new Scanner(System.in);

    public Door() {
        System.out.println("Initializing Door Constructor ...");
        isOpen = false;

        System.out.println("Adding Door Lock  ...");
        objDoorLock = new DoorLock();
        System.out.println("Door Lock Added !! ");

        System.out.println("Terminating Door Constructor !!");
    }

    public void DoorFunctions() {
        System.out.println("|| DOOR FUNCTIONS || ");
        System.out.println();
        System.out.println("[1] : To check door state (open close)");
        System.out.println("[2] : To open door");
        System.out.println("[3] : To close door");
        System.out.println("[4] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            if (isOpen) {
                System.out.println("Door is open !!");
            } else {
                System.out.println("Door is Close !!");
            }
        } else if (choice == 2) {
            openMe();
        } else if (choice == 3) {
            closeMe();
        } else {
            System.out.println("Thank You !! Leaving door !");
            System.out.println();
            return;
        }

        char ch;
        System.out.println("Do you want to use more functions of door (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            DoorFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving door !");
            System.out.println();
        }
    }

    public void openMe() {
        if (isOpen) {
            System.out.println("Already open !!");
            return;
        }

        System.out.println("Door is opening ... ");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        objDoorLock.openLock();
        isOpen = true;

        System.out.println("Door is opened now !!");
    }

    public void closeMe() {
        if (!isOpen) {
            System.out.println("Already close !!");
            return;
        }
        isOpen = false;
        objDoorLock.LockDoor();
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    // modify open and close : way of asking

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {}
}
