package com.klu.wipro.DesignPattern.FactoryMethod;

import java.io.*;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetPlanTypeFactory planFactory = new GetPlanTypeFactory();  
        
	      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String planName=br.readLine();  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=Integer.parseInt(br.readLine());  
	  
	      PlanType p = planFactory.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            }  

	

}
