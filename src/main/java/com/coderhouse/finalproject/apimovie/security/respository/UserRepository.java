package com.coderhouse.finalproject.apimovie.security.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.finalproject.apimovie.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(String email);
	boolean existsByEmail(String email);
}
