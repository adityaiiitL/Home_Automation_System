package com.group2.HomePackage;

import com.group2.AllDevices.*;
import java.util.Scanner;

class Thread1 extends Thread {

    private Fridge refFridge;

    public Thread1(Fridge refFridge) {
        this.refFridge = refFridge;
    }

    public void run() {
        refFridge.change(-1);
    }
}

class Thread2 extends Thread {

    private Fridge refFridge;

    public Thread2(Fridge refFridge) {
        this.refFridge = refFridge;
    }

    public void run() {
        refFridge.change(1);
    }
}

public class Kitchen extends Room {

    Scanner sc = new Scanner(System.in);

    private Fridge objFridge;
    private Geyser objGeyser;
    private oven objOven;

    private FireAlarmSensor objFireAlarmSensor;
    private RoomThermometerThermostats objRoomThermometerThermostats;
    private ExhaustFan objExhaustFan;

    private RoomCamera objRoomCamera;

    public Kitchen() {
        System.out.println("Kichen in");

        System.out.println("Adding fridge ");
        objFridge = new Fridge();
        System.out.println("Added fridge ");

        System.out.println("Adding gyeser ");
        objGeyser = new Geyser();
        System.out.println("Added geyser  ");

        System.out.println("Adding oven ");
        objOven = new oven();
        System.out.println("Added oven ");

        System.out.println("-> FireAlarmSensor adding in ");
        objFireAlarmSensor = new FireAlarmSensor();
        System.out.println(" --> FireAlarmSensor adding out ");

        System.out.println(" --> RoomThermometerThermostats adding in ");
        objRoomThermometerThermostats = new RoomThermometerThermostats();
        System.out.println(" --> RoomThermometerThermostats adding out ");

        System.out.println(" --> RoomCamera adding in ");
        objRoomCamera = new RoomCamera();
        System.out.println(" --> RoomCamera adding out ");

        System.out.println("Exhaust adding");
        objExhaustFan = new ExhaustFan();
        System.out.println("Exhaust adding done");

        System.out.println("Kitchen out");
    }

    public void KitchenFunctions() {
        System.out.println("|| KITCHEN ||");
        System.out.println();
        System.out.println("[1] : To use ExhaustFan ");
        System.out.println("[2] : To use Door ");
        System.out.println("[3] : To use Lights ");
        System.out.println("[4] : To use Blinds ");

        System.out.println("[5] : To use geyser ");
        System.out.println("[6] : To use oven ");
        System.out.println("[7] : To use fridge ");
        System.out.println("[8] : To use RoomThermometerThermostats ");
        System.out.println("[9] : To use FireAlarmSensor");
        System.out.println("[10] : To use RoomCamera");

        System.out.println("[11] : To use Geyser and Fridge together");
        System.out.println("[12] : To use Geyser and Oven together");
        System.out.println("[13] : To use Oven and Fridge together");

        System.out.println("[14] : To maintain optimum temperature of fridge ");// done using synchronization

        System.out.println("[15] : To exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            objExhaustFan.ExhaustFanFunc();
        } else if (choice == 2) {
            getObjDoor().DoorFunctions();
        } else if (choice == 3) {
            getObjLights().LightFunction();
        } else if (choice == 4) {
            getObjBlinds().BlindFunctions();
        } else if (choice == 5) {
            objGeyser.GeyserFunc();
        } else if (choice == 6) {
            objOven.OvenFunc();
        } else if (choice == 7) {
            objFridge.FridgeFun();
        } else if (choice == 8) {
            objRoomThermometerThermostats.ThermostatFunc();
        } else if (choice == 9) {
            objFireAlarmSensor.checkTemp(objRoomThermometerThermostats.getTemp());
        } else if (choice == 10) {
            objRoomCamera.RoomCameraFunction();
        } else if (choice == 11) {
            multiGeyserFridge();
        } else if (choice == 12) {
            multiGeyserOven();
        } else if (choice == 13) {
            multiFridgeOven();
        } else if (choice == 14) {
            synchronizedFridge();
        } else {
            System.out.println("Thank You !! Leaving Kitchen !");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Kitchen (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            KitchenFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Kitchen !");
        }
    }

    public void synchronizedFridge() {
        System.out.println("Maintaining optimum temperature of Fridge !!");

        Thread1 objThread1 = new Thread1(objFridge);

        Thread2 objThread2 = new Thread2(objFridge);

        objThread1.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        objThread2.start();

        try {
            objThread1.join();
            objThread2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Maintained temperature !!");
    }

    public void multiGeyserFridge() {
        Thread t1 = new Thread(objGeyser);
        Thread t2 = new Thread(objFridge);

        System.out.println("Geyser started running !!");
        System.out.println("Fridge started running !!");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Geyser finished running !!");
        System.out.println("Fridge finished running !!");
    }

    public void multiGeyserOven() {
        Thread t1 = new Thread(objGeyser);
        Thread t2 = new Thread(objOven);

        System.out.println("Geyser started running !!");
        System.out.println("Oven started running !!");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Geyser finished running !!");
        System.out.println("Oven finished running !!");
    }

    public void multiFridgeOven() {
        Thread t1 = new Thread(objFridge);
        Thread t2 = new Thread(objOven);

        System.out.println("Fridge started running !!");
        System.out.println("Oven started running !!");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Fridge finished running !!");
        System.out.println("Oven finished running !!");
    }

    public void awayFromHomeFeature() {
        getObjBlinds().off();
        getObjLights().off();
        getObjDoor().closeMe();

        objOven.off();
        objGeyser.off();
        objExhaustFan.off();
        objFridge.off();

        objRoomThermometerThermostats.on();
        objFireAlarmSensor.on();
    }

    public void backToHomeFeature() {
        getObjLights().on();
        objExhaustFan.on();
    }

    public void SecurityFeature() {
        // display ON and OFF for all
//        System.out.println("Displaying state of all Devices - ");
//        System.out.println();
        // most things off like --> door , geyser , shower , washing machine --> should be off

        int tem = objRoomThermometerThermostats.getTemp();
        objFireAlarmSensor.checkTemp(tem);

//        objRoomCamera.showRecording();
        System.out.println("Kitchen security checked !!");
        System.out.println("Everything under control !!");
        System.out.println("");
        
    }

    public static void main(String[] args) {}
}
