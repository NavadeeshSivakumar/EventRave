package com.slothsday.navadeesh.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.slothsday.navadeesh.model.User;

public interface UserRepository extends JpaRepository<User,String>{

    Optional<User> findByEmail(String email);

}
