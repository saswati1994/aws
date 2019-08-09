package com.demo.aurora.poc.crudapp.repository;

import com.demo.aurora.poc.crudapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
