// Manager class
// Take user credentials for sign up/ sign in etc.
// Takes the owner to Home class

// Has the important DOUBLE VALIDATION feature
// Any user other than Owner (child/guest) needs to verify IDs of
// both the Owner and the Home as well

// By default the first ownerID will start from 2001
// child from 5001
// and guest from 7001
// and these will be updated by +1 as a new user registers!!

package com.group2.DriverPackage;

import com.group2.HomePackage.*;
import com.group2.Person.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Owner> ownerList1 = new ArrayList<>();
    private ArrayList<Child> childList1 = new ArrayList<>();
    private ArrayList<Guest> guestList1 = new ArrayList<>();

    static int OwnerID = 2001;
    static int ChildID = 5001;
    static int GuestID = 7001;

    static void incrementOwnerID() {
        OwnerID++;
    }

    static void incrementChildID() {
        ChildID++;
    }

    static void incrementGuestID() {
        GuestID++;
    }

    // display
    public void displayManager() {

        System.out.println("|| Displaying Manager ||");
        System.out.println();

        System.out.println("Owner List - ");
        System.out.println("Size : " + ownerList1.size());
        System.out.println();

        int size = ownerList1.size();
        for (int i = 0; i < size; i++) {
            Owner x = ownerList1.get(i);
            System.out.println("[1] : Index - " + (i + 1));
            System.out.println("[2] : ID - " + x.getID());
            System.out.println("[3] : Name - " + x.getName());
            System.out.println("[4] : Age - " + x.getAge());
            System.out.println();
        }

        System.out.println("Guest List - ");
        System.out.println("Size : " + guestList1.size());
        System.out.println();

        size = guestList1.size();
        for (int i = 0; i < size; i++) {
            Guest x = guestList1.get(i);
            System.out.println("[1] : Index - " + (i + 1));
            System.out.println("[2] : ID - " + x.getID());
            System.out.println("[3] : Name - " + x.getName());
            System.out.println("[4] : Age - " + x.getAge());
            System.out.println();
        }

        System.out.println("Child List - ");
        System.out.println("Size : " + childList1.size());

        size = childList1.size();
        for (int i = 0; i < size; i++) {
            Child x = childList1.get(i);
            System.out.println("[1] : Index - " + (i + 1));
            System.out.println("[2] : ID - " + x.getID());
            System.out.println("[3] : Name - " + x.getName());
            System.out.println("[4] : Age - " + x.getAge());
            System.out.println();
        }

        System.out.println("Exiting from Display Manager !!");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

    }

    // menu for owner
    public void ownerMode() {

        System.out.println("HELLO OWNER!");
        System.out.println();
        System.out.println("Kindly choose any one from displayed options!");
        System.out.println();
        System.out.println("[1] : Sign In");
        System.out.println("[2] : Sign Up");
        System.out.println("[3] : Exit");
        System.out.println();

        System.out.println("[4] : Display Current Manager Content");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            signInOwner();
        } else if (choice == 2) {
            signUpOwner();
        } else if (choice == 3) {
            System.out.println("Exiting ...");
            System.out.println();
            System.out.println("Thank You !!");
            System.out.println();
            System.out.println("Terminating Owner Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        } else if (choice == 4) {
            displayManager();
        } else {
            System.out.println("Incorrect choice !!");
            System.out.println();
            System.out.println("Terminating Owner Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        }

        char ch;
        System.out.print("Do you want to use Owner Mode again (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();
        if (ch == 'Y' || ch == 'y') {
            ownerMode();
        } else {
            System.out.println("Thank You !!");
            System.out.println();
            System.out.println("Terminating Owner Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println();
            System.out.println("----------------------------------");
        }
    }

    // menu for child
    public void childMode() {
        System.out.println("HELLO CHILD!");
        System.out.println();
        System.out.println("Kindly choose any one from displayed options!");
        System.out.println();
        System.out.println("[1] : Sign In");
        System.out.println("[2] : Sign Up");
        System.out.println("[3] : Exit");
        System.out.println();

        System.out.println("[4] : Display Current Manager Content");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            signInChild();
        } else if (choice == 2) {
            signUpChild();
        } else if (choice == 3) {
            System.out.println("Exiting ...");
            System.out.println();
            System.out.println("Thank You !!");
            System.out.println();
            System.out.println("Terminating Child Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        } else if (choice == 4) {
            displayManager();
        } else {
            System.out.println("Incorrect choice !!");
            System.out.println();
            System.out.println("Terminating Child Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        }

        char ch;
        System.out.print("Do you want to use Child Mode again (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();
        if (ch == 'Y' || ch == 'y') {
            childMode();
        } else {
            System.out.println("Thank You !!");
            System.out.println();
            System.out.println("Terminating Child Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println();
            System.out.println("----------------------------------");
        }
    }

    // guest mode
    public void guestMode() {
        System.out.println("HELLO GUEST!");
        System.out.println();
        System.out.println("Kindly choose any one from displayed options!");
        System.out.println();
        System.out.println("[1] : Sign In");
        System.out.println("[2] : Sign Up");
        System.out.println("[3] : Exit");
        System.out.println();

        System.out.println("[4] : Display Current Manager Content");
        System.out.println();

        int choice;
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            signInGuest();
        } else if (choice == 2) {
            signUpGuest();
        } else if (choice == 3) {
            System.out.println("Exiting ...");
            System.out.println();
            System.out.println("Thank You !!");
            System.out.println();
            System.out.println("Terminating Guest Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println();
            System.out.println("----------------------------------");
            return;
        } else if (choice == 4) {
            displayManager();
        } else {
            System.out.println("Incorrect choice !!");
            System.out.println();
            System.out.println("Terminating Guest Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println("----------------------------------");
            return;
        }

        char ch;
        System.out.print("Do you want to use Guest Mode again (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();
        if (ch == 'Y' || ch == 'y') {
            guestMode();
        } else {
            System.out.println("Thank You !!");
            System.out.println();
            System.out.println("Terminating Guest Mode !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Terminating Manager Window !!");
            System.out.println("----------------------------------");
        }
    }

    // functions start
    public void signUpOwner() {
        System.out.println("|| SIGN UP OWNER ||");
        System.out.println();
        Owner obj1 = new Owner();

        obj1.setID(OwnerID);
        incrementOwnerID();

        String name;
        System.out.print("Enter your Name : ");
        name = sc.next();
        obj1.setName(name);
        //System.out.println();

        int age;
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        obj1.setAge(age);
        System.out.println();

        ownerList1.add(obj1);
        System.out.println("Owner Registered Successfully !!");
        System.out.println();

        System.out.print(
                "Do you want to sign in and perform your functions (Y/N) : "
        );
        char ch;
        ch = sc.next().charAt(0);
        System.out.println();
        if (ch == 'Y' || ch == 'y') {
            signInOwner();
        } else {
            System.out.println("Thank you !!");
            System.out.println("Back to Owner Menu !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            return;
        }
    }

    public void signInOwner() {
        System.out.println("|| SIGN IN OWNER ||");
        System.out.println();
        int ID;
        System.out.print("Enter your ID : ");
        ID = sc.nextInt();
        //System.out.println();

        String name;
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.println();

        int size = ownerList1.size();
        Owner nowOwner = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Owner x = ownerList1.get(i);
            if (x.getName().equals(name) && x.getID() == ID) {
                found = true;
                nowOwner = x;
            }
        }

        if (found) {
            System.out.println("Owner Found !!");
            System.out.println("You are now logged IN");
            System.out.println();
            System.out.println("Your ID is - " + nowOwner.getID());
            System.out.println("Your name is - " + nowOwner.getName());
            System.out.println("You can now perform your functions !! ");
            System.out.println();

            nowOwner.myFunctions();

            System.out.println("Logged out successfully !!");
//            System.out.println("Back to Owner Menu !!");
//            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
        } else {
            System.out.println("Sorry, the Owner ID or Name do not match !!");
            System.out.println();
            System.out.println("[1] : Sign In again");
            System.out.println("[2] : Sign Up");
            System.out.println("[3] : Exit");
            System.out.println();
            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                signInOwner();
            } else if (choice == 2) {
                signUpOwner();
            } else {
                System.out.println("Thank you !!");
                System.out.println("Back to Owner Menu !!");
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println();
                return;
            }
        }
    }


    public void signUpChild() {
        System.out.println("|| SIGN UP CHILD ||");
        System.out.println();
        Child obj1 = new Child();

        obj1.setID(ChildID);
        incrementChildID();

        String name;
        System.out.print("Enter your Name : ");
        name = sc.next();
        obj1.setName(name);
        //System.out.println();

        int age;
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        obj1.setAge(age);
        System.out.println();

        childList1.add(obj1);
        System.out.println("Child Registered Successfully !!");
        System.out.println();

        System.out.print(
                "Do you want to sign in and perform your functions (Y/N) : "
        );
        char ch;
        ch = sc.next().charAt(0);
        System.out.println();
        if (ch == 'Y' || ch == 'y') {
            signInChild();
        } else {
            System.out.println("Thank you !!");
            System.out.println("Back to Child Menu !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            return;
        }
    }

    public void signInChild() {
        System.out.println("|| SIGN IN CHILD ||");
        System.out.println();
        int ID;
        System.out.print("Enter your ID : ");
        ID = sc.nextInt();
        System.out.println();

        String name;
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.println();

        int size = childList1.size();
        Child nowChild = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Child x = childList1.get(i);
            if (x.getName().equals(name) && x.getID() == ID) {
                found = true;
                nowChild = x;
            }
        }

        if (found) {

            System.out.println("Child Found !!");
            System.out.println("You are now logged IN");
            System.out.println();
            System.out.println("Entering Owner Validation !! "); // 1st security validation
            validateChildLevel1(nowChild);
            System.out.println();
        } else {
            System.out.println("Sorry, the Child ID or Name do not match !!");
            System.out.println();
            System.out.println("[1] : Sign In again");
            System.out.println("[2] : Sign Up");
            System.out.println("[3] : Exit");
            System.out.println();
            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                signInChild();
            } else if (choice == 2) {
                signUpChild();
            } else {
                System.out.println("Thank you !!");
                System.out.println("Back to Child Menu !!");
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println();
                return;
            }
        }
    }

    public void validateChildLevel1 (Child nowChild) {
        int Owner_id;
        System.out.print("Enter the ID of Owner whose house you want to use : ");
        Owner_id = sc.nextInt();
        System.out.println();

        int size = ownerList1.size();
        Owner nowOwner = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Owner x = ownerList1.get(i);
            if (x.getID() == Owner_id) {
                found = true;
                nowOwner = x;
            }
        }

        if (found) {
            System.out.println("Owner found !!");
            System.out.println();
            System.out.println("Entering Home Validation !! "); // 2nd security validation
            validateChildLevel2(nowChild, nowOwner);
            System.out.println();
        } else {
            System.out.println("Sorry the Owner ID do not match !!");
            System.out.println();
            System.out.println("[0] : Input Owner ID again");
            System.out.println("[1] : Sign In again");
            System.out.println("[2] : Sign Up");
            System.out.println("[3] : Exit");
            System.out.println();
            int choice;
            choice = sc.nextInt();

            if (choice == 0) {
                validateChildLevel1(nowChild);
            } else if (choice == 1) {
                signInChild();
            } else if (choice == 2) {
                signUpChild();
            } else {
                System.out.println("Thank You !!");
                return;
            }
        }
    }

    public void validateChildLevel2(Child nowChild, Owner objectOwner) {
        int Home_id;
        System.out.print("Enter the ID of the home you want to use : ");
        Home_id = sc.nextInt();
        System.out.println();
        Home objHome = objectOwner.validateChild(Home_id);
        if (objHome == null) {
            System.out.println("Home not found !!");
            //System.out.println("Sorry the Home ID do not match !!");
            System.out.println();
            System.out.println("[1] : Home Validation"); // ask for 2nd validation again
            System.out.println("[2] : Owner Validation"); // ask for 1st validation again
            System.out.println("[3] : Sign In again");
            System.out.println("[4] : Sign Up");
            System.out.println("[5] : Exit");
            System.out.println();
            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                validateChildLevel2(nowChild, objectOwner);
            } else if (choice == 2) {
                validateChildLevel1(nowChild);
            } else if (choice == 3) {
                signInChild();
            } else if (choice == 4) {
                signUpChild();
            } else {
                System.out.println("Thank You !!");
                return;
            }
        } else {
            //            objHome.useExistingFunctionKids();
            System.out.println("Home Found !!");
            System.out.println("You can now use your Home Functions !!");
            nowChild.myFunctions(objHome);
        }
    }

    public void signUpGuest() {
        System.out.println("|| SIGN UP GUEST ||");
        System.out.println();
        Guest obj1 = new Guest();

        obj1.setID(GuestID);
        incrementGuestID();

        String name;
        System.out.print("Enter your Name : ");
        name = sc.next();
        obj1.setName(name);

        int age;
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        obj1.setAge(age);
        System.out.println();

        guestList1.add(obj1);
        System.out.println("Guest Registered Successfully !!");
        System.out.println();

        System.out.println(
                "Do you want to sign in and perform your functions (Y/N) : "
        );
        char ch;
        ch = sc.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            signInGuest();
        } else {
            System.out.println("Thank you !!");
            System.out.println("Back to Guest Menu !!");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            return;
        }
    }

    public void signInGuest() {
        System.out.println("|| SIGN IN GUEST ||");
        System.out.println();
        int ID;
        System.out.print("Enter your ID : ");
        ID = sc.nextInt();

        String name;
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.println();

        int size = guestList1.size();
        Guest nowGuest = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Guest x = guestList1.get(i);
            if (x.getName().equals(name) && x.getID() == ID) {
                found = true;
                nowGuest = x;
            }
        }

        if (found) {
            System.out.println("Guest Found !!");
            System.out.println("You are now logged IN");
            System.out.println();
            System.out.println("Entering Owner Validation !! "); // 1st security validation
            System.out.println();

            validateGuestLevel1(nowGuest);
        } else {
            System.out.println("Sorry the Guest ID or Name do not match !!");
            System.out.println();
            System.out.println("[1] : Sign In again");
            System.out.println("[2] : Sign Up");
            System.out.println("[3] : Exit");
            System.out.println();
            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                signInGuest();
            } else if (choice == 2) {
                signUpGuest();
            } else {
                System.out.println("Thank You !!");
                return;
            }
        }
    }

    public void validateGuestLevel1(Guest nowGuest) {
        int Owner_id;
        System.out.print("Enter the ID of Owner whose house you want to use : ");
        Owner_id = sc.nextInt();
        System.out.println();

        int size = ownerList1.size();
        Owner nowOwner = null;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Owner x = ownerList1.get(i);
            if (x.getID() == Owner_id) {
                found = true;
                nowOwner = x;
            }
        }

        if (found) {
            System.out.println("Owner found !!");
            System.out.println("Entering Home Validation !!");
            validateGuestLevel2(nowGuest, nowOwner);
        } else {
            System.out.println("Sorry the Owner ID do not match !!");
            System.out.println();
            System.out.println("[0] : Input Owner ID again");
            System.out.println("[1] : Sign In again");
            System.out.println("[2] : Sign Up");
            System.out.println("[3] : Exit");
            System.out.println();
            int choice;
            choice = sc.nextInt();

            if (choice == 0) {
                validateGuestLevel1(nowGuest);
            }

            if (choice == 1) {
                signInGuest();
            } else if (choice == 2) {
                signUpGuest();
            } else {
                System.out.println("Thank You !!");
                return;
            }
        }
    }

    public void validateGuestLevel2(Guest nowGuest, Owner objectOwner) {
        int Home_id;
        System.out.println("Enter the ID of the home you want to use : ");
        Home_id = sc.nextInt();
        Home objHome = objectOwner.validateGuest(Home_id);
        if (objHome == null) {
            System.out.println("Home not found !!");
            //System.out.println("Sorry the Home ID do not match !!");
            System.out.println();
            System.out.println("[1] : Home Validation"); // ask for 2nd validation again
            System.out.println("[2] : Owner Validation"); // ask for 1st validation again
            System.out.println("[3] : Sign In again");
            System.out.println("[4] : Sign Up");
            System.out.println("[5] : Exit");
            System.out.println();

            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                validateGuestLevel2(nowGuest, objectOwner);
            } else if (choice == 2) {
                validateGuestLevel1(nowGuest);
            } else if (choice == 3) {
                signInGuest();
            } else if (choice == 4) {
                signUpGuest();
            } else {
                System.out.println("Thank You !!");
                return;
            }
        } else {

            System.out.println("Home found !!");
            System.out.println("You can now use your Home Functions !!");
            nowGuest.myFunctions(objHome);
        }
    }

    public static void main(String[] args) {}
}
