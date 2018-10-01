/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparatorTests;

import java.util.*;

/**
 *
 * @author inbox_bv8awe9
 */
public class ComparatorTest {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        
        animals.add("a");
        animals.add("mama");
        animals.add("to");
        animals.add("sleep");
        animals.add("game over");
        animals.add("list");
        
        //сортируем своим созданным Компаратором, который сортирует по длине строки
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(54);
        numbers.add(54);
        numbers.add(488);
        numbers.add(28277);
        numbers.add(0);
        numbers.add(28);
        numbers.add(58772);
        
        Collections.sort(numbers, new BackwardComparator());
        System.out.println(numbers);
    }
}
