package com.miami.cse.natt;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class User {

    @Id
    private String userName;
    
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    
    private Points pointsForUser = new Points();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Points getPointsForUser() {
		return pointsForUser;
	}

	public void setPointsForUser(Points pointsForUser) {
		this.pointsForUser = pointsForUser;
	}
    
    
}
