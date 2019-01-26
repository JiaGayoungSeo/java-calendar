package jia.calendar;

import java.util.Scanner;

public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year){
        if(year%4 == 0 && (year % 100 != 0 || year % 400 ==0))
            return true;
        else return false;
    }

    public int getMaxDaysOfMonths(int year, int month){
        if(isLeapYear(year)){
            return LEAP_MAX_DAYS[month-1];
        }
        else return MAX_DAYS[month-1];
    }

    public String printMonth(int month){

        if(month==0){
            return "Dec";
        }

        if(month==1){
            return "Jan";
        }
        if(month==2){
            return "Feb";
        }
        if(month==3){
            return "Mar";
        }
        if(month==4){
            return "Apr";
        }
        if(month==5){
            return "May";
        }
        if(month==6){
            return "Jun";
        }
        if (month==7){
            return "Jul";
        }
        if(month==8){
            return "Aug";
        }
        if(month==9){
            return "Sep";
        }
        if (month==10){
            return "Oct";
        }
        if (month==11){
            return "Nov";
        }
        if (month==12){
            return "Dec";
        }

        if(month==13){
            return "Jan";
        }

        else return "not found";
    }

    public int parseDay(String week){
        if(week.equals("sun")) return 0;
        if(week.equals("mon")) return 1;
        if(week.equals("tue")) return 2;
        if(week.equals("wed")) return 3;
        if(week.equals("thu")) return 4;
        if(week.equals("fri")) return 5;
        if(week.equals("sat")) return 6;
        else return 0;

    }

    public void printCalendar(int year, int month, int weekday){
        System.out.printf("           %4d     \n",year);
        System.out.println("<< "+printMonth(month-1)+"      "+printMonth(month)+"      "+printMonth(month+1)+" >>");
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

        for(int i =0; i<weekday; i++){
            System.out.print("    ");
        }
        int maxDay = getMaxDaysOfMonths(year,month);
        int count = 7 - weekday;
        int delim = (count < 7) ? count : 0;

        for(int i = 1; i<= count;i++){
            System.out.printf("%4d", i);
        }
        System.out.println();

        count++;
        for(int i= count; i<=maxDay;i++){
            System.out.printf("%4d", i);
            if(i % 7 == delim){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
//        System.out.println("  1   2   3   4   5   6   7");
//        System.out.println("  8   9  10  11  12  13  14");
//        System.out.println(" 15  16  17  18  19  20  21");
//        System.out.println(" 22  23  24  25  26  27  28");
//        System.out.println(" 29  30                    ");
//
    }


}
