package _20240116_02;

public class Prac5 {
    public static void main(String[] args) {
        Prac5 ol = new Prac5();
        System.out.println("반지름이 5인 원의 넓이 : " +ol.calc(5));
        System.out.println("가로4 세로7인 직사각형의 넓이 : " +ol.calc(4,7));
        System.out.println("밑변6 높이3인 직사각형의 넓이 : " +ol.calc(6.0,3.0));

    }
    public double calc(double a){
        return Math.PI * a*a;
    }

    public int calc(int a, int b){
        return a*b;
    }

    public double calc(double a, double b){
        return a*b/2;
    }

}

