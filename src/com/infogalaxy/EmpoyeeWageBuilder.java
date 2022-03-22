package com.infogalaxy;

import java.util.Random;

public class EmpoyeeWageBuilder {
    public static void main(String[] args) {
        // UC 2 - Daily Wage Calculation
        // pass - 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
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        final int PART_TIME_HR = 4;
        int total_wage = 0;
        Random random = new Random();
        int checkAttendance = random.nextInt() % 2;
        // UC 1 - Check Attendance
        // UC 3 - Part time/Full time Wage Calculation
        // UC 4 - convert into SwichCase Code
        if (checkAttendance == 0) {
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
            int empType = random.nextInt() % 2;
            switch (empType) {
                case 0:

                    System.out.println("Employee is Part Time.");
                    total_wage = WAGE_PER_HR * PART_TIME_HR;
                    break;
                case 1:
                case -1:
                    System.out.println("Employee is Full Time.");
                    total_wage = FULL_DAY_HR * WAGE_PER_HR;
                    break;

            }
        }
        System.out.println("Total Wage = " + total_wage);
    }
}
