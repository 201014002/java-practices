/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3;

import java.io.File;

/**
 *
 * @author User
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dir= new File("C:/Users/User/Desktop/dir");
        dir.mkdir();
        File dir1=new File("C:/Users/User/Desktop/dir/filder1");
        dir.mkdir();
        File dir2=new File("C:/Users/User/Desktop/dir/folder2");
        dir.mkdir();
        File f1=new File("C:/Users/User/Desktop/dir/filder1/file1");
        File f2=new File("C:/Users/User/Desktop/dir/filder1/file2");
        File dir3=new File("C:/Users/User/Desktop/dir/folder2/folder21");
        dir.mkdir();
        File f3=new File("C:/Users/User/Desktop/dir/folder2/folder21/file21");
        File f4=new File("C:/Users/User/Desktop/dir/folder2/folder21/file22");
    }
    
}
