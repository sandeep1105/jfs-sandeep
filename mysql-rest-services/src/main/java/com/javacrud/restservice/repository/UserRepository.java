package com.javacrud.restservice.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.javacrud.restservice.entity.User;

@RepositoryRestResource(path= "/users")
public interface UserRepository extends JpaRepository<User,String> {

}
