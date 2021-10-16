package org.qa_automation;

public class Dog extends Animal  {
    private boolean athletic;
    private String size;
    private String race;

    public Dog(String animalName, int age, AnimalFood favoriteFood, Activity favoriteActivity, int healthLevel, int hungerLevel, int happinessLevel) {
        super(animalName, age, favoriteFood, favoriteActivity, healthLevel, hungerLevel, happinessLevel);
    }

    //method override
    public void displayJoy(){
        System.out.println("Dog wags its tail");
    }

}
