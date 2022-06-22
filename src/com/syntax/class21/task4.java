package com.syntax.class21;

public class task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */
    static void student(String name){
        System.out.println(name);
    }
    static void student(String name){
        System.out.println(name+" "+school);
    }
    static void student(String name, int age){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        student("Marwa");
        student("Marwa", 23);
        student("Marwa", "Harvard");
    }
}
