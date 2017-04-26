package edu.oit.lesson4;

public class Puppy{
    public String name;
    public int age;
    
    public Puppy (String name) {
        this.name = name;
    }
    
    public Puppy (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Puppy () {
    }
    
    public static void main (String[] args) {
        Puppy puppy = new Puppy("BB", 3);
        
        System.out.println("Puppy name is " + puppy.name + ", age is " + puppy.age + ".");
    }
}