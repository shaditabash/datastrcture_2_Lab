/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

import java.util.Arrays;
import static javaapplication78.remove.removeTheElement;

/**
 *
 * @author LENOVO
 */
public class JavaApplication78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                int index=0;
       
               int arr[]= { 25,14,56,15,36 };
               
               System.err.println("element is arr[]"+"^_^"+Arrays.toString(arr));

               int newarr[]=new int[arr.length-1];
               int k=0;
               for (int i = 0; i < arr.length; i++) {


                 
                    if(i==index){
                    continue;}
                    
               newarr[k++]= arr[i];
        }
               
             System.err.println("element is newarr[]"+"~**~"+Arrays.toString(newarr));
    }
    
}
