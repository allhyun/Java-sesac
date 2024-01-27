package _20240123._inheirance._Prac;


// cat 클래스, animal 클래스를 상속받음
public class PracCat extends Prac_interitance {

        // 생성자
        public PracCat(String name, int age) {
            // Animal 클래스의 생성자 호출하여 초기화
            // 변수를 받아서 사용하고있어서 초기화를 해줘야하기 때문이다
            //객체를 만들때 name age받아서 해야하니까 설정해줭햐함
            super("고양이", name, age);
        }

        // makeSound 메소드를 오버라이드하여 각 동물이 내는 소리 출력
        @Override
        public void makeSound() {
            System.out.println("야옹~");
        }
        // Cat 클래스에만 해당하는 메소드 등을 추가할 수 있음
    }


