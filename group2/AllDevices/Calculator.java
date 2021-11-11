package com.group2.AllDevices;

// add more if you want
// add interface if you want

import java.util.Scanner;

public class Calculator extends PrimitiveCalculator {

    // overriding isPrime function of PrimitiveCalculator
    Scanner sc = new Scanner(System.in);

    public Calculator() {
        System.out.println("Initializing Calculator Constructor ...");
        on();
        System.out.println("Terminating Calculator Constructor !!");
    }

    public void CalculatorFuntion() {
        System.out.println("|| CALCULATOR FUNCTIONS ||");
        System.out.println();
        System.out.println("[1] : To add 2 numbers ");
        System.out.println("[2] : To add 3 numbers ");
        System.out.println("[3] : To add 4 numbers ");

        System.out.println("[4] : To multiply 2 numbers ");
        System.out.println("[5] : To multiply 3 numbers ");
        System.out.println("[6] : To multiply 4 numbers ");

        System.out.println("[7] : To check prime");
        System.out.println("[8] : To check remainder");
        System.out.println("[9] : Exit");
        System.out.println();

        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            int x;
            System.out.print("Enter 1st number : ");
            x = sc.nextInt();

            int y;
            System.out.print("Enter 2nd number : ");
            y = sc.nextInt();
            System.out.println();

            int ans = add(x, y);
            System.out.println("Answer  : " + ans);
            System.out.println();

        } else if (choice == 2) {
            int x;
            System.out.print("Enter 1st number : ");
            x = sc.nextInt();

            int y;
            System.out.print("Enter 2nd number : ");
            y = sc.nextInt();

            int z;
            System.out.print("Enter 3rd number : ");
            z = sc.nextInt();
            System.out.println();

            int ans = add(x, y, z);
            System.out.println("Answer  : " + ans);
            System.out.println();

        } else if (choice == 3) {
            int x;
            System.out.print("Enter 1st number : ");
            x = sc.nextInt();

            int y;
            System.out.print("Enter 2nd number : ");
            y = sc.nextInt();

            int z;
            System.out.print("Enter 3rd number : ");
            z = sc.nextInt();

            int w;
            System.out.print("Enter 4th number : ");
            w = sc.nextInt();
            System.out.println();

            int ans = add(x, y, z, w);
            System.out.println("Answer  : " + ans);
        } else if (choice == 4) {
            int x;
            System.out.print("Enter 1st number : ");
            x = sc.nextInt();

            int y;
            System.out.print("Enter 2nd number : ");
            y = sc.nextInt();
            System.out.println();

            int ans = multiply(x, y);
            System.out.println("Answer  : " + ans);
            System.out.println();

        } else if (choice == 5) {
            int x;
            System.out.print("Enter 1st number : ");
            x = sc.nextInt();

            int y;
            System.out.print("Enter 2nd number : ");
            y = sc.nextInt();

            int z;
            System.out.println("Enter 3rd number : ");
            z = sc.nextInt();
            System.out.println();

            int ans = multiply(x, y, z);
            System.out.println("Answer  : " + ans);
            System.out.println();

        } else if (choice == 6) {
            int x;
            System.out.print("Enter 1st number : ");
            x = sc.nextInt();

            int y;
            System.out.print("Enter 2nd number : ");
            y = sc.nextInt();

            int z;
            System.out.print("Enter 3rd number : ");
            z = sc.nextInt();

            int w;
            System.out.print("Enter 4th number : ");
            w = sc.nextInt();
            System.out.println();

            int ans = multiply(x, y, z, w);
            System.out.println("Answer  : " + ans);
            System.out.println();

        } else if (choice == 7) {
            System.out.print("Enter a number : ");
            int x = sc.nextInt();
            System.out.println();

            boolean check = isPrime(x);
            if (check) {
                System.out.println("YES !! It is prime ! ");
            } else {
                System.out.println("NO !! It is not prime ! ");
            }
            System.out.println();

        } else if (choice == 8) {
            System.out.print("Enter Number : ");
            int x = sc.nextInt();

            System.out.print("Enter Divisor : ");
            int y = sc.nextInt();
            System.out.println();

            int ans = remainder(x, y);
            System.out.println("Answer  : " + ans);
            System.out.println();

        } else {
            System.out.println("Thank You !! Leaving calculator ! ");
            System.out.println();
            return;
        }

        char ch;
        System.out.print("Do you want to use more functions of calculator (Y/N) : ");
        ch = sc.next().charAt(0);
        System.out.println();

        if (ch == 'Y' || ch == 'y') {
            //System.out.println("YES !!");
            CalculatorFuntion();
        } else {
            //System.out.println("NO !!");
            System.out.println("Thank You !! Leaving calculator !");
            System.out.println();
        }
    }

    public boolean isPrime(int num) {
        System.out.println("Checking prime or not in O(sqrtN) time complexity ... ");
        boolean check = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    // overriding remainder function of PrimitiveCalculator
    public int remainder(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {}
}
