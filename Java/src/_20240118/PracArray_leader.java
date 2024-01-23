package _20240118;

import java.util.Scanner;

public class PracArray_leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //5개의 정수를 받을 배열 생성
        int[] num = new int[5];

        System.out.println("5개의 정수를 입력하세요");

        //사용자의 5개 정수 입력받기
        for(int i =0; i<5; i++){
            num[i] = sc.nextInt();

        }
        double sum =0;
        for ( int nums:num){
            sum += nums;
        }
        double average = sum/5;
        System.out.println("평균:"+average);
    }
}
