package com.klu.wipro.DesignPattern.Prototype;

public class EmployeeRecord implements Prototype {
	
	private int id;  
	   private String name, designation;  
	   private double salary;  
	   private String address;  
	      
	   public EmployeeRecord(){  
	            System.out.println("   Employee Records of KLU");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("Emp_id"+"\t"+"Emp_name"+"\t"+"Emp_designation"+"\t\t"+"Emp_salary"+"\t"+"Emp_address");  
	      
	}  
	   public  EmployeeRecord(int id1, String nameofemp, String pos, double sal, String adrs) {  
	          
	        this();  
	        this.id = id1;  
	        this.name = nameofemp;  
	        this.designation = pos;  
	        this.salary = sal;  
	        this.address = adrs;  
	    }  
	      
	   public void showRecord(){  
	          
	        System.out.println(id+"\t"+name+"\t\t"+designation+"\t\t"+salary+"\t"+address);  
	   }  
	  
	    @Override  
	    public Prototype getClone() {  
	          
	        return new EmployeeRecord(id,name,designation,salary,address);  
	    }  

}
