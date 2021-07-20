package com.company;

public class Main {

    public static void main(String[] args) {
	// Classes,Objects & Method
        Person P=new Person();
        System.out.println(P.name);
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
        System.out.println(Person.count);
        Person p1=new Person("Priya",20);
        System.out.println(p1.name+" "+p1.age);
        System.out.println(Person.count);


    }
}
class  Person{
    String name;
    int age;
    static int count;//if not dependent on object (mainly for constants or not dependent on class)
    void walk(){
        System.out.println("Walking!!!");
    }
    float walk(float steps){//Polymorphism
        return (float) (steps*0.5);
    }
    public Person(){
        count++;
        System.out.println("Creating an Object!!!");
    }
    public Person(String name,int age ){
        this ();//to call previous constructor
        this.name=name;//also for calling other elements of class instead of using new variables
        this.age=age;
    }
}