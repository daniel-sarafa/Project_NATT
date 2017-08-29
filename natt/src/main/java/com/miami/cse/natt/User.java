package com.miami.cse.natt;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {

    @Id
    private String userName;
    
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    
    private Points pointsForUser = new Points();
}
