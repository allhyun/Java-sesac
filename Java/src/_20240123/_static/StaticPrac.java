package _20240123._static;

import java.util.ArrayList;
import java.util.Scanner;

public class StaticPrac {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생정보를 입력하세요");
           ArrayList<StaticPracTotal> studentList =new ArrayList<>();

        while(true){
            String name = scanner.next();
            int student_ID = scanner.nextInt();
            int grade = scanner.nextInt();
            if(grade == 4){
                break;
            }
            StaticPracTotal student = new StaticPracTotal(name,student_ID,grade);
            studentList.add(student);
        }


        for ( StaticPracTotal student : studentList) {
            System.out.println("===학생정보===");
            System.out.println("이름:" + student.getName());
            System.out.println("학번 :" + student.getStudent_ID());
            System.out.println("학년 :" + student.getGrade());


        }

           System.out.println("전체 학생 수: " + StaticPracTotal.getTotalStudents());


//        int plusTotal = StaticPracTotal.plus();
    }




}
