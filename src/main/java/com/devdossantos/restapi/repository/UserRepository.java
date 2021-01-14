package com.devdossantos.restapi.repository;


import com.devdossantos.restapi.model.UserModel;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
