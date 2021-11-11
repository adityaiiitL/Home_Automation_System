package com.group2.AllDevices.TvPackage;

import com.group2.AllDevices.Device;
import java.util.Scanner;

public abstract class PrimitiveTv extends Device {

    Scanner sc = new Scanner(System.in);

    public String[] channelListOld = new String[] {
            "DoorDarshan",
            "DoorDarshan Sports",
            "DoorDarshan News",
            "DoorDarshan Entertainment",
            "DoorDarshan Movies",
    };

    private String currentChannel;

    public PrimitiveTv() {
        System.out.println("Pri TV const in");
        currentChannel = "None";
        System.out.println("Pri TV const out");
    }

    public void changeChannel() {
        System.out.println("1 for old channel : ");
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
        }
    }

    public void watchCurrentChannel() {
        System.out.println("Playing current channel ... ... ... ");
        // cin sth to break from here (wait for yes or no )
    }

    public static void main(String[] args) {}
}
