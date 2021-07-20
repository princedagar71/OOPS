package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person P=new Person();
        P.name="Prince ";
        P.age=21;
        System.out.println(P.name+" "+P.age);
        P.walk();
        Person p=new Person();
        p.name="La";
        p.age=23;
        System.out.println(p.name+" "+p.age);
        p.walk();


    }
}
class  Person{
    String name;
    int age;
    void walk(){
        System.out.println("Walking!!!");
    }
}