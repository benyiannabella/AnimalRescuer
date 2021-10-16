package org.qa_automation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {

    private String animalName;
    private int age;
    private int healthLevel; // level from 1-10
    private int happinessLevel; // level from 1-10
    private int hungerLevel; // level from 1-10
    private AnimalFood favoriteFood;
    private Activity favoriteActivity;
    //private String animalCategory;
    //private int nrLegs;

    //parameterized constructor
    public Animal(String animalName, int age, AnimalFood favoriteFood, Activity favoriteActivity,
                  int healthLevel, int hungerLevel, int happinessLevel){
        this.animalName = animalName;
        this.age = age;
        this.favoriteFood = favoriteFood;
        this.favoriteActivity = favoriteActivity;
        this.healthLevel = healthLevel;
        this.happinessLevel = happinessLevel;
        this.hungerLevel = hungerLevel;
    }

    //constructor with no parameters
    public Animal(){}

    public void displayJoy(){
        System.out.println("Animal is happy");
    }


}
