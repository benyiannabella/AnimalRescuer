package org.qa_automation;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class AnimalFood {


    private String foodName;
    private double price;
    private int weight;
    private LocalDate expiryDate;
    private boolean availability;

    public AnimalFood(String foodName){
        this.foodName= foodName;
    }
}
