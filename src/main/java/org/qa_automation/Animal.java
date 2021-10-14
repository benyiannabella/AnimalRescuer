package org.qa_automation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {

    private String animalName;
    private int age;
    private int health;
    private int mood;
    private AnimalFood favoriteFood;
    private Activity favoriteActivity;

}
