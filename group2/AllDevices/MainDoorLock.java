package com.group2.AllDevices;

import java.util.Scanner;

public class MainDoorLock extends DoorLock {

    private final String password;
    private String acceptedPassword;

    public MainDoorLock() {
        System.out.println("Initializing Main door lock ...");
        password = "AATMAA";
        System.out.println("Terminating main door lock !!");
        System.out.println();
    }

    public void tryToOpen() {
        Scanner sc = new Scanner(System.in);
        int times = 0;

        while (true) {
            System.out.print("Enter the password : ");
            acceptedPassword = sc.next();

            if (acceptedPassword.equals(password)) {
                this.openLock();
                System.out.println("Door Opened Successfully !!");
                break;
            } else {
                System.out.println("Password was not correct !!");
                times++;
            }

            if (times == 5) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println(e);
                }

                char ch;
                System.out.print("Do you want to try again (Y/N) : ");
                ch = sc.next().charAt(0);
                System.out.println();

                if (ch == 'Y' || ch == 'y') {
                    times = 0;
                } else {
                    System.out.println("Thank You !!");
                    System.out.println();
                    break;
                }
            }

            char ch;
            System.out.print("Do you want to try again (Y/N) : ");
            ch = sc.next().charAt(0);
            System.out.println();
            if (ch == 'Y' || ch == 'y') {} else {
                System.out.println("Thank You !!");
                System.out.println();
                break;
            }
        }
    }

    public static void main(String[] args) {}
}
