package com.group2.AllDevices;

import java.util.Scanner;

public class Fridge extends Device implements Runnable {

    Scanner sc = new Scanner(System.in);

    private final int MINTemp;
    private final int MAXTemp;

    private final int MINPower;
    private final int MAXPower;

    private final int optimumTemp;

    private boolean isOpen;
    private int temperature;
    private int power; // 1 2 3 4 5

    public Fridge() {
        System.out.println("Initializing Fridge constructor ...");

        MINPower = 1;

        MINTemp = -5;

        MAXPower = 5;

        MAXTemp = 15;

        optimumTemp = 6;

        on(); // fridge by default ON
        isOpen = false;

        temperature = 15;

        power = 3;

        System.out.println("Terminating Fridge constructor !!");
        System.out.println();
    }

    public synchronized void change(int i) {
        // i==1 increment
        // i==-1 decrement

        while (true) {
            try {
                Thread.sleep(1000);

                if (i == -1) {
                    if (temperature == MINTemp) {
                        break;
                    }

                    temperature--;
                    System.out.println("Decreasing temperature " + temperature);
                } else if (i == 1) {
                    if (temperature == optimumTemp) {
                        break;
                    }

                    temperature++;
                    System.out.println("Increasing temperature " + temperature);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMINTemp() {
        return MINTemp;
    }

    public int getMAXTemp() {
        return MAXTemp;
    }

    public int getMINPower() {
        return MINPower;
    }

    public int getMAXPower() {
        return MAXPower;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + " Fridge is running ... ");
        }
    }

    public void display() {
        System.out.println("Displaying Fridge State - ");
        System.out.println();
        System.out.println("Current temperature - " + temperature);
        System.out.println("Current power - " + power);
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void FridgeFun() {
        System.out.println("|| FRIDGE FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To display current state");
        System.out.println("[2] : To open Door ");
        System.out.println("[3] : To increase temp");
        System.out.println("[4] : To decrease temp");
        System.out.println("[5] : To increase power");
        System.out.println("[6] : To decrease power");
        System.out.println("[7] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            display();
        } else if (choice == 2) {
            openDoor();
        } else if (choice == 3) {
            incrementTemp();
        } else if (choice == 4) {
            decrementTemp();
        } else if (choice == 5) {
            incrementPower();
        } else if (choice == 6) {
            decrementPower();
        } else {
            System.out.println("Thank You !! Leaving fridge !");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of fridge (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            FridgeFun();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving fridge functions !");
            System.out.println();
        }
    }

    public void openDoor() { // Door opening
        System.out.println("Opening door of fridge...");
        System.out.println();

        try {
            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(e);
        }

        isOpen = true;
        System.out.println("Door is open now !!");
        System.out.println();
        System.out.println("Take away your fav snack :P ");
        System.out.println();
        System.out.println("Press 1 when done");
        System.out.println();
        int x = sc.nextInt();
        System.out.println();


        System.out.println("Closing door of fridge...");
        System.out.println();

        try {
            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(e);
        }

        isOpen = false;
        System.out.println("Door closed !!");
        System.out.println();
    }

    public void incrementPower() {
        if (power <= MAXPower - 1) {
            power++;
        }
    }

    public void decrementPower() {
        if (power >= MINPower + 1) {
            power--;
        }
    }

    public void incrementTemp() {
        if (temperature <= MAXTemp - 1) {
            temperature++;
        }
    }

    public void decrementTemp() {
        if (temperature >= MINTemp + 1) {
            temperature--;
        }
    }

    public void connectToCentralNode() {
        System.out.println("Use method B to connect to central node ");
    }

    public void endConnection() {
        System.out.println("Use method B' to end connection from central node ");
    }

    public static void main(String[] args) {}
}
