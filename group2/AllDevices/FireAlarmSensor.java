package com.group2.AllDevices;

public class FireAlarmSensor extends Device {

    // check temperature from thermostat
    // if greater than the limit then ..... function

    final int MAX_TEMP;

    public FireAlarmSensor() {
        System.out.println("Initializing Fire Alarm System Constructor ...");
        MAX_TEMP = 50;
        this.on(); // by default on
        System.out.println("Terminating Fire Alarm System Constructor !!");
        System.out.println();
    }

    public void ringAlarm() {
        System.out.println("EMERGENCY !!!");
        System.out.println("RING ALARM !!!");
        System.out.println();
    }

    public void controlTemp() {
        System.out.println("Working on temperature control !!!");
        // sleep

        System.out.println("Temperature under control !!!");
        System.out.println();
        System.out.println();
    }

    // permanent sensor ON
    // no disable feature

    // 1 function to check temp >
    public void checkTemp(int tem) {
        if (tem > MAX_TEMP) {
            System.out.println("High temperature !!");
            ringAlarm();
            controlTemp();
        } else {
            System.out.println("Temperature is under control !!");
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
