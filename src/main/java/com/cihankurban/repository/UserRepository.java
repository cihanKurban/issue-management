package com.cihankurban.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cihankurban.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUser(String username);


}
