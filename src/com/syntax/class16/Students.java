package com.syntax.class16;

public class Students {
        /*
        Create a Class called Students
        Create three  variables  Name , ID  and  numberOfStudents
        Create three objects of the Students Class
        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
        Print out  total number of students
        */

        String name=null;
        int ID=0;
        static int numberOfStudents=0;

        public static void main(String[] args) {
                Students std=new Students();
                std.name="Safia";
                std.ID=23;
                numberOfStudents++;

                Students std2=new Students();
                std.name="Madina";
                std.ID=11;
                numberOfStudents++;

                Students std3=new Students();
                std3.name="Mary";
                std3.ID=22;
                numberOfStudents++;

                System.out.println("THere are "+numberOfStudents+" students in the class.");


        }
}
