package _20240120;


//예외 처리
// - 일반 예외(Exception) :컴파일러가 예외 처리 코드 여부를 검사하는 예외
// - 실행 예외 (Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외
// => Java 는 예외가 발생하면 예외 클래스로부터 객체 생성하며, 해당 객체는 예외 처리시 사용됨
// 예외 발생시 프로그램의 갑작스런 종료를 막고 정상 실행 할 수 있도록 처리하는 코드를 예외처리 코드라고 함
// try - catch -finally 블록으로 처리

//try블록에서 작성한 코드가 예외 없이 정상 실행 -> catch 실행 X, finally 실행 o
//try블록에서 작성한 코드가 예외가 발생하면 -> catch 실행 o, finally 실행 o
//심지어 try 블록과 catch 블록에서 return 문을 사용해도 finally 는 항상 실행됨 (finally 생략가능)

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

    public static String divide( int x , int y) {return x + " / "+y+" ="+(x/y);}

    public static int getLength(String str){ return str.length();}

    public static int getValueByIdx(int[] arr, int idx){
        return arr[idx];
    }

    public static void main(String[] args) {
        //System.out.println(divide(6,0));//java.lang.ArithemticException 에러


        //case1 예외처리 코드
        try {
            System.out.println("***연산 시작! ");
            System.out.println(divide(6, 0));
        }catch(ArithmeticException e){
            //예외 출력 방법
            // 방법 1 :예외 발생한 이유만 보여줌
            System.out.println("나누기 중 에러 발생 >"+e.getMessage()); //by Zero

            //방법 2 : 예외 종류 리턴
            System.out.println("나누기 중 에러 발생 >"+e.toString()); //java.lang.ArithemticException 에러

            // 방법 3 : 예외가 어디서 발생했는지 추적한 내용을 출력
            //e.printStackTrace(); 에러발생위치
//            java.lang.ArithmeticException: / by zero
//            at _20240120.ExceptionEx.divide(ExceptionEx.java:17)
//            at _20240120.ExceptionEx.main(ExceptionEx.java:32)
        }finally {
            System.out.println("***연산종료!!");
        }


        ///////////////////
        // case2 예외 발생 코드
//        System.out.println("단어 길이 : " + getLength(null)); //java.lang.NullPointerException 에러

        // case2 예외 처리 코드
        try{
            System.out.println("단어 길이 : " + getLength(null));
        }catch(NullPointerException e ){
            System.out.println("단어 길이 연산 중 에러 발생 >> " + e.toString());
            //java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        }


        //////////////////////
        // case3 예외 발생코드
        int[] numbers = {10,20,30,40,50};
//        System.out.println(getValueByIdx(numbers,numbers.length));//.ArrayIndexOutOfBoundsException 에러 발생

        // case3 예외처리코드

        try {
            System.out.println(getValueByIdx(numbers,numbers.length));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱싱 중 에러 발생 >>"+ e. toString());
            // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }


        //////////////////////
        // case 4
        Scanner scanner= new Scanner(System.in);

        try{
            System.out.println("정수를 입력하게요 :");
            int number = scanner.nextInt();
            System.out.println("입력한 정수 : " + number);
        }catch (InputMismatchException e){
            //정수 이외의 값이 입력되면 에러 발생
            System.out.println("InputMismatchException 발생"+e.toString());
        }




    }
}
