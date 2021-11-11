package com.group2.HomePackage;

import java.util.Scanner;

public class KidsBathroom extends BathRoom {

    Scanner sc = new Scanner(System.in);

    public KidsBathroom() {
        System.out.println(" Adding Kids bathroom ...");
        System.out.println(" Kids bathroom Added !!");
    }

    public void BathRoomFunctions() {
        System.out.println("|| KIDS BATHROOM FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use geyser");
        System.out.println("[2] : To use Shower ");
        System.out.println("[3] : To use Lights ");

        System.out.println("[4] : To use Door ");
        System.out.println("[5] : To use Blinds ");

        System.out.println("[6] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            getObjGeyser().GeyserFunc();
        } else if (choice == 2) {
            getObjShower().ShowerFunction();
        } else if (choice == 3) {
            //            objLights
            getObjLights().LightFunction();
        } else if (choice == 4) {
            getObjDoor().DoorFunctions();
        } else if (choice == 5) {
            getObjBlinds().BlindFunctions();
        } else {
            System.out.println("Thank You !! Leaving Kids BathRoom !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Kids BathRoom (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            BathRoomFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Kids BathRoom !");
            System.out.println();
        }
    }

    // these three functions are in all the three bathroom
    // but only owner will use them
    // means owner only looks at all the bathrooms whether kid ,his, or guest
    // the control of room is Owner
    // usage by respective
    public void awayFromHomeFeature() {
        getObjGeyser().off();
        getObjBlinds().off();
        getObjLights().off();
        getObjDoor().closeMe();
        getObjShower().off();
    }

    public void backToHomeFeature() {
        getObjLights().on();
    }

    public void SecurityFeature() {
        // display ON and OFF for all
//        System.out.println("Displaying state of all Devices - ");
//        System.out.println();
        // most things off like --> door , geyser , shower , washing machine --> should be off

        // wrt geyser
        int tem = getObjGeyser().getTemp();
        if (tem > 100) {
            System.out.println("High geyser temperature found !!");
            System.out.println("Turning it off ..");
            getObjGeyser().setTemp(40);
            getObjGeyser().off();
            System.out.println("Temperature back to normal !!");
        } else {
            System.out.println("Geyser Temperature is under control !!");
        }
        System.out.println();

        System.out.println("Kids Bathroom security checked !!");
        System.out.println("Everything under control !!");
        System.out.println("");
        
    }

    public static void main(String[] args) {}
}
