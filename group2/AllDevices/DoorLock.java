package com.group2.AllDevices;

public class DoorLock extends Device {

    private boolean isLock;

    public boolean getIsLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public DoorLock() {
        System.out.println("Initializing Door Constructor ...");
        isLock = true;
        System.out.println("Terminating Door Constructor !!");
        System.out.println();
    }

    public void LockDoor() {
        isLock = true; // check already or not
    }

    public void openLock() {
        isLock = false;
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {}
}
