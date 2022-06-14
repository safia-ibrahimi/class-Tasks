package com.syntax.class16;

public class SyntaxEmployee {
    /*
     Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */
        int eid =0;

        double salary=0;

    static String CEO="Sumair";

    static String companyName="Syntax Technologies";

        void printEmployee (){
            System.out.println("Employee ID "+ eid +" Salary "+salary+" CEO "+CEO);
        }

    public static void main(String[] args) {

            SyntaxEmployee employee1=new SyntaxEmployee();
            employee1.eid =89;
            employee1.salary=250000;

            SyntaxEmployee employee2=new SyntaxEmployee();
            employee2.eid =75;
            employee2.salary=150000;

            employee1.printEmployee();
            employee2.printEmployee();
    }

}
