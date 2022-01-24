package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDbRepository extends JpaRepository<DemoDbUser, Long> {

	@Query(value = "SELECT * FROM DRG_USER WHERE USERNAME = ?1", nativeQuery = true)
	DemoDbUser findByUsernameNativeQuery(String username);
	
	@Query(value = "FROM DemoDbUser WHERE username=:username")
	DemoDbUser findByUsername(@Param("username") String username);
}
