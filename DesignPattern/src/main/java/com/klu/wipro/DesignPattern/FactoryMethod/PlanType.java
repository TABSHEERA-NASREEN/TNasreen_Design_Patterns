package com.klu.wipro.DesignPattern.FactoryMethod;

public abstract class PlanType {

	   protected double rate;  
       abstract void getRate();  
 
       public void calculateBill(int units){  
            System.out.println("Total Bill:" +units*rate);  
        }  
}
