package com.group2.AllDevices.TvPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class TV
        extends PrimitiveTv
        implements
        AdvanceCamera,
        MusicPlayer,
        TVasPhone,
        TvAsDataStore,
        UseBrowser,
        VideoGame,
        Youtube,
        Netflix {

    Scanner sc = new Scanner(System.in);

    private String[] channelListNew = new String[] {
            "Sab TV",
            "Set Max",
            "Star Sports",
            "Pogo",
            "Kal Tak",
    };

    // overriding data
    private String currentChannel;

    public TV() {
        System.out.println("TV const in");
        currentChannel = "None";
        System.out.println("TV const out");
    }

    // overriding function
    public void changeChannel() {
        System.out.println("Current channel  : " + currentChannel);

        System.out.println("1 for old channel : ");
        System.out.println("2 for new channel : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            int i = 1;
            for (String x : channelListOld) {
                System.out.println(i + "  " + x);
                i++;
            }
            System.out.println("Enter Index");
            int index = sc.nextInt();
            currentChannel = channelListOld[index - 1];
            System.out.println("Channel Changed Successfully !!");
        } else if (choice == 2) {
            int i = 1;
            for (String x : channelListNew) {
                System.out.println(i + "  " + x);
                i++;
            }
            System.out.println("Enter Index");
            int index = sc.nextInt();
            currentChannel = channelListNew[index - 1];
            System.out.println("Channel Changed Successfully !!");
        }

        System.out.println("Current channel  : " + currentChannel);
    }

    // as music player
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    public void stopPlayingMusic() {
        System.out.println("Stopping Music...");
    }

    // as videoGame
    public void playGames() {
        System.out.println("Playing games ...");
    }

    // UseBrowser
    public void useInternet() {
        System.out.println("Accessing internet ...");
    }

    // as Advance Camera
    public void takePicture() {
        System.out.println("Taking picture...");
    }

    public void savePicture() {
        System.out.println("Saving picture...");
    }

    public void showPicture() {
        System.out.println("Showing picture...");
    }

    public void takeVideo() {
        System.out.println("Taking Video...");
    }

    public void saveVideo() {
        System.out.println("Saving Video...");
    }

    public void showVideo() {
        System.out.println("Showing Video...");
    }

    // TvAsDataStore
    private ArrayList<String> data = new ArrayList<>();

    public void storeData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Storing data into the computer...");
        System.out.println("Enter data : ");
        String data1 = sc.next();
        data.add(data1);
    }

    public void showData() {
        System.out.println("Showing data from the computer...");
        int size = data.size();
        for (int i = 0; i < size; i++) {
            System.out.println(data.get(i));
        }
    }

    // TVasPhone
    public void makeCall() {
        System.out.println("Making call ... ");
    }

    public void receiveCall() {
        System.out.println("Receiving call ... ");
    }

    public void sendingMessage() {
        System.out.println("Sending message ... ");
    }

    public void receivingMessage() {
        System.out.println("Receiving message ... ");
    }

    // device
    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    // YouTube
    public void searchVideo() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Searching for video ... " + videoName + " ... ");
        System.out.println("Search complete !! ");
        playVideo(videoName);
    }

    public void playVideo(String videoName) {
        System.out.println("Playing video ... " + videoName + " ... ");
        System.out.println("Search complete !! ");
    }

    public void saveVideoYT() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Saving for video ... " + videoName + " ... ");
        System.out.println("Video Saved");
    }

    public void subscribeChannel() {
        System.out.println("Enter Name :: ");
        String channelName = sc.next();
        System.out.println("Saving for video ... " + channelName + " ... ");
        System.out.println("Channel Subscribed");
    }

    public void likeVideo() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Liking for video ... " + videoName + " ... ");
        System.out.println("Video Liked");
    }

    public void downloadOffline() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Downloading the video ... " + videoName + " ... ");
        System.out.println("Video Downloaded");
    }

    // netflix
    public void searchMovie() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Searching for video ... " + videoName + " ... ");
        System.out.println("Search complete !! ");
        playMovie(videoName);
    }

    public void playMovie(String videoName) {
        System.out.println("Playing video ... " + videoName + " ... ");
        System.out.println("Search complete !! ");
    }

    public void playSeries() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Playing series ... " + videoName + " ... ");
        System.out.println("Search complete !! ");
    }

    public void playShow() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Playing series ... " + videoName + " ... ");
        System.out.println("Search complete !! ");
    }

    public void DownloadNF() {
        System.out.println("Enter Name :: ");
        String videoName = sc.next();
        System.out.println("Downloading the video ... " + videoName + " ... ");
        System.out.println("Video Downloaded");
    }

    public void AdvTvFunction() {
        on();

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
            changeChannel();
        } else if (choice == 2) {
            playMusic();
        } else if (choice == 3) {
            stopPlayingMusic();
        } else if (choice == 4) {
            playGames();
        } else if (choice == 5) {
            useInternet();
        } else if (choice == 6) {
            takePicture();
        } else if (choice == 7) {
            savePicture();
        } else if (choice == 8) {
            showPicture();
        } else if (choice == 9) {
            takeVideo();
        } else if (choice == 10) {
            saveVideo();
        } else if (choice == 11) {
            showVideo();
        } else if (choice == 12) {
            storeData();
        } else if (choice == 13) {
            showData();
        } else if (choice == 14) {
            makeCall();
        } else if (choice == 15) {
            receiveCall();
        } else if (choice == 16) {
            sendingMessage();
        } else if (choice == 17) {
            receivingMessage();
        } else if (choice == 18) {
            searchVideo();
        } else if (choice == 19) {
            saveVideoYT();
        } else if (choice == 20) {
            subscribeChannel();
        } else if (choice == 21) {
            likeVideo();
        } else if (choice == 22) {
            downloadOffline();
        } else if (choice == 23) {
            searchMovie();
        } else if (choice == 24) {
            playSeries();
        } else if (choice == 25) {
            playShow();
        } else if (choice == 26) {
            DownloadNF();
        } else {
            off();
            System.out.println("Thank You !! Leaving TV ");
            return;
        }
        char ch;
        System.out.println(
                "Do you want to use more functions of TV (current TV functions --> menu) (Y/N):"
        );
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.println("YES !!");
            AdvTvFunction();
        } else {
            System.out.println("NO !!");
            off();
            System.out.println("Thank You !! Leaving TV ");
        }
    }

    public static void main(String[] args) {}
}
