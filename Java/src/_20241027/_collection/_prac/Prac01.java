package _20241027._collection._prac;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prac01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //
        Set <Integer> uniqieIntergers = new HashSet<>();
        System.out.println("정수를 입력하시오. -1을 입력하면 종료됩니다.");

        while (true){
            System.out.print("정수입력:");
            int input = sc.nextInt();
            if(input == -1){
                break;
            }
            uniqieIntergers.add(input);

        }
        System.out.println("중복 제거된 정수목록 : "+ uniqieIntergers);
        sc.close();
    }
    }


