package org.qa_automation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activity {

    private String activityName;

    public Activity(String activityName){
        this.activityName = activityName;
    }

}
