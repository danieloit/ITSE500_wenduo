package homework.missing.lesson8;

public class Clock {
    private int hour;
    private int minute;
    private String amPm;

    public Clock(int hour, int minute, String amPm) {
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
    }

    public void advance(int minutes) {
    	
        for (int i = 0; i < minutes; i++) {
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour == 12) {
                    amPm = (amPm.equals("AM") ? "PM" : "AM");
                } else if (hour > 12) {
                    hour = 1;
                }
            }
        }
        System.out.println(hour+":"+minute+" "+amPm);
    }
    
    

    public final int getHour() {
        return hour;
    }

    public final int getMinute() {
        return minute;
    }

    public final String getAmPm() {
        return amPm;
    }

    public final String toString() {
        String result = hour + ":";
        if (minute < 10) {
            result += "0" + minute;
        } else {
            result += minute;
        }
        result += " " + amPm;
        return result;
    }

    public boolean equals(Object o) {
        if (o instanceof Clock) {
            Clock temp = (Clock) o;
            return temp.hour == this.hour && temp.minute == this.minute && temp.amPm.equals(this.amPm);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Clock time = new Clock(6,27,"PM");
        time.advance(1);
        time.advance(30);
        time.advance(5);
        time.advance(60);
        time.advance(128);
        time.advance(180);
        time.advance(1440);
        time.advance(21075);
    }

}