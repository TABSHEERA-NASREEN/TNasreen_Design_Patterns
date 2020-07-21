package com.klu.wipro.DesignPattern.decorator;

public abstract class FoodDecorator  implements Food {

	private Food Foodobj;  
    public FoodDecorator(Food Foodobj)  {  
        this.Foodobj=Foodobj;  
    }  
    @Override  
    public String prepareFood(){  
        return Foodobj.prepareFood();   
    }  
    public double foodPrice(){  
        return Foodobj.foodPrice();  
    }  
}
