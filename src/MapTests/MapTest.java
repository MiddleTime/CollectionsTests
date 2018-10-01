/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapTests;

import java.util.*;

/**
 *
 * @author inbox_bv8awe9
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "это цифра ОДИН");
        map.put(2, "это цифра ДВА");
        map.put(3, "это цифра ТРИ");
        
        System.out.println(map);
        
        //пример того, что в map не может быть дублей ключа.
        map.put(3, "это цифра ЧЕТЫРЕЕ");
        System.out.println(map);
        
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // тоже самое - обход map по новому с испльзованием 8 java
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
    }
}
