/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringarraysort;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
  
public class StringArraySort {

	public static void main(String[] args) {
		String strArray[] = {"Hello","Everyone"};
                StringBuffer sb = new StringBuffer();
      for(int i = 0; i < strArray.length; i++) {
         sb.append(strArray[i]);
      }
      String str = sb.toString();
      int sum1 = 0;
      int sum2 =0;
      byte[] bytes = null;
            try {
                bytes = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(StringArraySort.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("ASCII value of " + str + " is following");
            System.out.println(Arrays.toString(bytes));
            //for (int j = 0; j < 5; j++) {  
	           
	       // }  
        
      
	}
        
     public static byte sum(byte... bytes) {
        byte total = 0;
        for (byte b : bytes) {
            total += b;
        }
        return total;
       
     
     

}}

