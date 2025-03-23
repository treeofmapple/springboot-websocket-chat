package com.tom.service.comms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tom.service.comms.models.User;
import com.tom.service.comms.models.enums.Status;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findAllByStatus(Status status);
	
}
