package com.group2.AllDevices;

import java.util.Scanner;

public class Speakers extends Device {

    public int volume;

    Scanner sc = new Scanner(System.in);

    public final int MIN;
    public final int MAX;

    public Speakers() {
        System.out.println("Initializing Speakers Constructor ...");
        this.volume = 50; // 0 to 100
        MIN = 0;
        MAX = 100;
        System.out.println("Terminating Speakers Constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying Speakers current state - ");
        System.out.println();
        System.out.println("Current volume - " + volume);
        System.out.println("Current is on - " + isON()); // music is being played
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public void SpeakersFunctions() {
        System.out.println("|| SPEAKERS FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To display current state");
        System.out.println("[2] : To set ON / start playing music ");
        System.out.println("[3] : To set OFF / stop playing music");
        System.out.println("[4] : To increase volume");
        System.out.println("[7] : To decrease volume");
        System.out.println("[8] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            display();
        } else if (choice == 2) {
            this.playMusic();
        } else if (choice == 3) {
            this.stopMusic();
        } else if (choice == 4) {
            incrementVol();
        } else if (choice == 5) {
            decrementVol();
        } else {
            System.out.println("Thank You !! Leaving speakers !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of speakers (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            SpeakersFunctions();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving speakers !");
            System.out.println();
        }
    }

    public void playMusic() {
        on();
        System.out.println("Playing Music ... ");
        System.out.println();
    }

    public void stopMusic() {
        System.out.println("Stopping to play Music ... ");
        System.out.println();
        off();
    }

    public void incrementVol() {
        if (volume <= MAX - 1) {
            volume++;
        }
    }

    public void decrementVol() {
        if (volume >= MIN + 1) {
            volume--;
        }
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }
}
