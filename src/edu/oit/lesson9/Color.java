package edu.oit.lesson9;

public enum Color implements Paintable{

	RED(1),ORANGE(2),YELLOW(3),GREEN(3);
	private int value;
	private Color(int value){
		this.setValue(value);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getSomething(Color color){
		switch(color){
		case RED:
			return "apple";
		case ORANGE:
			return "orange";
		case YELLOW:
			return "banana";
		default:
			return "grass";
			
		}
		
	}
	
	@Override
	public void paint() {
		
	}
	
	
}
