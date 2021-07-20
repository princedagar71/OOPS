package com.company;

public class Main {

    public static void main(String[] args) {
	// Classes,Objects & Method
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
        System.out.println(p.walk(25));

    }
}
class  Person{
    String name;
    int age;
    void walk(){
        System.out.println("Walking!!!");
    }
    float walk(float steps){//Polymorphism
        return (float) (steps*0.5);
    }
    public Person(){
        System.out.println("Creating an Object!!!");
    }

}