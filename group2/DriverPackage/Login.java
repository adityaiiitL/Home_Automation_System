// The Login class
// asks user to log in to their account by firstly asking their access right (OWNER/CHILD/GUEST)
// then asks the default system password (owner12, child34, guest56)
// enables the given mode by user
// has the manager object (highly important class)
// after enabling the given mode, directs user to the managing window

// if wrong access right or incorrect system password will be given,
// then it will show a warning message and will ask user to try again!

package com.group2.DriverPackage;

import java.util.Scanner;

public class Login {

    private Manager managerReference;
    private String acceptedAccessRight;
    private String acceptedPassword;
    int times;

    public void loginUser() {
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Initializing Login window ...");
        System.out.println();

        managerReference = new Manager();
        Scanner sc = new Scanner(System.in);
        times = 0;

        while (true) { // continuous login and working --> we will throughout work inside this only
            System.out.print("Enter the access right : ");
            acceptedAccessRight = sc.next();
            System.out.println();
            System.out.print("Enter the password : ");
            acceptedPassword = sc.next();
            System.out.println();

            if (
                    acceptedAccessRight.equals("OWNER") &&
                            acceptedPassword.equals("owner12")
            ) {
                System.out.println("Owner Mode Enabled !!");
                System.out.println();
                managerReference.ownerMode();
                System.out.println();
                System.out.println("Exiting Owner Mode !!");
                System.out.println("Thank you !!");
                System.out.println();

                char ch;
                System.out.print(
                        "Do you want to try another Access mode (Owner/ Child/ Guest) (Y/N) : "
                );
                ch = sc.next().charAt(0);
                System.out.println();
                if (ch == 'Y' || ch == 'y') {
                    times = 0;
                } else {
                    System.out.println("Thank You !!");
                    System.out.println("Terminating login window !!");
                    System.out.println();
                    break;
                }
            } else if (
                    acceptedAccessRight.equals("CHILD") &&
                            acceptedPassword.equals("child34")
            ) {
                System.out.println("Child Mode Enabled !!");
                System.out.println();
                managerReference.childMode();
                System.out.println("Exiting Child Mode !!");
                System.out.println("Thank you !!");
                System.out.println();

                char ch;
                System.out.print(
                        "Do you want to try another Access mode (Owner/ Child/ Guest) (Y/N) : "
                );
                ch = sc.next().charAt(0);
                System.out.println();
                System.out.println();
                if (ch == 'Y' || ch == 'y') {
                    times = 0;
                } else {
                    System.out.println("Thank You !!");
                    System.out.println("Terminating login window !!");
                    break;
                }
            } else if (
                    acceptedAccessRight.equals("GUEST") &&
                            acceptedPassword.equals("guest56")
            ) {
                System.out.println("Guest Mode Enabled !!");
                System.out.println();
                managerReference.guestMode();
                System.out.println("Exiting Guest Mode !!");
                System.out.println("Thank you !!");
                System.out.println();

                char ch;
                System.out.print(
                        "Do you want to try another Access mode (Owner/ Child/ Guest) (Y/N) : "
                );
                ch = sc.next().charAt(0);
                System.out.println();
                System.out.println();
                if (ch == 'Y' || ch == 'y') {
                    times = 0;
                } else {
                    System.out.println("Thank You !!");
                    System.out.println("Terminating login window !!");
                    break;
                }
            } else {
                System.out.println("Oops !! Wrong Access mode or Password !!");
                System.out.println();
                System.out.println(
                        "You are left with " + (5 - times) + " attempts before sleep !!"
                );
                System.out.println();
                times++;
                if (times == 5) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    char ch;
                    System.out.print("Do you want to try again (Y/N) : ");
                    ch = sc.next().charAt(0);
                    System.out.println();
                    System.out.println();
                    if (ch == 'Y' || ch == 'y') {
                        times = 0;
                    } else {
                        System.out.println("Thank You !!");
                        System.out.println("Terminating login window !!");
                        System.out.println();
                        break;
                    }
                }
            }
        } // while loop exit

        //  we are done with this function --> leaving this to Drive
//        System.out.println("Terminating login window !!");

        System.out.println("----------------------------------");

    }

    public static void main(String[] args) {}
}
