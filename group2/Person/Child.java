package com.group2.Person;

import com.group2.HomePackage.Home;

public class Child {

    private String name;
    private int age;
    private int ID;

    public void display() {
        System.out.println("You are a child !!");
        System.out.println();
        System.out.println("a) Name : " + name);
        System.out.println("b) Age : " + age);
        System.out.println("c) ID : " + ID);
        System.out.println();
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

    public void myFunctions(Home objHome) {
        System.out.println("Using existing home features !!");
        System.out.println();
        // System.out.println("Will use existing HOME features !!!");
        //System.out.println("Now Entering HOME to perform my functions !!");

        objHome.useExistingFunctionKids();

        // System.out.println("Performed my functions !!");
        //System.out.println("Leaving child class...");
        System.out.println("Leaving child class !!");
        System.out.println();
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {}
}
