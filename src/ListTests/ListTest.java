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

        measureTime(arrayList);
        measureTime(linkedList);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            //list.add(i);  //быстре для ArrayList 
            list.add(0, i); //быстрее для LIckedList
            
        }
//        for (int i = 0; i < 100000; i++) {
//            list.get(i);
//            
//        }
        
        long end = System.currentTimeMillis();
        System.out.println("diff " + (end - start));
        System.out.println("");
    }
}
