package com.klu.wipro.DesignPattern.Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {

	private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("========= Mobile Shop ============ \n");  
            System.out.print("            1. IPHONE.\n");  
            System.out.print("            2. SAMSUNG.\n");  
            System.out.print("            3. ONEPLUS.\n");  
            System.out.print("            4. Exit.\n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            Mobileseller sk=new Mobileseller();  
              
            switch (choice) {  
            case 1:  
                {   
                  sk.iphoneSale();  
                    }  
                break;  
       case 2:  
                {  
                  sk.samsungSale();        
                    }  
                break;    
       case 3:  
                           {  
                           sk.oneplusSale();       
                           }  
                   break;     
            default:  
            {    
                System.out.println("Thank you visit again");  
            }         
                return;  
            }  
              
      }while(choice!=4);  
   }  
}
