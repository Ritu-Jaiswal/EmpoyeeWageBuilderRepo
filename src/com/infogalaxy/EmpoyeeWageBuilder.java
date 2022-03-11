package com.infogalaxy;

import java.util.Random;

public class EmpoyeeWageBuilder {
    public static void main(String[] args){
    //pass - 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
    //UC - 1 Check Attendance
    Random random = new Random();
    int checkAttendance = random.nextInt()%2;
    System.out.println(checkAttendance);

    if (checkAttendance == 0){
        System.out.println("Employee is Absent.");
    }
    else{
            System.out.println("Employee is Present.");
        }
    }
}
