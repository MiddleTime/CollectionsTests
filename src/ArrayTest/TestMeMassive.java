/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayTest;

import java.util.Arrays;

/**
 *
 * @author inbox_bv8awe9
 */
public class TestMeMassive {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i <= 10; i++) {  // будет ошибка, которую легко решит В  ArayList в
            x[i] = i;
            
        }
        System.out.println(x);
        System.out.println(Arrays.toString(x));
    }
 
}
