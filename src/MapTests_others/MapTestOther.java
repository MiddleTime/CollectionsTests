/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapTests_others;

import java.util.*;

/**
 *
 * @author inbox_bv8awe9
 */
public class MapTestOther {
    public static void main(String[] args) {
        
    
    //здесь внутри не гарантируется никого упорядочивания
    Map<Integer, String> hashMap =new HashMap<>();
    
    //здесь - в каком порядке пары (ключ, значение) были добавлены, в таком порядке
    //они и вернуться
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    
    //здесь - пары (ключ, значение) сортируются по ключу (естественный порядок)
    Map<Integer, String> treeMap = new TreeMap<>();
    
    //теперь выведем на экран, что увидеть порядок вывода   
    testMap(hashMap);
    testMap(linkedHashMap);
    testMap(treeMap);
    
    
    }
    
    public static void testMap (Map<Integer, String> map) {
        map.put(22, "Alisa");
        map.put(1005, "Bob");
        map.put(658, "Alex");
        map.put(4, "Ivan");
        map.put(78, "Mila");
        map.put(821, "Bob"); //знчачения могут быть одинак. только ключи уникальные
        
        System.out.println(map.getClass().getName());
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println("");
        
        
    }
}
