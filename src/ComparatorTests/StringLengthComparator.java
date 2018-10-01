/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparatorTests;

import java.util.Comparator;

/**
 *
 * @author inbox_bv8awe9
 */
public class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1; //это по конвенции. Если больше - то 1, если меньше то -1, если равно то 0
        }else if(o1.length() < o2.length()) {
            return -1;
        }else {
            return 0;
        }
    }
    
}
