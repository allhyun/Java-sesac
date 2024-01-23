package _20240118;

import java.util.Scanner;

public class PracArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] arr1 =new int[5];
        int sum = 0;


        System.out.println("5개의 정수를 입력하세요" );
        for(int i = 0; i<arr1.length; i++){
//            System.out.print(i+1);
            arr1[i] = sc.nextInt();
            sum += arr1[i];

        }

        double average = sum/5;
        System.out.println("평균:"+average);

    }

}
