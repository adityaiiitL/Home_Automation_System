package com.group2.AllDevices;

import java.util.ArrayList;
import java.util.Scanner;

public class Alarm extends Device {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> times = new ArrayList<String>();

    public Alarm() {
        System.out.println("Initializing alarm constructor ...");
        System.out.println("Terminating alarm constructor !!");
        System.out.println();
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public void setTime() {
        String time;

        System.out.print("Enter the time : ");
        time = sc.next();
        times.add(time);
        System.out.println();
    }

    public void displayTimes() {
        System.out.println("Timing of alarm : ");
        for (String x : times) {
            System.out.println(x);
        }
    }

    public void AlarmFunctions() {
        System.out.println("|| ALARM FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To Set Alarm Time");
        System.out.println("[2] : To show alarm timings Time");
        System.out.println("[3] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            setTime();
        } else if (choice == 2) {
            displayTimes();
        } else {
            System.out.println("Thank You !! Leaving alarm !");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of alarm (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            AlarmFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving alarm !");
            System.out.println();
        }
    }

    public static void main(String[] args) {}
}
