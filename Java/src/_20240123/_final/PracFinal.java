package _20240123._final;

import java.util.Scanner;

public class PracFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요");

        final int radius = sc.nextInt();

        System.out.println("원의 반지름 : " + radius);
        double PI = 3.1415926;
        double calculateArea= radius * PI;
        System.out.println("원의 넓이 :"+calculateArea);
    }


}
