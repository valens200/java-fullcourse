package collections;


import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        HashMap romans = new HashMap();
        romans.put("I", 1);
        romans.put("II", 2);
        romans.put("III", 3);
        System.out.println(romans.get("I"));

    }

}
