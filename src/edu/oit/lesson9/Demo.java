package edu.oit.lesson9;

public class Demo {

	public static void main(String[] args){
		System.out.println(Color.RED.getValue());
		System.out.println(DaysOfWeek.SUNDAY.getNum());
		System.out.println(Color.RED.getSomething(Color.GREEN));
		
		for(Color color : Color.values()){
			System.out.println(color.name());
			System.out.println(color);
		}
		
		
		for (Country country: Country.EURO){
			System.out.println(country);
		}
		
		
		
	}

}
