package com.klu.wipro.DesignPattern.decorator;

public class ChineseFood extends FoodDecorator {

	public ChineseFood(Food Foodobj)    {  
        super(Foodobj);  
  }  
    public String prepareFood(){  
        return super.prepareFood() +" With Fried Rice and Manchurian  ";   
    }  
    public double foodPrice()   {  
        return super.foodPrice()+95.0;  
        }  
}
