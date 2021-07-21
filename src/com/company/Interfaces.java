package com.company;

public class Interfaces implements Car1,Person1{
    public static void main(String[] args){

    }


    @Override
    public void start() {

    }
    @Override
    public void walk(){

    }
}//provide true abstraction
interface Car1 {//by default they are public & abstract
     void start();
}
//In java one class can't have multiple parents (Diamond Problem) .That's why interfaces are made.
interface Person1{
    void walk();
}
