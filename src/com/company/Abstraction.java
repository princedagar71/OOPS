package com.company;
public class Abstraction {
    public static void main(String[] args){
        Audi a=new Audi();
        a.start();
    }
}
class Audi extends Car{
    @Override
    void start() {
        System.out.println("AUDI START");
    }
}
class BMW extends Car{
    @Override//needed to override
    void start() {
        System.out.println("BMW START");
    }
}
abstract class Car{//bcoz it's a concept
    String brand;
    int price;
    abstract void start();//they dont have definition

}