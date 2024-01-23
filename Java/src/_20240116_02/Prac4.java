package _20240116_02;

import java.util.Scanner;

public class Prac4 {
    public static double sum(double x, double y){
        return x+y;
    }

    public static double min (double x, double y){
        return x - y;
    }

    public static double mul (double x, double y){
        return x * y;
    }

    public static double div (double x, double y){
        return x / y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 두 개를 입력하세요");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("덧셈 : " + sum(x,y));
        System.out.println("뺄셈 : "+ min(x,y));
        System.out.println("곱셈 : "+ mul(x,y));
        System.out.println("나눗셈 : "+ div(x,y));
    }
}
