package edu.oit.lesson9;

public enum Dish {
	GONGBAOJIDING(Meat.CHICKEN,Vegetable.PEPPER), YUXIANGROUSI(Meat.PORK,Vegetable.ONION), SHUIZHUROUPIAN(Meat.BEEF,Vegetable.ONION);
	private Meat meat;
	private Vegetable vegetable;
	
	 public static void main(String[] args) {
	        
	    }
	
	
	public void vegetable(Vegetable vegetable){
		this.vegetable=vegetable;
	}
	
	
	
	public void meat(Meat meat){
		this.meat = meat;
	}
	
	
	
	public enum Vegetable{
		CABBAGE,POTATO,PEPPER,ONION,EGGPLANT;
	
	}
	public enum Meat{
		PORK,CHICKEN,BEEF;
	
	}
	
	
	
}
