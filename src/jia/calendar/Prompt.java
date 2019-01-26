package jia.calendar;

import java.util.Scanner;

public class Prompt {

    /*
     * @param week weekdays
     * @return 0~6 (0 = Sunday, 6 = Saturday)
     */

    public static int parseDay(String week){
        if(week.equals("sun")) return 0;
        if(week.equals("mon")) return 1;
        if(week.equals("tue")) return 2;
        if(week.equals("wed")) return 3;
        if(week.equals("thu")) return 4;
        if(week.equals("fri")) return 5;
        if(week.equals("sat")) return 6;
        else return 0;

    }

    public static void runPrompt(){

        Scanner input = new Scanner(System.in);
        Calendar cal = new Calendar();
        int month = 1;
        int year = 0;
        int weekday = 0;

        while(true){
            System.out.println("연도를 입력하세요");
            System.out.print("YEAR> ");
            year =input.nextInt();

            System.out.println("달을 입력하세요");
               System.out.print("MONTH> ");
            month = input.nextInt();
            System.out.println("첫째 날의 요일을 입력하세요");
            String str_weekday = input.next();

            weekday = parseDay(str_weekday);


            if(month<1 || month>12){
                break;
            }
            cal.printCalendar(year, month, weekday);
        }
        input.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
