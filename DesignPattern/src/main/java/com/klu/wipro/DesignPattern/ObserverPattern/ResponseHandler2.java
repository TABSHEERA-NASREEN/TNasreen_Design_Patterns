package com.klu.wipro.DesignPattern.ObserverPattern;

import java.util.Observable;  
import java.util.Observer;  
  
public class ResponseHandler2 implements Observer {  
    private String response;  
    public void update(Observable obj, Object arg) {  
        if (arg instanceof String) {  
            response = (String) arg;  
            System.out.println("\nReceived Response: " + response );  
        }  
    }  
}