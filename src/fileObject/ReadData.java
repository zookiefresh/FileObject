/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileObject;


import java.io.*;
/**
 *
 * @author User
 */
public class ReadData {
    public static void main(String[] args){
        InputStreamReader inR = new InputStreamReader(System.in);
        BufferedReader binR = new BufferedReader(inR);
        
        String line = null;
        
        try{
            System.out.println("Enter something bitch");
            while((line = binR.readLine()) != null){
                if(line.equalsIgnoreCase("quit")){
                    break;
                }
                else{
                    System.out.println("This is what you wrote bitch:" + line);
                }
            }
        }
        catch (IOException IOEx){
            System.out.println(IOEx.getMessage());
        }
    }    
}
