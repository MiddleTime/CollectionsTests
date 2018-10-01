/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetTests;

import java.util.*;

/**
 *
 * @author inbox_bv8awe9
 */
public class SetTest {
    public static void main(String[] args) {
        //множества. Обеспечивается уникальность, не может быть двух одинаковых объектов
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();//поддерживается упорядочивание
        
        hashSet.add("Bob");
        hashSet.add("lisa");
        hashSet.add("German");
        hashSet.add("Bob");  //для примера того, что дублей нет.
        hashSet.add("Ivan");
        
//        for (String name : hashSet) {
//            System.out.println(name);
//        }
        //такой же цикла только java 8
        hashSet.forEach((name) -> {
            System.out.println(name);
        });
     
        System.out.println("\n"+hashSet.contains("Bob"));  //очень быстро работает если HashSet
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet );
        
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        //union - объединение множеств
        Set<Integer> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        System.out.println(setUnion);
        
        //intersection - переcечение множеств
        Set<Integer> setIntersection = new HashSet<>(set1);
        setIntersection.retainAll(set2);
        System.out.println(setIntersection);
        
        //difference - разность множеств
        Set<Integer> setDifference = new HashSet<>(set1);
        setDifference.removeAll(set2);
        System.out.println(setDifference);
    }
}
