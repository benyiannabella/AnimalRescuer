package org.qa_automation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private Veterinarian vet;
    private List<AnimalFood> availableFood = new ArrayList<>();
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

    private void initAnimal(){
        Rescuer rescuer = initRescuer();
        System.out.println("Please type what kind of animal you would like to rescue: dog or bird");
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();

        if (animalType.equals("dog")){
            Dog dog  = new Dog();
            dog.setAnimalName("Skippy");
            dog.setAge(5);
            dog.setHappinessLevel(5);
            dog.setHungerLevel(4);
            Activity activity = new Activity("running in the park");
            dog.setFavoriteActivity(activity);
            dog.setHealthLevel(6);
            dog.setFavoriteFood(new AnimalFood("Proplan"));
            System.out.println(dog.toString());
            nameAnimal(dog);
            requireFeeding(dog, rescuer);
        } else {
            Bird bird  = new Bird();
            bird.setAnimalName("Skippy");
            bird.setAge(10);
            bird.setHappinessLevel(3);
            bird.setHungerLevel(7);
            bird.setFavoriteActivity( new Activity("singing"));
            bird.setHealthLevel(5);
            bird.setFavoriteFood(new AnimalFood("Birdy sweets"));
            System.out.println(bird.toString());
            nameAnimal(bird);
            requireFeeding(bird, rescuer);
        }

    }

    private Rescuer initRescuer(){
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        Rescuer rescuer = new Rescuer();
        try {
            rescuer.setRescuerName(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Please type a valid name");
            initRescuer();
        }
        System.out.println("Hi " + rescuer.getRescuerName());
        return rescuer;
    }

    private void nameAnimal(Animal animal){
        System.out.println("Please rename your animal if you wish: ");
        Scanner scanner = new Scanner(System.in);
        animal.setAnimalName(scanner.nextLine());
    }

    private void requireFeeding(Animal animal, Rescuer rescuer){
        System.out.println("Please feed your animal. The available foods types are:");
        if(animal instanceof Dog) {
            System.out.println("Proplan, Acana, Eucanuba, Royal Canin");
        } else {
                System.out.println("Birdy Sweets, Chirips, Winged Joy, Seeds");
            }
        Scanner scanner = new Scanner(System.in);
        AnimalFood food = new AnimalFood(scanner.nextLine());
        rescuer.feedAnimal(animal, food);
    }

    public void start() {
//        initFood();
//        initActivities();
//        printActivityList();
//        printFoodList();

        initAnimal();
    }



}
