package _20240118;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//qoduf
//-배열에 저장할 자료형 선언하고, 배열 이름과 크기를 선언해야함
//-배열의 워소는 모두 같은 타입
//- 처음 선언한 배열 크기 변경 불가능(단, ArrayList 컬렉션의 경우, 동적으로 크기 조절가능)
public class ArrayEx {
    public static void main(String[] args) {

        //배열 변수선언
        // - 두가지 방법이 있으나 관례적으로 첫번째 방법 사용
        //1. 타입[]변수;
        //2.타입 변수[];
        int[] arr1;
        int arr2[];

        //배열 변수는 "참조변수" 배열도 객체이므로 힙 영역에 생성되고, 배열 변수는 힙 영역의 주소를 저장
        //null 저장 가능(null로 초기화)
        //ex. 타입[] 변수 =null;
        // => 배열 변수가 null 값을 가진 상태에서는 변수[인덱스]로 값을 읽거나 저장하게 되면 NullPointerExcpetion
        String[] temp = null;
        System.out.println(temp); //출력 : null
        //  System.out.prinln(temp[0]); //  NullPointerException;

        // -값 목록으로 배열 변수 선언과 배열 생성
        int[] intArray = {16,22,34,41,59};
        System.out.println("intArray[0]: " + intArray[0]);
        System.out.println("intArray[1]: " + intArray[1]);
        System.out.println("intArray[2]: " + intArray[2]);
        System.out.println("intArray: " + intArray); //참조값 저장

        intArray[1] = 77; //인덱스 1번 항복값변경
        System.out.println("intArray[1]: " + intArray[1]);
        //주의, 중괄호로 감싼 목록을 배열 변ㄴ수에 대입할 때, 배열 변수 미리 선언한 수에는 값 목록을 변수에 대입
        char[] charArray;
        //charArray = {'A','B','C'};
        //배열변수 선언 시점과 , 값 목록 대입하는 시점이 다르다면 "new 타입[]"을 중괄호 앞에 붙여서 대입
        charArray = new char[]{'A','B','C'};
        System.out.println("charArray[0] :" + charArray[0]);
        System.out.println("charArray[0] :" + charArray[1]);

        // -new 연산자로 배열 선언과 배열 생성
        // :new 연산자로 배열 처음 생성하면 배열 항모을 기본 값으로 초기화하게 됨
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화 된 값: " + doubleArray[0]);
        doubleArray[0]=0.1;
        doubleArray[1]=1.1;
        doubleArray[2]=3.4;
        System.out.println("doubleArray[0] :" + doubleArray[0]);
        System.out.println("doubleArray[0] :" + doubleArray[1]);
        System.out.println("doubleArray[0] :" + doubleArray[2]);

        /////////////
        // 배열길이
        //- 배열변수.length;
        //-length 필드는 읽기만 가능, 값 변경 불가능;
        System.out.println("doubleArray length : " + doubleArray.length);

        // - 배열 길이를 벗어난다면?
        // System.out.println(doubleArray[doubleArray.legnth]); // ArrayIndexOut...

        ///////////
        // 배열 출력
        //-toString() : 배열 내용을 문자열로 변환하여 반환
        // - 배열이름으로 배열 주소값이 아닌 배열 내부 값을 모두 보고싶을 때
        System.out.println("intArray : "+ Arrays.toString(intArray));
        System.out.println("charArray : "+ Arrays.toString(charArray));
        System.out.println("doubleArray : "+ Arrays.toString(doubleArray));
        System.out.println("doubleArray : "+ Arrays.toString(doubleArray));


        ////////////////////
        //다차원 배열
        //- 배열 안에 또 다른 배열이 존재하는 배열
        // 2 x 3 배열 생성 및 초기화
        int[][] matrix = {{1,2,3},{4,5,6}};

        //3x2 배열 생성 및 초기화
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;

        //3차원 배열 생성 및 초기화
        int[][][] threeDimensionArray ={{{1,2},{3,4}},{{5,6},{7,8}}};

        System.out.println("matrix : ");
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matrix : ");
        for(int i = 0; i<matrix.length; i++){
            System.out.println("matrix.length : " + matrix.length);
            for(int j =0; j<matrix[i].length; j++){
                System.out.println("matrix[i].length : " + matrix[i].length);
                //(0,0) (0,1) (0,2)
                //(1,0) (1,1) (1,2)
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("matrix2 : ");
        for(int i = 0; i<matrix2.length; i++){
            for(int j =0; j<matrix2[i].length; j++){
                //(0,0) (0,1) (0,2)
                //(1,0) (1,1) (1,2)
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        //3차원 배열 출력 값
        System.out.println("matrix3 : ");
        for(int i = 0; i<threeDimensionArray.length; i++){
            for(int j =0; j<threeDimensionArray[i].length; j++) {
                for (int k = 0; k < threeDimensionArray[i][j].length; k++)
                    System.out.print(threeDimensionArray[i][j][k] + " ");
            }
            System.out.println();
            }
        //////////////////
        //배열복사
        // - 배열은 크기가 고정
        // -> 더많은 저장공간 필요하다면 더 큰 길이의 배열ㅇ을 새로 만들어 기존 배열을 복사

        //ver1. 반복문으로 요소 하나씩 복사
        int[] originArray = {1,2,3};
        int[] newArray = new int[5];

        for (int i=0; i<originArray.length; i++){
            newArray[i] =originArray[i];
        }
        System.out.println(Arrays.toString(newArray));//[1,2,3,0,0]


        //ver2. arraycopy() 사용
        // : System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // - Object src : 원본 배열
        // - int srcPos : 원본 배열 복사 시작 인덱스
        // - Object dest: 새 배열
        // - int destPos : 새 배열 붙여넣기 시작 할 인덱스
        // - int length : 복사 항목수

        String[] originFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];


//        System.arraycopy(originFruits,0,newFruits,0,originFruits.length);
        System.arraycopy(originFruits,1,newFruits,1,originFruits.length -2 );
        System.out.println(Arrays.toString(newFruits));

        }










    }

