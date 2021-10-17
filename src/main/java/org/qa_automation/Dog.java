package org.qa_automation;

public class Dog extends Animal  {
    private boolean athletic;
    private String size;
    private String race;

    public Dog(){}

    public Dog(String animalName, int age, AnimalFood favoriteFood, Activity favoriteActivity, int healthLevel, int hungerLevel, int happinessLevel) {
        super(animalName, age, favoriteFood, favoriteActivity, healthLevel, hungerLevel, happinessLevel);
    }

    //method override
    public void displayJoy(){
        System.out.println("Dog wags its tail");
    }

    @Override
    public String toString() {
        return "Congratulation, you have a dog named " + getAnimalName() + ". Age is " + getAge() +
    ", favorite food " + getFavoriteFood() + ", favorite activity " + getFavoriteActivity() + ". Health level is " +
    getHealthLevel() + ", Hunger level is " + getHungerLevel() + ", Happiness level is " + getHappinessLevel();
    }
}
