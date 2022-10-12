package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 준비
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("임영웅", 31);
        map.put("영탁", 38);
        map.put("이찬원", 25);
        map.put("임영웅", 30); // "임영웅" 위와 같은 키이므로 제일 마지막에 저장한 값으로 대체
        System.out.println("총 Entry 수 : " + map.size());

        // 객체 찾기
        System.out.println("\t임영웅 : " + map.get("임영웅")); // 이름(키)으로 점수(값)를 검색
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet(); // Key Set 얻기
        Iterator<String> keyIterator = keySet.iterator();

        // 반복해서 키를 얻고 값을 Map에서 얻어냄
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 삭제
        map.remove("임영웅"); // 키로 Map.Entry를 제거
        System.out.println("총 Entry 수 : " + map.size());

        // 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry set 얻기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        // 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 전체 삭제
        map.clear(); // 모든 Map.Entry 삭제
        System.out.println("총 Entry 수 : " + map.size());
    }
}

