package com.group2.HomePackage;

import com.group2.AllDevices.*;
import java.util.Scanner;

public abstract class Bedroom extends Room {

    Scanner sc = new Scanner(System.in);

    private AC objAc;

    private Fan objFan;

    public AC getObjAc() {
        return objAc;
    }

    public void setObjAc(AC objAc) {
        this.objAc = objAc;
    }

    public Fan getObjFan() {
        return objFan;
    }

    public void setObjFan(Fan objFan) {
        this.objFan = objFan;
    }

    public Bedroom() {
        //System.out.println("In BED Room constructor !!");
        System.out.println("Bed Room added !!");
        System.out.println();

        System.out.println("Bed Room --> Adding AC ...");
        objAc = new AC();
        System.out.println("Bed Room --> AC added successfully !! ");
        System.out.println();



        System.out.println("Bed Room --> adding fan ...");
        objFan = new Fan();
        System.out.println("Bed Room --> Fan added successfully !! ");
        System.out.println();


        //System.out.println("Out Bed Room constructor !!");
        System.out.println("Devices added in Bed room !!");
        System.out.println();
    }

    public static void main(String[] args) {}
}
