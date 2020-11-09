package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
	@Query(value = "SELECT * FROM USER WHERE LASTNAME=?1",nativeQuery = true) // NATIVE QUERY work if change in query then not work
	User findByLastname(String lastname);
}
