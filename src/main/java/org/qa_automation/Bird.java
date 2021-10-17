package org.qa_automation;

public class Bird extends Animal{
    private boolean hasWings;
    private boolean hasBeak;

    public Bird(){}

    public Bird(String animalName, int age, AnimalFood favoriteFood, Activity favoriteActivity, int healthLevel, int hungerLevel, int happinessLevel) {
        super(animalName, age, favoriteFood, favoriteActivity, healthLevel, hungerLevel, happinessLevel);
    }

    //method override
    public void displayJoy(){
        System.out.println("Bird jumps all around and chirps");
    }

    @Override
    public String toString() {
        return "Congratulation, you have a bird named " + getAnimalName() + ". Age is " + getAge() +
                ", favorite food " + getFavoriteFood().getFoodName() + ", favorite activity " + getFavoriteActivity().getActivityName() + ". Health level is " +
                getHealthLevel() + ", hunger level is " + getHungerLevel() + ", happiness level is " + getHappinessLevel();
    }
}
