package com.test.demo;

public class EmployeeWageSimulator {
    public static void main(String[] args) {
        /*final int isFullTime = 1;
        final int isPartTime = 2;*/
        int WagePerHour = 20;
        int empWorkingHours=0;
        int totalDaysInAMonth = 20;
        int totalWorkingHours = 0;

        int totalEarningInAMonth=0;
        int workingDay =0;
        while(totalWorkingHours <= 100 && workingDay < totalDaysInAMonth )
        {
            workingDay++;
            int random = (int) (Math.floor(Math.random() * 10) % 3);
            switch (random) {
                case 1:
                    empWorkingHours = 8;

                    break;
                case 2:
                    empWorkingHours = 4;

                    break;
                case 0:
                    empWorkingHours = 0;
            }
            totalWorkingHours = totalWorkingHours + empWorkingHours;

            System.out.println("Day " + workingDay+ " earning is " +(empWorkingHours*WagePerHour));
        }
        totalEarningInAMonth = totalWorkingHours * WagePerHour;
        System.out.println("Total Earning earned in 20 days are " +totalEarningInAMonth);
        System.out.println("Hello Git User");
    }
}
