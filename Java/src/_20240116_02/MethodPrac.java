package _20240116_02;

import java.util.Scanner;

public class MethodPrac {
    public void clac(double x, double y){
        System.out.printf("덧셈결과 : %.1f" , x + y ).println();
        System.out.printf("뺄셈결과 : %.1f" , x - y ).println();
        System.out.printf("나눗셈결과 : %.1f" , x / y ).println();
        System.out.printf("곱셈결과 : %.1f" , x * y ).println();


    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MethodPrac pr = new MethodPrac();

        System.out.println("숫자 두개 입력해주세요 : ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
//        MethodPrac.clac(n1,n2);
        sc.close();
    }
}
