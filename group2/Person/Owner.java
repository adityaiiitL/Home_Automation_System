package com.group2.Person;

import com.group2.HomePackage.Home;
import java.util.ArrayList;
import java.util.Scanner;

public class Owner {

    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private int ID;

    private ArrayList<Home> homeList1 = new ArrayList<Home>();

    static int HomeID = 101;

    static void incrementHomeID() {
        HomeID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void DisplayMe() {
        System.out.println("You are an Owner !!");
        System.out.println();
        System.out.println("a) Name : " + name);
        System.out.println("b) ID : " + ID);
        System.out.println("c) Age : " + age);
        System.out.println("d) Home list Size : " + homeList1.size());

        int size = homeList1.size();
        for (int i = 0; i < size; i++) {
            Home x = homeList1.get(i);
            System.out.println("-> Index : " + (i + 1));
            System.out.println("-> ID : " + x.getHomeID());
            System.out.println("-> Name : " + x.getHomeName());
            System.out.println("");
        }
        System.out.println("Display done !!");
        System.out.println("--------------------------------------");
    }

    public void myFunctions() {
        System.out.println("|| OWNER MENU || ");
        System.out.println("[1] : Display your content ");
        System.out.println("[2] : Add new Home");
        System.out.println("[3] : Perform functions in existing Home");
        //        System.out.println("Display existing home"); --> this will be inside home
        System.out.println("[4] : Exit");
        System.out.println();
        int choice;
        choice = sc.nextInt();
        System.out.println();

        if (choice == 1) {
            DisplayMe();
        } else if (choice == 2) {
            addHome();
        } else if (choice == 3) {
            useExistingHome(); // including displaying them
        } else {
            System.out.println("Thank You !! ");
            System.out.println("Owner Logged out !!");
            System.out.println();
            System.out.println("Terminating Current Owner window !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            return;
        }

        char ch;
        System.out.println(
                "Do you want to use more functions of yours (Y/N) : "
        );
        ch = sc.next().charAt(0);
        //        ch=sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
//            System.out.println("YES !!");
            myFunctions();
        } else {
            System.out.println("Thank You !! ");
            System.out.println("Owner Logged out !!");
            System.out.println();
            System.out.println("Terminating Current Owner window !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            return;

        }
    }

    public void addHome() {
        System.out.println("Adding New Home !!");

        Home h1 = new Home();

        h1.setHomeID(HomeID);
        incrementHomeID();

        String homeName;
        System.out.print("Enter your Home Name : ");
        homeName = sc.next();
        h1.setHomeName(homeName);
        System.out.println();

        System.out.println("Home registered successfully !!");
        System.out.println();

        homeList1.add(h1);

        // construct home
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Starting the construction of the Home ... ");
        System.out.println();

        h1.constructHome();

        System.out.println("Home Construction completed !!");
        System.out.println();
        System.out.println("----------------------------------");
        // call display home
    }

    public void useExistingHome() {
        int inputID;
        System.out.println("Enter the ID of the home you want to operate : ");
        inputID = sc.nextInt();

        int size = homeList1.size();
        Home nowHome = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Home x = homeList1.get(i);
            if (x.getHomeID() == inputID) {
                found = true;
                nowHome = x;
            }
        }

        if (found) {
            nowHome.useExistingFunctionOwner();
        } else {
            System.out.println("Oops !! No such Home exist !! ");
            System.out.println();
            System.out.println("Do you want to try again (Y/N) : ");
            char ch;
            ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                useExistingHome();
            } else {
                System.out.println("Thank You !!");
                return;
            }
        }
    }

    public Home validateChild(int Home_id) {
        int size = homeList1.size();
        Home nowHome = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Home x = homeList1.get(i);
            if (x.getHomeID() == Home_id) {
                found = true;
                nowHome = x;
            }
        }

        if (found) {
            return nowHome;
        } else {
            System.out.println("Home not found !! ");
            return null;
        }
    }

    public Home validateGuest(int Home_id) {
        int size = homeList1.size();
        Home nowHome = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Home x = homeList1.get(i);
            if (x.getHomeID() == Home_id) {
                found = true;
                nowHome = x;
            }
        }

        if (found) {
            return nowHome;
        } else {
            System.out.println("Home not found !! ");
            return null;
        }
    }

    public Home getHomeForOwnerMulti(int Home_id) {
        int size = homeList1.size();
        Home nowHome = null;
        boolean found = false;

        for (int i = 0; i < size; i++) {
            Home x = homeList1.get(i);
            if (x.getHomeID() == Home_id) {
                found = true;
                nowHome = x;
            }
        }

        if (found) {
            return nowHome;
        } else {
            System.out.println("Home not found !! ");
            return null;
        }
    }

    public static void main(String[] args) {}
}
