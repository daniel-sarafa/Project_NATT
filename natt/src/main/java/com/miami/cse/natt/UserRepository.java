package com.miami.cse.natt;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
	User findByUserNameAndPassword(String userName, String password);
}
