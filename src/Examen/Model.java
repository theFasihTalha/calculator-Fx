/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author talhi
 */
public class Model {
    public static double credit;
    public static String codePin;
    public static double ecran; 
   
    
     public static void appeler(String t){
         if (t.charAt(1)==3) {
              String[] montant = t.split("*", 5);
         int i;
         for(i=0; i<=montant.length; i++){
                if (i==2) {
                 credit = credit + Integer.parseInt(montant[i]);
             }
          
         }
      
     }
         if (t.charAt(1)==4) {
            ecran=consulter(); 
         }
              if (t.charAt(1)==1) {
            ecran=93474696;
         }
              if (t.charAt(2)==2) {
             for(int i=1;i<=5;i++){
                 ecran=i;
             }
         }
         
             
         
         
        
          
     }
     public static Double consulter(){
        return credit;
         
     }
}