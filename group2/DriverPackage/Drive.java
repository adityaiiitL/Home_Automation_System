// The Driver Class
// has the login object
// tells user to log in to their account
// take user to login window

package com.group2.DriverPackage;

import java.util.Scanner;

public class Drive {

    public static void main(String[] args) {

        //                  _______ ____
        //                 /_______\___|
        //                 |       |   |
        //                 |  __   |   |
        //                 |_|__|__|___|
        //
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("                  HOME AUTOMATION SYSTEM                    ");
        System.out.println();
        System.out.println("                      _______ ____\n" +
                "                     /_______\\____|\n" +
                "                     |       |    |\n" +
                "                     |  __   |    |\n" +
                "                     |_|__|__|____|\n" +
                "        ");
        System.out.println("------------------------------------------------------------");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME USER !!");
        System.out.println();
        System.out.println("Kindly login into your account !!");
        System.out.println();

        Login login = new Login();
        login.loginUser();

        // clear screen
        System.out.println();
        System.out.println("Closing the system !!");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Thanks for using our system !!");
        System.out.println();
        System.out.println("----------------------------------");

        System.out.println();
    }
}

