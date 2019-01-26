package jia.calendar;

import java.util.Scanner;

public class Prompt {

    /*
     * @param week weekdays
     * @return 0~6 (0 = Sunday, 6 = Saturday)
     */



    public static void runPrompt(){

        Scanner input = new Scanner(System.in);
        Calendar cal = new Calendar();
        int month = 1;
        int year = 0;

        while(true){
            System.out.println("Enter the year");
            System.out.print("YEAR> ");
            year =input.nextInt();

            System.out.println("Enter the month");
               System.out.print("MONTH> ");
            month = input.nextInt();

            if(month<1 || month>12){
                break;
            }
            cal.printCalendar(year, month);
        }
        input.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
