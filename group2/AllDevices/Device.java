package com.group2.AllDevices;

public abstract class Device implements Connection {

    public Device() {
        // this public is imp because we are using this is some other packages
        System.out.println("Initializing device constructor ...");
        this.isON = false;
        this.isOFF = true;
        System.out.println("Terminating device constructor !!");
        System.out.println();
    }

    private boolean isON;
    private boolean isOFF;

    public void setON(boolean ON) {
        isON = ON;
        isOFF = !ON;
    }

    public void setOFF(boolean OFF) {
        isOFF = OFF;
        isON = !OFF;
    }

    public boolean isON() {
        return isON;
    }

    public boolean isOFF() {
        return isOFF;
    }

    public void on() {
        if (isON) {
            System.out.println("Device is already ON ...");
        } else {
            // describe the process of ONing
            System.out.println("Device is in process of switching ON ...");

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }

            isON = true;
            isOFF = false;

            System.out.println("Device is ON now ... ");
            System.out.println("You can use your device !!");
            System.out.println();
        }
    }

    public void off() {
        if (isOFF) {
            System.out.println("Device is already OFF !!");
        } else {
            // describe the process of OFF - ing
            System.out.println("Device is in process of switching OFF ...");

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }

            isON = false;
            isOFF = true;
            System.out.println("Device is OFF now !!");
            System.out.println("Thank you for using the device !!");
            System.out.println();
        }
    }

    public static void main(String[] args) {}
}
