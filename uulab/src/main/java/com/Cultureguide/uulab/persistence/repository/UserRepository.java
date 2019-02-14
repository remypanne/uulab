package com.Cultureguide.uulab.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Cultureguide.uulab.persistence.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
		

		@Query(value="SELECT * FROM commercial WHERE Identifiant = ?1 AND MotDePasse = ?2", nativeQuery=true)
		User findByMailAndPassword(String userName, String password);
		
	}


