package com.infogalaxy;

import java.util.Random;

public class EmpoyeeWageBuilder {
    public static void main(String[] args){
        // UC 2 - Daily Wage Calculation
        // pass - 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
        final int WAGE_PER_HR = 20;
        final int  FULL_DAY_HR = 8;
        int total_wage = 0;
    Random random = new Random();
    int checkAttendance = random.nextInt()%2;
        // UC 1 - Check Attendance

    if (checkAttendance == 0){
        System.out.println("Employee is Absent.");
    }
    else{
            System.out.println("Employee is Present.");
            total_wage = FULL_DAY_HR  * WAGE_PER_HR;
        }
        System.out.println("Total Wage = "+total_wage);
    }
}
