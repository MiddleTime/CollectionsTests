/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author inbox_bv8awe9
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();  //не указываем размер нашей коллекции
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList.toString());
        
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));
        
        System.out.println(arrayList.get(arrayList.size()-1));
        
        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
            
        }
        for (Integer x : arrayList) {
            System.out.println(x);
        }
        //тоже самое с лямбда
        arrayList.forEach((x) -> {
            System.out.println(x);
        });
        
        arrayList.remove(99);  //легко удалять элементы   (но очень не эффективно если удаляется элемент в середине или вначае)
        // так как используется обычный массив и по коеф добавляется новый массив (при увеличении) и туда копируются все эелементы из 
        //страрого массива. 
        
        //arrayList.remove(5);  // может остаться массив с дыркой. Все перестраивается, поэтому медленно.
        // кога такое часто, то лучше использовать LinkedList
        
        System.out.println(arrayList);
        
        //преимущество полиморфизма. Только потом перенести в него элементы из Arralist
        arrayList = new LinkedList<>();
        System.out.println(arrayList);
        
    }
}
