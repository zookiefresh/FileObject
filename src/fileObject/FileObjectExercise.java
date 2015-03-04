/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileObject;

import java.io.File;

/**
 *
 * @author User
 */
public class FileObjectExercise {
    public static void main(String[] args){
        File myDir = new File("C:/javatemp");
        System.out.println(myDir.isDirectory() ? "yep" : "nope");
        
        File myFile = new File(myDir, "file.txt");
        System.out.println(myFile.getName());
        System.out.println(myFile.getPath());
        
        File newDir = new File(myDir, "newDir");
        newDir.mkdir();
        String[] folders = myDir.list();
        
       for(String f :folders){
           System.out.println(f);
       }

    }    
}
