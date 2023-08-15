package org.alvkoen.classes;

public class Coffee {

    // Here we have some private fields that don't have a value yet.
    // We want to only set the values when we are creating an object of this class aka when creating some specific coffee
    private String brand;
    private int strengthLevel;

    // But where are the values coming from?
    // This is why classes have constructors.
    // This thing below that looks almost like a method is in fact a constructor.
    // When you're creating a regular method you have to specify it like this:
    // [public/private] [return type] [name]([parameters]) e.g. public void getBrand()
    // When you're creating a constructor you have to specify it like this:
    // [public/private] [ClassName]([parameters])
    // So for a class Coffee it would look like this:

    public Coffee(String coffeeBrand, int coffeeStrengthLevel) {
        this.brand = coffeeBrand;
        this.strengthLevel = coffeeStrengthLevel;
    }

    // Now let's take a closer look at what's happening there.
    // The constructor for our Coffee class is receiving some values with predefined types and assigns them to the fields.
    // "this" keyword references your object's fields. The ones we defined up there.
    // We're saying: hey I want this field in this object have a value that I've just received as a parameter.
    // If this makes no sense - no worries. You'll see how it works in Main.
    // One more thing: the types of parameters have to be the same as types of your fields.
    // If brand field is a string then the parameter coffeeBrand also has to be a String.


    //These are just some getter methods that we will use to access our fields because fields are private.
    public String getBrand() {
        return brand;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

}
