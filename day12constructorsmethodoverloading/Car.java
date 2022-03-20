package day12constructorsmethodoverloading;

public class Car {

    /*
        1)Constructors are used to create object from a class
        2)Java puts default constructors inside every class
        3)Default constructors does not have any parameters inside the constructor parenthesis
        4)Constructor names must match with the class names
        5)In a class we can have multiple constructors

        How to create a constructor?
        1)Type access modifier
        2)TYpe the class name as constructor name
        3)Open-close parenthesis
        4)Open curly brace press enter

        What are the differences between "constructors" and "methods"?
        1)Constructors do not have return type but methods must have
        2)Constructor names must be same with the class name because of that you cannot decide constructor names
          but method names can be assigned by developer.
    */
    String make;
    String model;
    double price;
    int year;
    //That constructor is same with the default constructor, it is very simple
    public Car(){

    }

    public Car(String make, String model, double price, int year){
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.make="Honda";
        c1.model="Civic";
        c1.price=10000;
        c1.year=2015;

        Car c2 = new Car();
        c2.make="Audi";
        c2.model="S5";
        c2.price=20000;
        c2.year=2019;

        Car c3 = new Car("BMW", "M4", 70000, 2019);

        Car c4 = new Car("Mercedes", "GLE", 80000, 2021);

        Car c5 = new Car("Tofas", "Sahin ELXIV");
    }

    public String run(){
        return "I started to run";
    }


}
