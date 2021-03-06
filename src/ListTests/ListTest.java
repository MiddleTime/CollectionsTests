/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListTests;

import java.util.*;

/**
 *
 * @author inbox_bv8awe9
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    
    //протестируем скорость работы LickedList and ArrayList
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(arrayList, "arraylist");
        measureTime(linkedList, "linkedList");
    }

    private static void measureTime(List<Integer> list, String decs) {
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            list.add(i);  //быстре для ArrayList   - записывает в конец коллекции
           // list.add(0, i); //быстрее для LIckedList  - здесь мы добавляем вначало списка. []-> [0]-> [1][0]
            // 
        }
        for (int i = 0; i < 100000; i++) {
            list.get(i);
            
        }
        
        long end = System.currentTimeMillis();
        System.out.println(decs + " diff " + (end - start));
        System.out.println("");
    }
}
