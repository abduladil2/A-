/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package astar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
/**
 *
 * @author AbdulAdil
 */
public class Astar {
    
    public Astar(){
      String[5] start={'A','B','C','D','E'};
      public String user="";
      public String goal="";
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your current Location");
try{
        user=br.read();
        if(user!=null){
            System.out.pritln("");
}
}
catch(IOException e){
System.out.println("Try again");
}
}   
}
