package org.alvkoen;

import org.alvkoen.classes.Car;
import org.alvkoen.classes.Coffee;

// This is the place where you can run your code.
// In Intellij you can press the green arrow next to the class declaration, and it will run the code.
public class Main {
    public static void main(String[] args) {
//     I moved the previous example to a separate function down below so that it doesn't get in the way.
//     If you want to run it again - uncomment the next line:
//        fieldsAndPrinting();

//      New lesson stuff starts here. Go check this constructorsAndLists function:
        constructors();
    }

    /**
     * Lesson 2 - Constructors
     */
    public static void constructors() {
        // Let's create our Coffee object.
        Coffee myCoffee = new Coffee("Paulig", 5);

        // Remember how we created a toy? It was like this: Toy teddyBear = new Toy();
        // You've been using a constructor without even knowing it! Toy() <-- these brackets are a default constructor.
        // It's just that Toy didn't have any private fields with no values.
        // Now because Coffee has some  - you cannot create an object like this:

//        Coffee myCoffee = new Coffee();

        // If you uncomment the line above you'll see that it's underlined in red. It means that it's an error.
        // The rule is: either you don't define a constructor at all like you did with a Toy.
        // Or if you defined it - you have to use it. A class can have multiple constructors,
        // or you can define a default one but we'll get to that later.

        // So let's print our coffee:

        System.out.println("My coffee is " + myCoffee.getBrand() +
                " and it's strength level is " + myCoffee.getStrengthLevel());

        //So why do you need this constructor?
        // In programming you usually want to have blueprints for your objects and decide what values they have later.
        // And you don't want public fields because you want to control what values are assigned to them.
        // You can create a bunch of setter methods but it's not very convenient. Instead you can create a constructor once
        // and instead of
        // Car myCar = new Car();
        // myCar.brand = "Audi";
        // myCar.numberOfWheels = 4;
        // long list of other calls
        // Instead you can just:
        // Car myCar = new Car("Audi", 4);
        // Just like we did with Coffee. Just one line of code and all your values are in place.

    }

    /**
     * Lesson 1 - Fields and printing
     */
    public static void fieldsAndPrinting() {
        // This is how you create an object from a class.
        // Remember that the class had 3 fields: numberOfWheels, typeOfCar and brand.
        // numberOfWheels and typeOfCar have a default value, but brand does not. It means that you have to assign a value to brand when you create a Car.
        // When we called a constructor, we passed a String as a parameter and now our car object has a brand
        Car myCar = new Car("Volkswagen");

        //Let's talk about methods and return values.
        // You create an object once using a `new` keyword like we did above and then you can call methods on that object like this:
        // [object].[method]([parameters])
        // e.g. myCar.getBrand() or myCar.setBrand("Audi")
        //If a function has a return value you can assign it to a variable like this:
        // [type] [variable name] = [object].[method]([parameters])

        int numberOfWheels = myCar.getNumberOfWheels();

        // but if a method returns void you can't assign it to a variable.
        // You can't do this:
        // String brand = myCar.setBrand("Audi");
        // If you remove // from the line above you'll see that it's underlined in red. It means that it's an error.
        // Because you cannot expect a value from a method that returns void so there's nothing to assign to a variable.
        // Types are neat because they help you to avoid errors like this and you always know what to expect from a method.


        // This is how you print something to the console. It looks kinda scary but it's just a method call.
        // You can press command and click on the println and it will show you that println is a method that someone else has created.
        // It has a void return type (meaning it does something but returns nothing) and it has a String parameter.
        // That means you give it a String and it does something to it. In this case it prints it to the console.
        System.out.println("My car has " + myCar.getNumberOfWheels() + " wheels and it's brand is " + myCar.getBrand());

        // By printing things you can check if your code works as expected.
        // There actually are better ways to do it but for now we can just use print.
        // Let's call setBrand on myCar and then print it again:

        myCar.setBrand("Seat");

        System.out.println("My car has " + myCar.getNumberOfWheels() + " wheels and it's brand is " + myCar.getBrand());

        // Check the console output.
        // At first it prints that the car's brand is Volkswagen. and then it prints that the car's brand is Seat.
        // That's because we assigned a new value to the brand field.
        // You can also see that the number of wheels is always 4. That's because we didn't create a method to change it.

        // Now let's look at the `typeOfCar` field. It has a default value of "Passenger car"
        // but it's public so we can change it without having a method for it.

        //Let's print it's current value and then change it and print it again:

        System.out.println("My car is a " + myCar.typeOfCar);

        myCar.typeOfCar = "Truck";

        System.out.println("My car is a " + myCar.typeOfCar);

        // Wow! So if a field is public - we don't need any methods to change it's value or to get it.
        // You can't do that with private fields like numberOfWheels and brand.
        // Neat, right? Well actually it's not. It's not a good practice to have public fields. Because you can't control what happens to them.
        // It's a good practice to have private fields and public methods to change them.
    }
}