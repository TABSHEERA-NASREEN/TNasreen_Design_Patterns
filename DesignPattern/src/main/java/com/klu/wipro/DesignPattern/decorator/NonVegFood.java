package com.klu.wipro.DesignPattern.decorator;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food Foodobj) {  
        super(Foodobj);  
    }  
    public String prepareFood(){  
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
    }  
    public double foodPrice()   {  
        return super.foodPrice()+200.0;  
    }  
}
