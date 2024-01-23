package _20240120;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PracException1 {
    public static void main(String[] args) {

        //1번
//        int[] intArray;
        //크기가 4인 배열 설정
        int[] intArray = new int[4];


        //
        try {
            System.out.println("시작");
//            int[] intArray = {1,2,3,4,5};
            for (int i = 0; i <= 5; i++) {
                //배열 크기를 벗어나는 인덕스에 접급
                //0부터의 값을 넣는다
                intArray[i] = i;
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //예외처리
            System.out.println("인덱스가 범위를 벗어났습니다" + e.toString());
        }


        //2번
        Scanner scanner = new Scanner(System.in);

        //예외처리 위해서 try 로 감싸자~

        try {
            //배열 크기 입력
            System.out.println("배열을 입력하세요 :");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalStateException("배열크기는 1 이상이어야합니다.");
            }
            //배열 생성
            int[] arr = new int[number];

            //배열 요소 입력

            System.out.println(number + "개의 정수를 입력하시오");
            int sum = 0;
            for (int i = 0; i < number; i++) {
//                System.out.print(i + 1);
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            //평균 계산     // double -> 형변환
            double average = (double) sum / number;
            System.out.println("평균은 " + average + "입니다.");
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Scanner 닫기
            scanner.close();
        }


        //3번
//        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("배열크기를 입력하세요 :");
            int nums = sc.nextInt();
            //배열 생성
            int[] arr = new int[nums];

            if (nums <= 0) {
                throw new IllegalStateException("정수만 입력");
            }
            // 배열 요소 입력
            System.out.println(nums + "개의 정수를 입력하세요");
            for (int i = 0; i <= nums; i++) {
                System.out.print(i);
                arr[i] = sc.nextInt();
            }

            //중복된 요소를 찾아라
            // Integer -> 숫자

            ArrayList<Integer> list = findDuplivates(arr);

            if (list.isEmpty()) {
                System.out.println("중복된 요소가 없습니다");
            } else {
                System.out.println("중복 발견 " + list);
            }

        } catch (InputMismatchException e) {
            System.out.println("입력 오류");

        } finally {
            scanner.close();
        }
    }

        //ArrayList 메소드 사용하기
        //중복된 요소를 찾는 메소드..

        public static ArrayList<Integer> findDuplivates ( int[] arr){

            //반환할 arraylist를 만들자
            ArrayList<Integer> dupli = new ArrayList<>();

            //for문 이용해서 중복을 찾아라
            for (int i = 0; i < arr.length - 1; i++) {
                //이중 for문을 돌 것
                // 1 2 3 4 5
                //1 에 대해서 2,3,4,5 -> i =0일때, j =1 ~ length -1
                //2 에 대해서 3,4,5 중복을 찾아야하니까 이중 for문 돌 려갸야함
                //3 에 대해서 4,5
                //4 에대해서 5 검사
                // 5는 검사할 필요 없으니..arr.length -1.....
                for (int j = i + 1; j < arr.length; j++) { // 마지막까지 돌아야하니까...arr.length로...
                    //1 2 1 1 이라고 했을때
                    if (arr[i] == arr[j] && !dupli.contains(arr[i])) {
                        //중복된 요소만 추가
                        dupli.add(arr[i]);
                        // -> dupli : [1]
                    }
                }

            }
            return dupli;
        }
    }