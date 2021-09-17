/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapplication;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JOSHI
 */
public class StudentInfo1 {
     public static void dataRepresentation(String input){
    String data= input;
    String key,values;
    
        Map<String ,String> map=new HashMap();
        String[] token1;
        token1=data.split("\\?");
        String[] href=token1[0].split("=");
        key=href[0];
        values=href[1];
        map.put(key, values);
        System.out.println(" "+key +" = "+values);
        
        String[] token2=token1[1].split("&");
        for(int i=0;i<3;i++){
        String[] href1=token2[i].split("=");
         key=href1[0];
        values=href1[1];
        map.put(key, values);
                System.out.println(" "+key +" = "+values);

        }
         String[] token3;
        token2=data.split("//?");
        String[] href2=token2[3].split("=");
        key=href2[0];
        values=href2[1];
        map.put(key, values);
        System.out.println(" "+key +" = "+values);
        }
    public static void main(String[] args)  {
         String input = "href=https://www.GovtPolyLatur.com/search?branch=ProjectDevelopment&age=20&gender=female&imageUrl=\"https://www.techrel.com?id=500\"";
        dataRepresentation(input);
    }
}    


