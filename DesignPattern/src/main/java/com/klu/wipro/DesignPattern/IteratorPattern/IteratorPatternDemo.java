package com.klu.wipro.DesignPattern.IteratorPattern;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionofNames cmpnyRepository = new CollectionofNames();  
        
        for(Iterartor iter = cmpnyRepository.getIterator(); iter.hasNext();){  
            String name = (String)iter.next();  
            System.out.println("Name : " + name);  
         }      
	}

}
