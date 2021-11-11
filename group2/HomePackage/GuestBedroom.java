package com.group2.HomePackage;

import com.group2.AllDevices.Speakers;
import com.group2.AllDevices.TvPackage.TV;

public class GuestBedroom extends Bedroom {

    private Speakers objSpeakers; // guest and owner
    private TV objTV; // guest and owner

    public GuestBedroom() {
        System.out.println("Adding guest bedroom ...");
        System.out.println();

        System.out.println("Adding Speakers ... ");
        objSpeakers = new Speakers();
        System.out.println("Speakers added !! ");
        System.out.println();

        System.out.println("Adding TV ...");
        objTV = new TV();
        System.out.println("TV added !!");
        System.out.println();

        System.out.println("Guest Bedroom added !!");
    }

    public void BedroomFunctions() {
        System.out.println("|| GUEST BEDROOM FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use Ac");
        System.out.println("[2] : To use Fan ");
        System.out.println("[3] : To use Speakers ");
        System.out.println("[4] : To use TV ");
        System.out.println("[5] : To use Door ");
        System.out.println("[6] : To use Lights ");
        System.out.println("[7] : To use Blinds ");
        System.out.println("[8] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            getObjAc().ACfunc();
        } else if (choice == 2) {
            getObjFan().FanFunc();
        } else if (choice == 3) {
            objSpeakers.SpeakersFunctions();
        } else if (choice == 4) {
            objTV.AdvTvFunction();
        } else if (choice == 5) {
            getObjDoor().DoorFunctions();
        } else if (choice == 6) {
            //            objLights
            getObjLights().LightFunction();
        } else if (choice == 7) {
            getObjBlinds().BlindFunctions();
        } else {
            System.out.println("Thank You !! Leaving Guest BedRoom !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Guest BedRoom (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            BedroomFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Guest BedRoom !");
            System.out.println();
        }
    }

    public void awayFromHomeFeature() {
        objSpeakers.off();
        objTV.off();
        getObjFan().off();
        getObjLights().off();
        getObjAc().off();
        getObjBlinds().off();
        getObjDoor().off();
    }

    public void backToHomeFeature() {
        getObjLights().on();
        getObjAc().on(); // for few time --> then off
    }

    public void SecurityFeature() {
        // display ON and OFF for all
//        System.out.println("Displaying state of all Devices - ");
//        System.out.println();
        // most things off like --> door , geyser , shower , washing machine --> should be off
        System.out.println("Guest Bedroom security checked !!");
        System.out.println("Everything under control !!");
        System.out.println("");
    }

    public static void main(String[] args) {}
}
