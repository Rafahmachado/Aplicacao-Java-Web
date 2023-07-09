package com.devrafaela.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafaela.userdept.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
