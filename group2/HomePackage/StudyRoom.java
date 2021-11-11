package com.group2.HomePackage;

import com.group2.AllDevices.*;
import com.group2.AllDevices.TvPackage.TV;
import java.util.Scanner;

public class StudyRoom extends Room {

    Scanner sc = new Scanner(System.in);

    private AC objAc;
    private Alarm objAlarm;
    private Fan objFan;
    private Speakers objSpeakers;
    private TV objTV;

    private Calculator objCalculator;

    private FireAlarmSensor objFireAlarmSensor;
    private RoomThermometerThermostats objRoomThermometerThermostats;

    private RoomCamera objRoomCamera;

    public StudyRoom() {
        System.out.println("Adding Study Room ... ");
        System.out.println();

        System.out.println("Adding AC ...");
        objAc = new AC();
        System.out.println("AC added !!");
        System.out.println();

        System.out.println("Adding Alarm ... ");
        objAlarm = new Alarm();
        System.out.println("Alarm added !!");
        System.out.println();

        System.out.println("Adding Fan ... ");
        objFan = new Fan();
        System.out.println("Fan added !!");

        System.out.println("Adding Speakers ... ");
        objSpeakers = new Speakers();
        System.out.println("Speakers added !!");
        System.out.println();

        System.out.println("Adding TV ... ");
        objTV = new TV();
        System.out.println("TV added !!");
        System.out.println();

        System.out.println("Adding FireAlarmSensor ... ");
        objFireAlarmSensor = new FireAlarmSensor();
        System.out.println("FireAlarmSensor added !!");
        System.out.println();

        System.out.println("Adding RoomThermometerThermostats ... ");
        objRoomThermometerThermostats = new RoomThermometerThermostats();
        System.out.println("RoomThermometerThermostats added !! ");
        System.out.println();

        System.out.println("Adding RoomCamera ...");
        objRoomCamera = new RoomCamera();
        System.out.println("RoomCamera added !! ");
        System.out.println();

        System.out.println("Adding calculator ...");
        objCalculator = new Calculator();
        System.out.println("Calculator added !!");
        System.out.println();

        System.out.println("Study Room Added !!");
        System.out.println();
    }

    public void StudyRoomFunctions() {

        System.out.println("|| STUDY ROOM FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use Ac");
        System.out.println("[2] : To use Alarm");
        System.out.println("[3] : To use Fan ");
        System.out.println("[4] : To use Speakers ");
        System.out.println("[5] : To use TV ");
        System.out.println("[6] : To use Door ");
        System.out.println("[7] : To use Lights ");
        System.out.println("[8] : To use Blinds ");

        System.out.println("[9] : To use RoomThermometerThermostats ");
        System.out.println("[10] : To use FireAlarmSensor ");

        System.out.println("[11] : To use RoomCamera");

        System.out.println("[12] : To use Calculator ");

        System.out.println("[13] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            objAc.ACfunc();
        } else if (choice == 2) {
            objAlarm.AlarmFunctions();
        } else if (choice == 3) {
            objFan.FanFunc();
        } else if (choice == 4) {
            objSpeakers.SpeakersFunctions();
        } else if (choice == 5) {
            objTV.AdvTvFunction();
        } else if (choice == 6) {
            getObjDoor().DoorFunctions();
        } else if (choice == 7) {
            getObjLights().LightFunction();
        } else if (choice == 8) {
            getObjBlinds().BlindFunctions();
        } else if (choice == 9) {
            objRoomThermometerThermostats.ThermostatFunc();
        } else if (choice == 10) {
            objFireAlarmSensor.checkTemp(objRoomThermometerThermostats.getTemp());
        } else if (choice == 11) {
            objRoomCamera.RoomCameraFunction();
        } else if (choice == 12) {
            objCalculator.CalculatorFuntion();
        } else {
            System.out.println("Thank You !! Leaving Living room !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Study room (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            StudyRoomFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Study room !");
        }
    }

    public void awayFromHomeFeature() {
        getObjBlinds().off();
        getObjLights().off();
        getObjDoor().closeMe();
        objCalculator.off();
        objAlarm.off();
        objFan.off();
        objRoomCamera.off();
        objSpeakers.off();
        objTV.off();
        objAc.off();

        objRoomThermometerThermostats.on();
        objFireAlarmSensor.on();
    }

    public void backToHomeFeature() {
        getObjLights().on();
        objAlarm.on();

        objAc.on(); // for some time
    }

    public void SecurityFeature() {
        // display ON and OFF for all
//        System.out.println("Displaying state of all Devices - ");
//        System.out.println();
        // most things off like --> door , geyser , shower , washing machine --> should be off

        int tem = objRoomThermometerThermostats.getTemp();
        objFireAlarmSensor.checkTemp(tem);

//        objRoomCamera.showRecording();

        System.out.println("Study Room security checked !!");
        System.out.println("Everything under control !!");
        System.out.println("");

    }

    public static void main(String[] args) {}
}
