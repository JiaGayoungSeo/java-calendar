package jia.calendar;

import java.util.Scanner;

public class Prompt {

    public static void runPrompt(){

        Scanner input = new Scanner(System.in);
        Calendar cal = new Calendar();
        int month = 1;
        int year = 0;

        while(true){
            System.out.println("연도를 입력하세요");
            System.out.print("YEAR> ");
            year =input.nextInt();

            System.out.println("달을 입력하세요");
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
