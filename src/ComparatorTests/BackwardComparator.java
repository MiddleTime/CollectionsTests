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
public class BackwardComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
           if(o1 > o2){
            return -1; 
        }else if(o1 < o2) {
            return 1;
        }else {
            return 0;
        } 
    }
    
}
