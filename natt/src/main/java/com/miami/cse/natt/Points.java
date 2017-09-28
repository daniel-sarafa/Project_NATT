package com.miami.cse.natt;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Points {

    private Integer driveModePoints;
    private Integer fitnessModePoints;
    private Integer studyModePoints;
    private Integer sleepModePoints;
    private Integer familyModePoints;
    public Integer totalPoints;
    
    public Points(){
    	driveModePoints = 0;
        fitnessModePoints = 0;
        studyModePoints = 0;
        sleepModePoints = 0;
        familyModePoints = 0;
        totalPoints =  0 + driveModePoints + fitnessModePoints + studyModePoints + sleepModePoints + familyModePoints;
    }
    
    @SuppressWarnings("unused")
    private Integer increaseDriveModePoints(Integer driveModePoints, Integer increasedBy){
        driveModePoints = driveModePoints + increasedBy;
        return driveModePoints;
    }
}
