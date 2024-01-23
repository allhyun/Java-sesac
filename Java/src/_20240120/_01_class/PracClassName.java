package _20240120._01_class;

import java.util.Scanner;

public class PracClassName {
//    public int width;
//    public int height;
//
//    public PracClassName(){
//
//    }
//
//    Scanner sc =new Scanner(System.in);
//    public void areaMethod(){
//        System.out.println(width * height);
//    }
//
//    public static void main(String[] args) {
//        PracClassName area = new PracClassName();
//
//        System.out.println("사각형의 가로 세로 띄어쓰기 기준으로 입력");
//        int width = area.sc.nextInt();
//        int height= area.sc.nextInt();
//        area.width = width;
//        area.height = height;
//        System.out.println(width+ " "+height);
//        area.areaMethod();
//
//    }

    //해설
    public int width1;
    public int height1;

    public PracClassName( int width1, int height1) {
        // 지역변수랑 필드 변수명이 동일하기 때문에 this 사용해서 필드 값에 접근
        this.width1 = width1;
        this.height1 = height1;
    }

    public int area(){
        return width1 * height1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사각형의 가로 세로 띄어쓰기 기준으로 입력");
        int width1 = scanner.nextInt();
        int height1 = scanner.nextInt();

        //입력 받은 값으로 PracClassName 객체를 생성
        PracClassName rectangle= new PracClassName(width1,height1);
        System.out.println("사각형 넓이"+rectangle.area());
        scanner.close();
    }
}
