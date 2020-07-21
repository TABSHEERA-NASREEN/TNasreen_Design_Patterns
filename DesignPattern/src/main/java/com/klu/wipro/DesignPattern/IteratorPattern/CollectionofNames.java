package com.klu.wipro.DesignPattern.IteratorPattern;

public class CollectionofNames implements Container{
	public String name[]={"Tabsheera Nasreen", "Khairunnisa Tasneem","Marisetty Niharika","Indravathi","Varunavi kachineni"};   

	@Override  
    public Iterartor getIterator() {  
        return new CollectionofNamesIterate() ;  
    }  
    private class CollectionofNamesIterate implements Iterartor{  
        int i;  
        @Override  
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }  
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }  
    }  
}  

