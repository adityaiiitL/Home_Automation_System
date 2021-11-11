package com.group2.AllDevices;

public class CarCharger extends Device {

    public CarCharger() {
        System.out.println("Initializing Car Charger Constructor ...");
        System.out.println("Terminating car Charger Constructor !!");
    }

    public void objCarChargerFunc() {
        System.out.println("Start charging ...");
        System.out.println("Please wait while car is charging ...");
        System.out.println();

        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Stopping charging ...");
        System.out.println("Device charged and can be used !!");
        System.out.println();
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {}
}
