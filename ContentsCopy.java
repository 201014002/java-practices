/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contentscopy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class ContentsCopy {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    try{
      FileReader fin =  new FileReader("Inout.txt");
      FileWriter fout= new FileWriter("Output.txt");

      int file = fin.read();
      while(file !=-1){
        fout.write(file);
        file=fin.read();
      
      }
      System.out.println("Inout.txt is copied into Output.txt file");
      fin.close();
      fout.close();
    }
    catch(IOException exception){
      System.out.println("Error.File doesn't exist.");
    }
  }
    }
    

