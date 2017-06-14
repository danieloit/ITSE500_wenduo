package edu.oit.lesson11;
java.until.
public class Demo {
private int i;
private static int num = 4;
private static int num=2;
public Demo(int i) {
this.i = i;
}

public int calculate() {
int sum = 0;
int num = 0;
for (int i = 0; i < 3; i++) {
sum += i * (i + 1);
}
num += sum;
return sum;
}

public static void main(String[] args) {
Demo demo = new Demo(2);
System.out.println(demo.calculate());
System.out.println(num);
for (int i = 10; i > 0; i--) {
for (int j = 0; j < 5; j++) {
if (j > i) {
break;
}
System.out.println("execute");
}
}
}

}

	