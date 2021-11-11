package com.group2.HomePackage;

import com.group2.AllDevices.*;

public abstract class Room {

    private Door objDoor;
    private Lights objLights;
    private Blinds objBlinds;

    public Door getObjDoor() {
        return objDoor;
    }

    public void setObjDoor(Door objDoor) {
        this.objDoor = objDoor;
    }

    public Lights getObjLights() {
        return objLights;
    }

    public void setObjLights(Lights objLights) {
        this.objLights = objLights;
    }

    public Blinds getObjBlinds() {
        return objBlinds;
    }

    public void setObjBlinds(Blinds objBlinds) {
        this.objBlinds = objBlinds;
    }

    public Room() {
        System.out.println("Initiating room constructor ...");
        System.out.println();

        System.out.println("Door start ...");
        objDoor = new Door();
        System.out.println("Door end !!");
        System.out.println();

        System.out.println("Lights start ...");
        objLights = new Lights();
        System.out.println("Lights end !!");
        System.out.println();

        System.out.println("Blinds start ...");
        objBlinds = new Blinds();
        System.out.println("Blinds end !!");
        System.out.println();

        System.out.println("Completing room construction !!");
        System.out.println();
    }

    public abstract void awayFromHomeFeature();

    public abstract void backToHomeFeature();

    public abstract void SecurityFeature();

    public static void main(String[] args) {}
}
