package com.p92.exercse.odrobinat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.p92.exercse.odrobinat.domain.User;

public interface UserRepository extends CrudRepository<User, Long>
{

	List<User> findAll();
}
