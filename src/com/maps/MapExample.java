package com.maps;
import java.util.*;
public class MapExample {

    public static void main(String[] args) {
        Map<String,Integer> empIds= new TreeMap<>();

        empIds.put("John",12643);
        empIds.put("Carl",53252);
        empIds.put("Angel",72356);
        empIds.put("Mark",28963);
        empIds.put("Zen",89265);

        System.out.println(empIds);

        System.out.println("ID="+empIds.get("Angel"));

        empIds.remove("John");
        System.out.println(empIds);

        System.out.println(empIds.containsKey("John"));
        System.out.println(empIds.containsValue(89265));

        empIds.put("Nayan",65434);

        System.out.println(empIds);

        Set<String> keys= empIds.keySet();
        System.out.println(keys);

        Collection<Integer> values= empIds.values();
        System.out.println(values);

        Iterator<String> i=keys.iterator();

        while(i.hasNext()){
            String key=i.next();

            int value=empIds.get(key);
            System.out.println(key+"-"+value);
        }


    }


}
