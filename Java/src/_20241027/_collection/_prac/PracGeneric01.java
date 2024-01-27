package _20241027._collection._prac;

public class PracGeneric01<K,V> {
    private K key;
    private V value;
    public PracGeneric01(K key, V value){
        this.key = key;
        this.value= value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        PracGeneric01<String,Integer> pair1 = new PracGeneric01<>("One",1);

        System.out.println("key :"+ pair1.getKey() + ",value:"+pair1.getValue());
    }
}
