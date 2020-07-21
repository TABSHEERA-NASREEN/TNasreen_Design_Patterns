package com.klu.wipro.DesignPattern.Facade;

public class Mobileseller {
	private Mobiles iphone;  
    private Mobiles samsung;  
    private Mobiles oneplus;  

    public Mobileseller(){  
        iphone= new Iphone();  
        samsung=new Samsung();  
        oneplus=new Oneplus();  
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void samsungSale(){  
        samsung.modelNo();  
        samsung.price();  
    }  
   public void oneplusSale(){  
	   oneplus.modelNo();  
	   oneplus.price();  
        }  


}
