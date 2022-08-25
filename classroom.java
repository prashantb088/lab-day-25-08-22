/*
   Program of Student Management System
   By Prashant Bansal
 */

package com.bankApp;
import java.util.ArrayList;
import java.util.Collections;

public class classroom {
    public static void main(String[] args){
        student s1 = new student(5,17,"Rakesh",354);
        student s2 = new student(6,18,"Ritesh",378);
        student s3 = new student(7,19,"Shaksi",450);
        student s4 = new student(8,20,"Gaurav",467);
        student s5 = new student(9,21,"Monu",498);

        ArrayList<student> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        a1.add(s5);

        System.out.println("-----Students according to their Marks-----");
        Collections.sort(a1,new MarksComparator());
        for(student s:a1)
            System.out.println(s.studentId+ " is " +s.studentAge+" and their name is "+s.studentName+" and the marks are "+s.studentMarks );

    }

}
