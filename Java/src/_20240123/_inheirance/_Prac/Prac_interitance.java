package _20240123._inheirance._Prac;

public class Prac_interitance {

    //종 이름 나이 의미 변수
    private String species;
    private String name;
    private int age;

    //생성자 ->갹체를 만들때 자동으로 실행되는 메서드
    public Prac_interitance(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    //makeSound 메소드
    public void makeSound (){
        System.out.println("동물은 소리를 낸다");
    }

    //출력을 위해서 getter만 만들어주기
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
