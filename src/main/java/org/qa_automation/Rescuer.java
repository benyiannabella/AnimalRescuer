package org.qa_automation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rescuer {

    private String rescuerName;
    private double money;

    public Rescuer(){}
    public Rescuer(String name) {
        this.rescuerName = name;
    }

    public int feedAnimal(Animal animal, AnimalFood food) {
        System.out.println(rescuerName + " fed " + animal.getAnimalName() + " with " + food.getFoodName());

        if (animal.getHungerLevel() == 1) {
            System.out.println(animal.getAnimalName() + " is not hungry. Hunger level: " + animal.getHungerLevel());
            return 0;
        } else {
            animal.setHungerLevel(animal.getHungerLevel() - 1);
            System.out.println(animal.getAnimalName() + "'s hunger level is " + animal.getHungerLevel());

            if (animal.getFavoriteFood().getFoodName().equals(food.getFoodName()) && animal.getHappinessLevel() < 10) {
                animal.setHappinessLevel(animal.getHappinessLevel() + 1);
                System.out.println(animal.getAnimalName() + "'s happiness leve increased to " + animal.getHappinessLevel()
                        + " because he received his favorite food ");
                return animal.getHappinessLevel();
            }
            return animal.getHungerLevel();
        }
    }


    public int entertainAnimal(Animal animal, Activity activity) {
        System.out.println(rescuerName + " " + activity.getActivityName()
                + " with " + animal.getAnimalName());

        if (animal.getHappinessLevel() == 10) {
            System.out.println(animal.getAnimalName() + " is happy");
            return 0;
        } else if(animal.getFavoriteActivity().getActivityName().equals(activity.getActivityName())){
            animal.setHappinessLevel(animal.getHappinessLevel() + 2);
            System.out.println(animal.getAnimalName() + "'s happiness level is " + animal.getHappinessLevel());
            return animal.getHappinessLevel();
        } else {
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
            System.out.println(animal.getAnimalName() + "'s happiness level is " + animal.getHappinessLevel());
            return animal.getHappinessLevel();
        }
    }
}
