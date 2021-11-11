package com.group2.AllDevices;

public class WaterTank {

    private int currLevel;

    public int getCurrLevel() {
        return currLevel;
    }

    public void setCurrLevel(int currLevel) {
        this.currLevel = currLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    private final int maxLevel;

    public WaterTank() {
        System.out.println("Initializing Water Tank constructor ... ");
        currLevel = 0;
        maxLevel = 100;
        System.out.println("Terminated water tank constructor !!");
        System.out.println();
    }

    public void display() {
        System.out.println("Displaying Water tank current state - ");
        System.out.println();
        System.out.println("Current Level - " + currLevel);
        System.out.println("Max Level - " + maxLevel);
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {}
}
