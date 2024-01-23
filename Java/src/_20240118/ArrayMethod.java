package _20240118;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {

        //Array메소드
        // CopyOf(arr, copyArrayLength) 메소드
        int[] originalArray = {1,2,3,4,5};
        int[] copiedArray = Arrays.copyOf(originalArray, 3);
        System.out.println("original Array : " + Arrays.toString(originalArray)); //  [1,2,3,4,5]
        System.out.println("copied Array : " + Arrays.toString(copiedArray)); // [1,2,3]


        //copyOfRange(arr, sIdx, eIdx) 메소드
        int[] rangeArray = Arrays.copyOfRange(originalArray,1,4);
        System.out.println("range array : "+ Arrays.toString(rangeArray)); //[2,3,4]


        // fill(arr, n) 메소드
        int[] filledArray = new int[5];
        System.out.println("filled array (before) :"+ Arrays.toString(filledArray));//[0,0,0,0,0]
        Arrays.fill(filledArray,7);
        System.out.println("filled array (after) :"+ Arrays.toString(filledArray));//[7,7,7,7,7]

        //sort(Arr)메소드
        int[] unsortedArray = {5,4,3,2,1};
        Arrays.sort(unsortedArray);
        System.out.println("sorted array : " + Arrays. toString(unsortedArray)); //[1,2,3,4,5]


        // equals(arr1,arrr2) 메소드
        int[] array1 ={1,2,3};
        int[] array2 ={1,2,3};
        int[] array3 ={4,2,3};

        boolean arraysEqual = Arrays.equals(array1, array2);

        boolean arraysEqual2 = Arrays.equals(array1, array3);

        System.out.println("Array Equal 1 vs 2 :" + arraysEqual); //true
        System.out.println("Array Equal 1 vs 3 :" + arraysEqual2);//false

        // == 비교
        System.out.println("Array == 1 vs 2 :" + (array1 == array2)); //true
        System.out.println("Array == 1 vs 3 :" +(array1 == array3));//false


        //deepEquals(arr1,arr2) 메소드
        int[][] deepArray1 = {{1,2},{3,4}};
        int[][] deepArray2 = {{1,2},{3,4}};
        int[][] deepArray3 = {{1,2},{4,5}};

        boolean deepArrayEquals = Arrays.deepEquals(deepArray1,deepArray2);
        boolean deepArrayEquals2 = Arrays.deepEquals(deepArray1,deepArray3);

        System.out.println("deep array equals 1 vs 2" + deepArrayEquals);//true
        System.out.println("deep array equals 1 vs 3" + deepArrayEquals2);//false


        //binarySearch( arr, val ) 메소드 (단, 배열은 정렬된 상태여야함)
        int[] sortedArray = {10,20,30,40,50};
        int index = Arrays.binarySearch(sortedArray, 50);
        System.out.println(" inx of 50 : "+ index); // 4

    }
}
