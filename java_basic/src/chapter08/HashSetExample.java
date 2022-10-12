package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// class AA{}
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // Set<Object> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        // AA a = new AA();
        // set.add(a);
        // set.add(a.toString());

        int size = set.size();
        System.out.println("총 객체 수 : " + size);

        Iterator<String> iterator = set.iterator();
        // Iterator<Object> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            // Object element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체 수 : " + set.size());

        for(String element : set) {
        // for(Object element : set) {
            System.out.println("\t" + element);
        }

        if (set.isEmpty()) {
            System.out.println("비어 있음");
        } else {
            System.out.println("객체 있음");
        }

        set.clear();

        if (set.isEmpty()) {
            System.out.println("비어 있음");
        } else {
            System.out.println("객체 있음");
        }
    }
}




