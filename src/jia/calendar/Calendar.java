package jia.calendar;

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        System.out.println("  1   2   3   4   5   6   7");
        System.out.println("  8   9  10  11  12  13  14");
        System.out.println(" 15  16  17  18  19  20  21");
        System.out.println(" 22  23  24  25  26  27  28");
        System.out.println(" 29  30                    ");

        Scanner input = new Scanner(System.in);
        System.out.println("달을 입력하세요");
        int month = input.nextInt();

        int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.printf("%d일은 %d일까지 입니다. \n", month, maxDays[month-1]);
        input.close();
    }
}
