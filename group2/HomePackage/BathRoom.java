package com.group2.HomePackage;

import com.group2.AllDevices.*;
import java.util.Scanner;

public abstract class BathRoom extends Room {

    Scanner sc = new Scanner(System.in);

    private Geyser objGeyser;

    private Shower objShower;

    public BathRoom() {
        //System.out.println("Bathroom IN !!");
        System.out.println("Bathroom added !!");
        objGeyser = new Geyser();

        objShower = new Shower();
        //System.out.println("Bathroom OUT !!");
        System.out.println("Devices added in bathroom !!");
    }

    public Geyser getObjGeyser() {
        return objGeyser;
    }

    public Shower getObjShower() {
        return objShower;
    }

    public static void main(String[] args) {}
}
