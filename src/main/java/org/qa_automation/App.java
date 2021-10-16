package org.qa_automation;

public class App {
    public static void main( String[] args ){

        AnimalFood food = new AnimalFood("Proplan");
        AnimalFood food1 = new AnimalFood("Acana");
        AnimalFood food2 = new AnimalFood("Birdy sweets ");
        AnimalFood food3 = new AnimalFood("Chirips");

        Activity activity = new Activity("paying with ball");
        Activity activity2 = new Activity("running");
        Activity activity3 = new Activity("singing");
        Dog dog = new Dog("Happy",3,food, activity,1, 10, 1);
        Bird bird = new Bird ("Tweety", 1, food2, activity3,1, 10, 1);
//        dog.displayJoy();
//        bird.displayJoy();

//        Animal dog1 = new Dog("Rex",10, food1, 1, 10, 1);
//        Animal bird1 = new Bird ("Beaky", 2, food3, 1, 10, 1);
//        dog1.displayJoy();
//        bird1.displayJoy();

        Rescuer rescuer = new Rescuer("Jimmy");
        rescuer.entertainAnimal(dog, activity2);
        rescuer.feedAnimal(bird, food2);
    }
}
