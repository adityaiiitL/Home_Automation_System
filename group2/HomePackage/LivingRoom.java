package com.group2.HomePackage;

import com.group2.AllDevices.*;
import com.group2.AllDevices.TvPackage.*;
import com.group2.AllDevices.TvPackage.TV;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LivingRoom extends Room {

    Scanner sc = new Scanner(System.in);

    private AC objAc;
    private Alarm objAlarm;
    private Fan objFan;
    private Speakers objSpeakers;

    // TV modules
    private TV objTV;
    private PrimitiveTv objPrimitiveTv;
    private AdvanceCamera objAdvanceCamera;
    private Camera objCamera;
    private MusicPlayer objMusicPlayer;
    private Netflix objNetfix;
    private TvAsDataStore objTvAsDataStore;
    private TVasPhone objTVasPhone;
    private UseBrowser objUseBrowser;
    private VideoGame objVideoGame;
    private Youtube objYoutube;

    private FireAlarmSensor objFireAlarmSensor;
    private RoomThermometerThermostats objRoomThermometerThermostats;

    private RoomCamera objRoomCamera;

    public LivingRoom() {
        System.out.println("Adding Living Room ...");
        System.out.println();

        System.out.println("Adding AC ... ");
        objAc = new AC();
        System.out.println("AC added !!");
        System.out.println();

        System.out.println("Adding alarm ...");
        objAlarm = new Alarm();
        System.out.println("Alarm added !! ");
        System.out.println();

        System.out.println("Adding fan ...");
        objFan = new Fan();
        System.out.println("Fan added !! ");
        System.out.println();

        System.out.println("Adding Speakers ... ");
        objSpeakers = new Speakers();
        System.out.println("Speakers added !! ");
        System.out.println();

        System.out.println("Adding TV ... ");
        objTV = new TV();
        System.out.println("TV added !!");
        System.out.println();

        System.out.println("Adding Primitive TV ...");
        objPrimitiveTv = new TV();
        System.out.println("Primitive TV added !! ");
        System.out.println();

        System.out.println("Adding advance features to TV ...");
        objAdvanceCamera = new TV();
        objCamera = new TV();
        objMusicPlayer = new TV();
        objNetfix = new TV();
        objTvAsDataStore = new TV();
        objTVasPhone = new TV();
        objUseBrowser = new TV();
        objVideoGame = new TV();
        objYoutube = new TV();
        System.out.println("Advanced features added !!");
        System.out.println();

        System.out.println("Adding FireAlarmSensor ... ");
        objFireAlarmSensor = new FireAlarmSensor();
        System.out.println("FireAlarmSensor added !! ");
        System.out.println();

        System.out.println("Adding RoomThermometerThermostats ... ");
        objRoomThermometerThermostats = new RoomThermometerThermostats();
        System.out.println("RoomThermometerThermostats Added !! ");
        System.out.println();

        System.out.println("Adding roomCamera ... ");
        objRoomCamera = new RoomCamera();
        System.out.println("RoomCamera added !! ");
        System.out.println();

        System.out.println("Living Room Added !!");
    }

    public void LivingRoomFunctions() {
        System.out.println("|| LIVING ROOM FUNCTIONS ||");
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

        System.out.println("[12] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objAc.ACfunc();
        } else if (choice == 2) {
            objAlarm.AlarmFunctions();
        } else if (choice == 3) {
            objFan.FanFunc();
        } else if (choice == 4) {
            objSpeakers.SpeakersFunctions();
        } else if (choice == 5) {
            TV_modules();
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
        } else {
            System.out.println("Thank You !! Leaving Living room !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Living room (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            LivingRoomFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Living room !");
            System.out.println();
        }
    }

    public void TV_modules() {
        // AS TV IS MULTITASKING DEVICE
        //
        System.out.println("|| TV MODULE ||");

        System.out.println();

        System.out.println("[1] : Advance TV");

        System.out.println("[2] : Primitive TV");

        System.out.println("[3] : Music player ");

        System.out.println("[4] : VideoGame");

        System.out.println("[5] : Use Browser");

        System.out.println("[6] : Primitive Camera");

        System.out.println("[7] : Advance Camera");

        System.out.println("[8] : Tv As Data Store");

        System.out.println("[9] : TV as Phone");

        System.out.println("[10] : YouTube");

        System.out.println("[11] : Netflix");

        System.out.println("[12] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            useAdvTV();
        } else if (choice == 2) {
            usePriTV();
        } else if (choice == 3) {
            useMusicPlayer();
        } else if (choice == 4) {
            useVideoGame();
        } else if (choice == 5) {
            useUseBrowser();
        } else if (choice == 6) {
            usePriCamera();
        } else if (choice == 7) {
            useAdvanceCamera();
        } else if (choice == 8) {
            useTvAsDataStore();
        } else if (choice == 9) {
            useTVasPhone();
        } else if (choice == 10) {
            useYoutube();
        } else if (choice == 11) {
            usenetflix();
        } else {
            System.out.println("Thank You !! Leaving TV Module !");
            System.out.println();
            return;
        }

        char ch;
        System.out.println("Do you want to use more functions of TV module (Y/N) : ");
        System.out.println();
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            TV_modules();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving TV modules !");
        }
    }

    public void useAdvTV() {
        objTV.on();

        System.out.println("Using Advance TV ...");
        System.out.println();
        System.out.println("|| ADVANCE TV FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To change channel");

        System.out.println("[2] : Music player --> play music ");
        System.out.println("[3] : Music player --> stop playing music");

        System.out.println("[4] : Video Game --> play game ");

        System.out.println("[5] : Use Browser --> use browser/internet ");

        System.out.println("[6] : Advance Camera --> takePicture");
        System.out.println("[7] : Advance Camera --> savePicture");
        System.out.println("[8] : Advance Camera --> showPicture");
        System.out.println("[9] : Advance Camera --> takeVideo");
        System.out.println("[10] : Advance Camera --> saveVideo");
        System.out.println("[11] : Advance Camera --> showVideo");

        System.out.println("[12] : Tv As Data Store --> store data ");
        System.out.println("[13] : Tv As DataStore --> show data");

        System.out.println("[14] : TV as Phone --> make call ");
        System.out.println("[15] : TV as Phone --> receive call");
        System.out.println("[16] : TV as Phone --> send message");
        System.out.println("[17] : TV as Phone --> recieve message");

        System.out.println("[18] : YouTube searchVideo/playVideo");
        System.out.println("[19] : YouTube saveVideoYT");
        System.out.println("[20] : YouTube subscribeChannel(");
        System.out.println("[21] : YouTube likeVideo");
        System.out.println("[22] : YouTube downloadOffline");

        System.out.println("[23] : Netflix - searchMovie / play movie");
        System.out.println("[24] : Netflix - playSeries");
        System.out.println("[25] : Netflix - playShow");
        System.out.println("[26] : Netflix - DownloadNF");

        System.out.println("[27] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            objTV.changeChannel();
        } else if (choice == 2) {
            objTV.playMusic();
        } else if (choice == 3) {
            objTV.stopPlayingMusic();
        } else if (choice == 4) {
            objTV.playGames();
        } else if (choice == 5) {
            objTV.useInternet();
        } else if (choice == 6) {
            objTV.takePicture();
        } else if (choice == 7) {
            objTV.savePicture();
        } else if (choice == 8) {
            objTV.showPicture();
        } else if (choice == 9) {
            objTV.takeVideo();
        } else if (choice == 10) {
            objTV.saveVideo();
        } else if (choice == 11) {
            objTV.showVideo();
        } else if (choice == 12) {
            objTV.storeData();
        } else if (choice == 13) {
            objTV.showData();
        } else if (choice == 14) {
            objTV.makeCall();
        } else if (choice == 15) {
            objTV.receiveCall();
        } else if (choice == 16) {
            objTV.sendingMessage();
        } else if (choice == 17) {
            objTV.receivingMessage();
        } else if (choice == 18) {
            objTV.searchVideo();
        } else if (choice == 19) {
            objTV.saveVideoYT();
        } else if (choice == 20) {
            objTV.subscribeChannel();
        } else if (choice == 21) {
            objTV.likeVideo();
        } else if (choice == 22) {
            objTV.downloadOffline();
        } else if (choice == 23) {
            objTV.searchMovie();
        } else if (choice == 24) {
            objTV.playSeries();
        } else if (choice == 25) {
            objTV.playShow();
        } else if (choice == 26) {
            objTV.DownloadNF();
        } else {
            objTV.off();
            System.out.println("Thank You !! Leaving Advance TV !");
            System.out.println();
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of Advance TV (Y/N) : ");
        System.out.println();
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useAdvTV();
        } else {
            //System.out.println("NO !!");
            objTV.off();
            System.out.println("Thank You !! Leaving Advance TV !");
            System.out.println();
        }
    }

    public void usePriTV() {
        objPrimitiveTv.on();

        System.out.println("Using Primitive TV ...");
        System.out.println();
        System.out.println("|| PRIMITIVE TV FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : Change channel");
        System.out.println("[2] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objPrimitiveTv.changeChannel();
        } else {
            objPrimitiveTv.off();
            System.out.println("Thank You !! Leaving Primitive TV !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Primitive TV (Y/N) : ");
        System.out.println();
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            usePriTV();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Primitive TV !");
            System.out.println();
        }
    }

    public void useMusicPlayer() {
        //        objMusicPlayer.on();
        // cannot do ON because acn only  -->
        // there is a solution in the definition of play music / stop music
        // you can call any function --> on(); yes

        System.out.println("Using Music player TV ...");
        System.out.println();
        System.out.println("|| MUSIC PLAYER TV FUNCTIONS || ");
        System.out.println();

        System.out.println("[1] : Music player --> play music ");
        System.out.println("[2] : Music player --> stop playing music");
        System.out.println("[3] : Exit");

        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objMusicPlayer.playMusic();
        } else if (choice == 2) {
            objMusicPlayer.stopPlayingMusic();
        } else {
            System.out.println("Thank You !! Leaving Music Player TV ");
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of Music Player (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useMusicPlayer();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Music Player ! ");
            System.out.println();
        }
    }

    public void useVideoGame() {
        System.out.println("Using Video game ...");
        System.out.println();
        System.out.println("|| VIDEO GAME FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : Video Game --> play game ");

        System.out.println("[2] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objVideoGame.playGames();
        } else {
            System.out.println("Thank You !! Leaving game !");
            System.out.println();
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of game (Y/N) : ");
        System.out.println();
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useVideoGame();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving game !");
            System.out.println();
        }
    }

    public void useUseBrowser() {
        System.out.println("Using TV Browser ...");
        System.out.println();
        System.out.println("|| TV BROWSER FUNCTION ||");
        System.out.println();

        System.out.println("[1] : Use Browser --> use browser/internet ");

        System.out.println("[2] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objUseBrowser.useInternet();
        } else {
            System.out.println("Thank You !! Leaving Browser !");
            System.out.println();
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of Browser (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useUseBrowser();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Browser !");
            System.out.println();
        }
    }

    public void usePriCamera() {
        System.out.println("Using Primitive Camera ...");
        System.out.println();
        System.out.println("|| PRIMITIVE CAMERA FUNCTIONS ||");

        System.out.println("[1] : Camera --> takePicture");
        System.out.println("[2] : Camera --> savePicture");
        System.out.println("[3] : Camera --> showPicture");
        System.out.println("[4] : Exit");

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objCamera.takePicture();
        } else if (choice == 2) {
            objCamera.savePicture();
        } else if (choice == 3) {
            objCamera.showPicture();
        } else {
            System.out.println("Thank You !! Leaving Camera !");
            System.out.println();
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of Camera (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            usePriCamera();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving camera !");
            System.out.println();
        }
    }

    public void useAdvanceCamera() {
        System.out.println("Using Advance Camera ...");
        System.out.println();
        System.out.println("|| ADVANCE CAMERA FUNCTIONS || ");
        System.out.println();
        System.out.println("[1] : Advance Camera --> takePicture");
        System.out.println("[2] : Advance Camera --> savePicture");
        System.out.println("[3] : Advance Camera --> showPicture");
        System.out.println("[4] : Advance Camera --> takeVideo");
        System.out.println("[5] : Advance Camera --> saveVideo");
        System.out.println("[6] : Advance Camera --> showVideo");
        System.out.println("[7] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objAdvanceCamera.takePicture();
        } else if (choice == 2) {
            objAdvanceCamera.savePicture();
        } else if (choice == 3) {
            objAdvanceCamera.showPicture();
        } else if (choice == 4) {
            objAdvanceCamera.takeVideo();
        } else if (choice == 5) {
            objAdvanceCamera.saveVideo();
        } else if (choice == 6) {
            objAdvanceCamera.showVideo();
        } else {
            System.out.println("Thank You !! Leaving Advance camera !");
            System.out.println();
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of Advance Camera (Y/N) : " );
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useAdvanceCamera();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Advance Camera ! ");
            System.out.println();
        }
    }

    public void useTvAsDataStore() {
        System.out.println("Using Data storage ...");
        System.out.println();
        System.out.println("|| DATA STORAGE FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : Tv As Data Store --> store data ");
        System.out.println("[2] : Tv As Data Store --> show data");
        System.out.println("[3] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            objTvAsDataStore.storeData();
        } else if (choice == 2) {
            objTvAsDataStore.showData();
        } else {
            System.out.println("Thank You !! Leaving Data store !");
            System.out.println();
            return;
        }
        char ch;
        System.out.println("Do you want to use more functions of Data store (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useTvAsDataStore();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving data store TV !");
            System.out.println();
        }
    }

    public void useTVasPhone() {
        System.out.println("Using TV as Phone ...");
        System.out.println();
        System.out.println("|| TV AS PHONE FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : TVasPhone --> make call ");
        System.out.println("[2] : TVasPhone --> receive call");
        System.out.println("[3] : TVasPhone --> send message");
        System.out.println("[4] : TVasPhone --> receive message");
        System.out.println("[5] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            objTVasPhone.makeCall();
        } else if (choice == 2) {
            objTVasPhone.receiveCall();
        } else if (choice == 3) {
            objTVasPhone.sendingMessage();
        } else if (choice == 4) {
            objTVasPhone.receivingMessage();
        } else {
            System.out.println("Thank You !! Leaving Phone !");
            System.out.println();
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of Phone (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useTVasPhone();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Phone !");
            System.out.println();
        }
    }

    public void useYoutube() {
        System.out.println("Using Youtube in TV...");
        System.out.println();
        System.out.println("|| YOUTUBE IN TV FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : YouTube searchVideo/playVideo");
        System.out.println("[2] : YouTube saveVideoYT(");
        System.out.println("[3] : YouTube subscribeChannel(");
        System.out.println("[4] : YouTube likeVideo");
        System.out.println("[5] : YouTube downloadOffline");
        System.out.println("[6] : Exit");

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            objYoutube.searchVideo();
        } else if (choice == 2) {
            objYoutube.saveVideoYT();
        } else if (choice == 3) {
            objYoutube.subscribeChannel();
        } else if (choice == 4) {
            objYoutube.likeVideo();
        } else if (choice == 5) {
            objYoutube.downloadOffline();
        } else {
            System.out.println("Thank You !! Leaving Youtube !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of Youtube (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            useYoutube();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Youtube !");
            System.out.println();
        }
    }

    public void usenetflix() {
        System.out.println("Using Netflix in TV ...");
        System.out.println();

        System.out.println("|| NETFLIX FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : Netflix - searchMovie / play movie");
        System.out.println("[2] : Netflix - playSeries");
        System.out.println("[3] : Netflix - playShow");
        System.out.println("[4] : Netflix -DownloadNF");
        System.out.println("[5] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            objNetfix.searchMovie();
        } else if (choice == 2) {
            objNetfix.playSeries();
        } else if (choice == 3) {
            objNetfix.playShow();
        } else if (choice == 4) {
            objNetfix.DownloadNF();
        } else {
            System.out.println("Thank You !! Leaving netflix !");
            System.out.println();
            return;
        }
        char ch;
        System.out.print("Do you want to use more functions of netflix (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            usenetflix();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving Netflix !");
            System.out.println();
        }
    }

    public void awayFromHomeFeature() {
        getObjBlinds().off();
        getObjLights().off();
        getObjDoor().closeMe();
        objAlarm.off();
        objFan.off();

        objRoomCamera.on();

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
        System.out.println("Living Room security checked !!");
        System.out.println("Everything under control !!");
        System.out.println("");
    }

    public static void main(String[] args) {}
}
