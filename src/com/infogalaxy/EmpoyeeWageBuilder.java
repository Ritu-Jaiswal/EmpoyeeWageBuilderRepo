package com.infogalaxy;

import java.util.Random;

public class EmpoyeeWageBuilder {
    int total_wage = 0;
    int total_hrs = 0;

   void getEmployeeWage() {
        int working_days = 0;


        Random random = new Random();
        while(working_days < Constants.TOTAL_WORKING_DAYS && total_hrs <= Constants.TOTAL_WORKING_HRS) {
            working_days++;
            System.out.println("Day : " +working_days);
            int checkAttendance = random.nextInt() % 2;

            if (checkAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is Present.");
                int empType = random.nextInt() % 2;
                if (empType < 0) {
                    empType = -empType;
                }
                switch (empType) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part Time.");
                        total_wage = Constants.WAGE_PER_HR * Constants.PART_TIME_HR;
                        total_hrs = total_hrs + Constants.PART_TIME_HR;
                        total_wage = total_wage + (Constants.WAGE_PER_HR*Constants.PART_TIME_HR);
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full Time.");
                        total_wage = Constants.WAGE_PER_HR * Constants.FULL_DAY_HR;
                        total_hrs = total_hrs + Constants.FULL_DAY_HR;
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.FULL_DAY_HR);

                        break;
                }
            }

        }
   }
   void showEmployeeWage() {
            System.out.println("Total Wage = " + total_wage);
            System.out.println("Total Hours = " + total_hrs);
        }
    public static void main(String[] args) {

        EmpoyeeWageBuilder empoyeeWageBuilder = new EmpoyeeWageBuilder();
        empoyeeWageBuilder.getEmployeeWage();
        empoyeeWageBuilder.showEmployeeWage();

    }


}
