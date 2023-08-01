package org.alvkoen.classes;

// This is a class declaration. It is a blueprint for creating objects.
// [public/private] class [ClassName]
public class Car {

    // Fields with default value
    // [public/private] [type] [name] = [value];
    // You can sort of think of them as named boxes that hold values.
    // e.g. you have a box with a label "numberOfWheels" and it holds a value 4.
    // You can change the value of the box but you can't change the label.
    // You can also say that the box is private. It means that nobody can't access it from the outside of the class
    // unless you have a method that does it for you.
    // You'll see that when you explore the Main class
    private int numberOfWheels = 4;

    public String typeOfCar = "Passenger car";

    // Field without default value. Value can be assigned in constructor or setter method.
    // [public/private] [type] [name];
    private String brand;


    // Constructor. It is a method that is called when an object is created.
    // [public/private] [ClassName]([parameters])
    public Car(String brand) {
        this.brand = brand;
    }

    // Method to get the value of a field.
    // [public/private] [return type] [name]()
    // It has a return type int meaning that you can call it and get an int value.
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    // Method to set the value of a field.
    // [public/private] [return type] [name]([parameters])
    // It has a return type void meaning that it does something but returns nothing.
    // In this case the method assigns a value to your field.
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
