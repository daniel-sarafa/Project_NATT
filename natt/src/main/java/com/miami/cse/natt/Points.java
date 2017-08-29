package com.miami.cse.natt;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Points {

    private Integer driveModePoints = 0;
    private Integer fitnessModePoints = 0;
    private Integer studyModePoints = 0;
    private Integer sleepModePoints = 0;
    private Integer familyModePoints = 0;
    private Integer totalPoints = driveModePoints + fitnessModePoints + studyModePoints + sleepModePoints + familyModePoints;
    
    @SuppressWarnings("unused")
    private Integer increaseDriveModePoints(Integer driveModePoints, Integer increasedBy){
        driveModePoints = driveModePoints + increasedBy;
        return driveModePoints;
    }
}
