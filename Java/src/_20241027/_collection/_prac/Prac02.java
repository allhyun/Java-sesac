package _20241027._collection._prac;

import com.sun.source.tree.UsesTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Prac02 {
    public static void main(String[] args) {
        //사용자로부터 입력 받기 Scanner
        Scanner sc = new Scanner(System.in);

        //이름 나이 입력값 받기

        Map<String,Integer> nameAgeMap = new HashMap<>();
        System.out.println("이름과 나이를 입력하세요. 종료를 입력하면 종료됩니다");
        while(true) {

            //이름 입력받음
            System.out.println("이름 : ");
            String name = sc.nextLine();

            //종료조건
            if (name.equals("종료")) {
                break;
            }
            System.out.println("나이 : ");
            int age = sc.nextInt();
            sc.nextLine();

            //map은 add말고 put
            nameAgeMap.put(name,age);

        }
        System.out.println("\n== 입력 받은 이름과 나이 목록 ==");


        //entrySet() 이용해서 for 반복
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println(
                    "이름: " + entry.getKey() + ", 나이: " + entry.getValue()
            );
        }

        // Scanner 리소스 해제
        sc.close();
    }

}
