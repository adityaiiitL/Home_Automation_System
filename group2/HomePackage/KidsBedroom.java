package com.group2.HomePackage;

public class KidsBedroom extends Bedroom {

    public KidsBedroom() {
        System.out.println("In kid Bed Room constructor !!");
        System.out.println("Out kid Bed Room constructor !!");
    }

    public void BedroomFunctions() {

        System.out.println("|| KIDS BEDROOM FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use Ac");
        System.out.println("[2] : To use Fan ");
        System.out.println("[3] : To use Door ");
        System.out.println("[4] : To use Lights ");
        System.out.println("[5] : To use Blinds ");
        System.out.println("[6] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            getObjAc().ACfunc();
        } else if (choice == 2) {
            getObjFan().FanFunc();
        } else if (choice == 3) {
            getObjDoor().DoorFunctions();
        } else if (choice == 4) {
            //            objLights
            getObjLights().LightFunction();
        } else if (choice == 5) {
            getObjBlinds().BlindFunctions();
        } else {
            System.out.println("Thank You !! Leaving Kids BedRoom !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Kids BedRoom (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            BedroomFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Kids BedRoom !");
        }
    }

    public void awayFromHomeFeature() {
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
        
        System.out.println("Kids Bedroom security checked !!");
        System.out.println("Everything under control !!");
        System.out.println("");
        
    }

    public static void main(String[] args) {}
}
