package jia.calendar;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT="month> ";

    public static void runPrompt(){

        Scanner input = new Scanner(System.in);
        Calendar cal = new Calendar();
        int month = 1;
        while(true){
            System.out.println("달을 입력하세요");
            System.out.printf(PROMPT);
            month = input.nextInt();
            if(month<1 || month>12){
                break;
            }
            cal.printCalendar(2017, month);
        }
        input.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
