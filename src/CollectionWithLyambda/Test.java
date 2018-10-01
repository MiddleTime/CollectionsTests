/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionWithLyambda;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author inbox_bv8awe9
 */
public class Test {
    //сделаем массив и список
    public static void main(String[] args) {
        
    
    int[] array = new int[10];
    List<Integer> list = new ArrayList<>();
    
    //сделаем методы по первоначальному заполнению
    fillArray(array);
    fillList(list);
    
        System.out.println(Arrays.toString(array));
        System.out.println(list);
    
        //а теперь при помощи лямбда-выражения умножим каждый элемент на два
        //без использования циклов. особенно эффективно для коллекций.
        //map - это пришло из функциональных языков
        array = Arrays.stream(array).map(a-> a*2).toArray();
        list = list.stream().map(a->a*2).collect(Collectors.toList());
        
         System.out.println(Arrays.toString(array));
        System.out.println(list);
        
        //также легко, например, все элементы массива сделать одинаковыми))
//        array = Arrays.stream(array).map(a->3).toArray();
//        System.out.println(Arrays.toString(array));
       array = Arrays.stream(array).map(a->a /2).toArray();
//        System.out.println(Arrays.toString(array));        

        //фильтр 
        array = Arrays.stream(array).filter(a -> a%2==0).toArray();
        System.out.println(Arrays.toString(array));
        
        //Пройти по элементам. Аналоги цикла. чтобы быстро пройти по элементам коллекции, но не может менять
        Arrays.stream(array).forEach(a-> System.out.println(a));
        list.stream().forEach(a -> System.out.println(a));
        //или же еще короче
        Arrays.stream(array).forEach(System.out::println);
        list.stream().forEach(System.out::println);   
        
    }
    
    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
            
        }
    }
     private static void fillArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i+1;
            
        }
    }
}
