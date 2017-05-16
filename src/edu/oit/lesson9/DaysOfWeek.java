package edu.oit.lesson9;

public enum DaysOfWeek {
	MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
	private int num;
	private DaysOfWeek(int num){
		this.setNum(num);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	};
	
	
	
	
	
	
	
}
