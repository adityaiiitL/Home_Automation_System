package com.group2.HomePackage;

import com.group2.AllDevices.*;
import com.group2.AllDevices.TvPackage.TV;

public class MasterBedroom extends Bedroom {

    private Alarm objAlarm; // owner only
    private Speakers objSpeakers; // guest and owner
    private TV objTV; // guest and owner

    public MasterBedroom() {
        System.out.println("Adding master bed room ...");
        System.out.println();

        System.out.println("Adding Alarm ... ");
        objAlarm = new Alarm();
        System.out.println("Alarm added !!");
        System.out.println();

        System.out.println("Adding Speakers ... ");
        objSpeakers = new Speakers();
        System.out.println("Speakers added !! ");
        System.out.println();

        System.out.println("Adding TV ...");
        objTV = new TV();
        System.out.println("TV added !!");
        System.out.println();

        System.out.println("Master Bed Room added !!");
        System.out.println();
    }

    public void BedroomFunctions() {
        System.out.println("|| MASTER BEDROOM FUNCTIONS ||");
        System.out.println();

        System.out.println("[1] : To use Ac");
        System.out.println("[2] : To use Alarm");
        System.out.println("[3] : To use Fan ");
        System.out.println("[4] : To use Speakers ");
        System.out.println("[5] : To use TV ");
        System.out.println("[6] : To use Door ");
        System.out.println("[7] : To use Lights ");
        System.out.println("[8] : To use Blinds ");
        System.out.println("[9] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            getObjAc().ACfunc();
        } else if (choice == 2) {
            objAlarm.AlarmFunctions();
        } else if (choice == 3) {
            getObjFan().FanFunc();
        } else if (choice == 4) {
            objSpeakers.SpeakersFunctions();
        } else if (choice == 5) {
            objTV.AdvTvFunction();
        } else if (choice == 6) {
            getObjDoor().DoorFunctions();
        } else if (choice == 7) {
            //            objLights
            getObjLights().LightFunction();
        } else if (choice == 8) {
            getObjBlinds().BlindFunctions();
        } else {
            System.out.println("Thank You !! Leaving Master BedRoom !");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Master BedRoom (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            BedroomFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Master BedRoom !");
        }
    }

    public void awayFromHomeFeature() {
        objAlarm.off();
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
        objAlarm.on();
    }

    public void SecurityFeature() {
        // display ON and OFF for all
//        System.out.println("Displaying state of all Devices - ");
//        System.out.println();
        // most things off like --> door , geyser , shower , washing machine --> should be off

        System.out.println("Master Bedroom security checked !!");
        System.out.println("Everything under control !!");
        System.out.println("");

    }

    public static void main(String[] args) {}
}
