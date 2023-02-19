package java_basics.collections;

import java.util.HashSet;

public class MyArrayLists {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(344);
        set.add("valens");
        set.add(344);

        for(Object bj : set){
            System.out.println(bj);
        }
        System.out.println(set.size());
    }
}
