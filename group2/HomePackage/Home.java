package com.group2.HomePackage;

import com.group2.AllDevices.*;
import java.util.Scanner;

public class Home {

    Scanner sc = new Scanner(System.in);

    private String homeName;
    private int homeID;

    public int getHomeID() {
        return homeID;
    }

    public void setHomeID(int homeID) {
        this.homeID = homeID;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    private Garden garden1;
    private ParkingArea parkingArea1;
    private Terrace terrace1;

    private MasterBathroom objMasterBathroom;
    private GuestBathroom objGuestBathroom;
    private KidsBathroom objKidsBathroom;

    private MasterBedroom objMasterBedroom;
    private GuestBedroom objGuestBedroom;
    private KidsBedroom objKidsBedroom;

    private LivingRoom objLivingRoom;
    private Kitchen objKitchen;

    private StudyRoom objStudyRoom;

    private MainDoor objMainDoor;

    public void constructHome() {
        System.out.println("Starting to add rooms and respective devices to the system ... ");
        System.out.println();
        System.out.println("Please Wait !! This may take some time !");
        // basically starting the home construction
        System.out.println();

        System.out.println("Adding Living Room to the home ...");
        addLivingRoom();
        System.out.println("Living Room Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding Garden to the home ...");
        addGarden();
        System.out.println("Garden Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding Parking Area to the home ...");
        addParkingArea();
        System.out.println("Parking Area Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding Terrace to the home ...");
        addTerrace();
        System.out.println("Terrace Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding MasterBathroom to the home ...   ");
        addMasterBathroom();
        System.out.println("MasterBathroom Added !! ");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding GuestBathroom to the home ...");
        addGuestBathroom();
        System.out.println("GuestBathroom Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding KidsBathroom to the home ...");
        addKidsBathroom();
        System.out.println("KidsBathroom Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding master Bedroom to the home ...");
        addMasterBedroom();
        System.out.println("Master Bedroom Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding guest Bedroom to the home ...");
        addGuestBedroom();
        System.out.println("Guest Bedroom Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding kids Bedroom to the home ...");
        addKidsBedroom();
        System.out.println("Kids Bedroom Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding kitchen to the home ...");
        addKitchen();
        System.out.println("Kitchen Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding study room to the home ...");
        addStudyRoom();
        System.out.println("Study Room Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Adding main door to the home ... ");
        addMainDoor();
        System.out.println("Main Door Added !!");
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Completed adding rooms !! ");
        System.out.println();
    }

    public void addMainDoor() {
        objMainDoor = new MainDoor();
        System.out.println("Main Door Added successfully !!");
    }

    public void addGarden() {
        garden1 = new Garden();
        System.out.println("Garden Added successfully !!");
    }

    public void addTerrace() {
        terrace1 = new Terrace();
        System.out.println("Terrace Added successfully !!");
    }

    public void addParkingArea() {
        parkingArea1 = new ParkingArea();
        System.out.println("ParkingArea Added successfully !!");
    }

    public void addMasterBathroom() {
        objMasterBathroom = new MasterBathroom();
        System.out.println("MasterBathroom Added successfully !!");
    }

    public void addGuestBathroom() {
        objGuestBathroom = new GuestBathroom();
        System.out.println("Guest bathroom Added successfully !!");
    }

    public void addKidsBathroom() {
        objKidsBathroom = new KidsBathroom();
        System.out.println("KidsBathroom Added successfully !!");
    }

    public void addMasterBedroom() {
        objMasterBedroom = new MasterBedroom();
        System.out.println("MasterBedRoom Added successfully !!");
    }

    public void addGuestBedroom() {
        objGuestBedroom = new GuestBedroom();
        System.out.println("GuestBedRoom Added successfully !!");
    }

    public void addKidsBedroom() {
        objKidsBedroom = new KidsBedroom();
        System.out.println("KidsBedRoom Added successfully !!");
    }

    public void addLivingRoom() {
        objLivingRoom = new LivingRoom();
        System.out.println("Living room Added successfully !!");
    }

    public void addKitchen() {
        objKitchen = new Kitchen();
        System.out.println("Kitchen Added successfully !!");
    }

    public void addStudyRoom() {
        objStudyRoom = new StudyRoom();
        System.out.println("Study Room Added successfully !!");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }


    public void useExistingFunctionOwner() {
        System.out.println("You can use your Home Functions !!");

        System.out.println("|| OWNER FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use Garden ");
        System.out.println("[2] : To use Terrace ");
        System.out.println("[3] : To use Parking-Area ");
        System.out.println("[4] : To use Main-Door ");
        System.out.println("[5] : To use Master-Bedroom ");
        System.out.println("[6] : To use Master-Bathroom");
        System.out.println("[7] : To use Living-Room ");
        System.out.println("[8] : To use  Kitchen");

        System.out.println();
        System.out.println("SPECIAL FEATURES - ");
        System.out.println();
        System.out.println("[9] : To enable Away-From-Home feature");
        System.out.println("[10] : To Enable Back-To-Home feature");
        System.out.println("[11] : To check security of the home feature");

        System.out.println("[12] : Exit");
        System.out.println();
        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            System.out.println("Using garden functions !!");
            System.out.println();
            garden1.GardenFunctions();
        } else if (choice == 2) {
            System.out.println("Using Terrace functions !!");
            System.out.println();
            terrace1.TerraceFunctions();
        } else if (choice == 3) {
            System.out.println("Using ParkingArea functions !!");
            System.out.println();
            parkingArea1.ParkingAreaFunctions();
        } else if (choice == 4) {
            System.out.println("Using MainDoor functions !!");
            System.out.println();
            objMainDoor.MainDoorFunctions();
        } else if (choice == 5) {
            System.out.println("Using MasterBedroom functions !!");
            System.out.println();
            objMasterBedroom.BedroomFunctions();
        } else if (choice == 6) {
            System.out.println("Using MasterBathroom functions !!");
            System.out.println();
            objMasterBathroom.BathRoomFunctions();
        } else if (choice == 7) {
            System.out.println("Using LivingRoom functions !!");
            System.out.println();
            objLivingRoom.LivingRoomFunctions();
        } else if (choice == 8) {
            System.out.println("Using Kitchen functions !!");
            System.out.println();
            objKitchen.KitchenFunctions();
        } else if (choice == 9) {
            System.out.println("Enabling AwayFromHome function !!");
            System.out.println();
            enableAwayFromHome();
        } else if (choice == 10) {
            System.out.println("Enabling BackToHome function !!");
            System.out.println();
            enableBackToHome();
        } else if (choice == 11) {
            System.out.println("Using check Security function !!");
            // whether doors are locked and temperature is okay!!
            System.out.println();
            checkSecurity();
        } else {
            //System.out.println("Thank you !! Leaving use existing home --> Current Owner functions ");
            System.out.println("Thank you !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Current Home (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            // System.out.println("YES !!");
            useExistingFunctionOwner();
        } else {
            // System.out.println("NO !!");
            //System.out.println("Thank you !! Leaving use existing home --> Current Owner functions");
            System.out.println("Thank you !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Existing Home functions !!");
            System.out.println();
            System.out.println("----------------------------------");
        }
    }

    public void useExistingFunctionGuest() {
        System.out.println("|| GUEST FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use garden ");
        System.out.println("[2] : To use Main Door ");
        System.out.println("[3] : To use guest bedroom ");
        System.out.println("[4] : To use guest bathroom ");
        System.out.println("[5] : To use living room ");
        System.out.println("[6] : To use Kitchen");
        System.out.println();
        System.out.println("[7] : Exit");
        System.out.println();


        int choice;
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            garden1.GardenFunctions();
        } else if (choice == 2) {
            objMainDoor.MainDoorFunctions();
        } else if (choice == 3) {
            objGuestBedroom.BedroomFunctions();
        } else if (choice == 4) {
            objGuestBathroom.BathRoomFunctions();
        } else if (choice == 5) {
            objLivingRoom.LivingRoomFunctions();
        } else if (choice == 6) {
            objKitchen.KitchenFunctions();
        } else {
            System.out.println("Thank you !! Leaving Home guest functions !! ");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Leaving Home guest functions  (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            // System.out.println("YES !!");
            useExistingFunctionGuest();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank you !! Leaving Home guest functions ");
            System.out.println();
            System.out.println("----------------------------------");
        }
    }

    public void useExistingFunctionKids() {
        System.out.println("|| KIDS FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To use garden ");
        System.out.println("[2] : To use Main Door ");
        System.out.println("[3] : To use kids bedroom ");
        System.out.println("[4] : To use kids bathroom");
        System.out.println("[5] : To use living room ");
        System.out.println("[6] : To use study room");
        System.out.println();
        System.out.println("[7] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            garden1.GardenFunctions();
        } else if (choice == 2) {
            objMainDoor.MainDoorFunctions();
        } else if (choice == 3) {
            objKidsBedroom.BedroomFunctions();
        } else if (choice == 4) {
            objKidsBathroom.BathRoomFunctions();
        } else if (choice == 5) {
            objLivingRoom.LivingRoomFunctions();
        } else if (choice == 6) {
            objStudyRoom.StudyRoomFunctions();
        } else {
            System.out.println("Thank you !! Leaving child home functions !! ");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Leaving Home child functions (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useExistingFunctionKids();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank you !! Leaving Home child functions ");
            System.out.println();
            System.out.println("----------------------------------");
        }
    }

    public void enableBackToHome() {
        objKidsBedroom.backToHomeFeature();
        objMasterBedroom.backToHomeFeature();
        objGuestBedroom.backToHomeFeature();

        objStudyRoom.backToHomeFeature();
        objKitchen.backToHomeFeature();
        objLivingRoom.backToHomeFeature();

        objKidsBathroom.backToHomeFeature();
        objGuestBathroom.backToHomeFeature();
        objMasterBathroom.backToHomeFeature();
    }

    public void enableAwayFromHome() {
        objKidsBedroom.awayFromHomeFeature();
        objMasterBedroom.awayFromHomeFeature();
        objGuestBedroom.awayFromHomeFeature();

        objStudyRoom.awayFromHomeFeature();
        objKitchen.awayFromHomeFeature();
        objLivingRoom.awayFromHomeFeature();

        objKidsBathroom.awayFromHomeFeature();
        objGuestBathroom.awayFromHomeFeature();
        objMasterBathroom.awayFromHomeFeature();
    }

    public void checkSecurity() {
        objKidsBedroom.SecurityFeature();
        objMasterBedroom.SecurityFeature();
        objGuestBedroom.SecurityFeature();

        objStudyRoom.SecurityFeature();
        objKitchen.SecurityFeature();
        objLivingRoom.SecurityFeature();

        objKidsBathroom.SecurityFeature();
        objGuestBathroom.SecurityFeature();
        objMasterBathroom.SecurityFeature();
    }

    public static void main(String[] args) {}
}
