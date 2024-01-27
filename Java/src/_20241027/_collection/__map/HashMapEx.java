package _20241027._collection.__map;

import java.lang.reflect.GenericDeclaration;
import java.net.InterfaceAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        //키 id, 값은 name 인 HashMap 예쩨

        //Map 컬렉셔 생성
        Map<Integer,String> map = new HashMap<>();

        //객체저장
        map.put(1001,"홍길동");
        map.put(1002,"성춘향");
        map.put(1003,"김민지");
        map.put(1004,"강해린");

        //전체 객체 수
        int size = map.size();
        System.out.printf("총 %d 명의 학생이 있습니다",size);

        //키로 값을 얻기
        int key = 1003;
        String value = map.get(key);
        System.out.printf("%d 번의 해당하는 학생은 %s 입니다. %n%n",key, value );

        //키와 값으로 구성된 모든 map,Entry 객체를 set에 담아 리턴
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        Iterator<Map.Entry<Integer,String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer,String> entry = entryIterator.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.printf("%s학생은 %d번 입니다.%n",v,k);

        }

        Set<Integer> KeySet = map.keySet();
        System.out.println(KeySet);

        //주어진 키와 일치하는 entry 삭제

        String deletedValue = map.remove(key);
        System.out.printf("%s 학생이 삭제되었습니다. %n",deletedValue);

    }
}
