package com.group2.AllDevices;

import java.util.Scanner;

public class RoomThermometerThermostats extends Device {

    Scanner sc = new Scanner(System.in);

    private int temp;
    // convert into sth --> exception check
    private final int max;
    private final int min;

    public RoomThermometerThermostats() {
        System.out.println("Initializing Room Thermometer Thermostats Constructor ...");
        this.on(); // by default on
        temp = 30; // random se +- sth kar dena
        max = 60;
        min = 10;
        System.out.println("Terminating Room Thermometer Thermostats Constructor !!");
    }

    public int getTemp() {
        //        return temp;
        temp = (int) (Math.random() * (max - min + 1) + min);
        return temp;
    }

    public void ThermostatFunc() {
        System.out.println("|| ROOM THERMOSTAT FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To show temp");
        System.out.println("[2] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Temperature of the room : " + getTemp());
            System.out.println();
        } else {
            System.out.println("Thank You !! Leaving Thermostat !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Thermostat (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            ThermostatFunc();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Thermostat !");
            System.out.println();
        }
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }
}
