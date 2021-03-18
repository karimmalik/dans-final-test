package com.karim.test.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.karim.test.domain.User;

@Repository
public interface UserRepository2 extends CrudRepository<User, Long>{

	User findByUsername(String username);

}
