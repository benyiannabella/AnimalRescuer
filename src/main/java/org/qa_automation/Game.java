package org.qa_automation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private Veterinarian vet;
    private List<AnimalFood> availableFood = new ArrayList<AnimalFood>();
    private Activity[] availableActivities = new Activity[10];

    private void initFood() {
        AnimalFood food1 = new AnimalFood("Proplan");
        AnimalFood food2 = new AnimalFood("Acana");
        availableFood.add(food1);
        availableFood.add(food2);
    }

    private void initActivities() {
        Activity activity1 = new Activity("playing with ball");
        Activity activity2 = new Activity("running");
        availableActivities[0] = activity1;
        availableActivities[1] = activity2;

    }

    private void printFoodList() {
        System.out.print("List of available food: ");
        for (AnimalFood food : availableFood) {
            System.out.print(food.getFoodName() + ", ");
        }
        System.out.println(" ");
    }

    private void printActivityList() {
        System.out.print("List of available activities: ");
        for (Activity activity : availableActivities) {
            if (activity != null) {
                System.out.print(activity.getActivityName() + ", ");
            }
        }
        System.out.println(" ");
    }

    public void start() {
        initFood();
        initActivities();
        printActivityList();
        printFoodList();
    }

}
