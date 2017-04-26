package edu.oit.lesson2;

public class DayCount {
    public static void main(String[] args) {
        int yearinput = 1996;
        int monthinput = 3;
        int days = DayCount.dayCount(yearinput, monthinput);
        System.out.printf("%d年，%d月，有%d天", yearinput, monthinput, days);
    }
    
    public static int dayCount(int a, int b){
        int howManyDays=30;
        switch(b){
        case 1 :
        case 3 :
        case 5 :
        case 7 :
        case 8 :
        case 10 :
        case 12 :
            howManyDays = 31;
        break;
        case 2 :
            if (a%400 == 0){howManyDays = 29;}
            else if(a%4 != 0 | a%100 == 0){howManyDays = 28;}
            else{howManyDays = 29;}
        break;
        }
        return howManyDays;
    }
    
}
