/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import array.noDuplicate.NoDuplicateVerificator;
import array.noDuplicate.impl.NoDuplicateVerificatorStringUtilsImpl;

/**
 *
 * @author Daniel
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputString = "test";
        char inputChar = 'e';
        
        NoDuplicateVerificator verificator = new NoDuplicateVerificatorStringUtilsImpl();
        
        System.out.println(verificator.verify(inputString, inputChar));
    }
    
}
