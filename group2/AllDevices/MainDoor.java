package com.group2.AllDevices;

import java.util.Scanner;

public class MainDoor extends Device {

    private boolean isOpen;
    private MainDoorLock objMainDoorLock;
    Scanner sc = new Scanner(System.in);

    public MainDoor() {
        System.out.println("Initializing Main door Constructor ...");

        isOpen = false;
        objMainDoorLock = new MainDoorLock();
        System.out.println("Door Lock Object created !!");

        System.out.println("Terminating Main door Constructor !!");
        System.out.println();
    }

    public void MainDoorFunctions() {
        System.out.println("|| MAIN DOOR FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To check door state (open / close)");
        System.out.println("[2] : To open door");
        System.out.println("[3] : To close door");
        System.out.println("[4] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

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
            System.out.println("Thank You !! Leaving Main Door !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Main door (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            MainDoorFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving main door !");
            System.out.println();
        }
    }

    public void openMe() {
        if (isOpen) {
            System.out.println("Already open !!");
            return;
        }

        objMainDoorLock.tryToOpen();
        if (!objMainDoorLock.getIsLock()) {
            System.out.println("Opening the door ... ");
            isOpen = true;
            System.out.println("Door is open now ...");
        } else {
            System.out.println("Sorry, cannot open the door because Lock is not unlocked !!");
        }
    }

    public void closeMe() {
        if (!isOpen) {
            System.out.println("Already close !!");
            return;
        }

        System.out.println("Closing Door !!");
        isOpen = false;
        objMainDoorLock.LockDoor();
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
