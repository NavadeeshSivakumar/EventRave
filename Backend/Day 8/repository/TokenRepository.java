package com.slothsday.navadeesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.slothsday.navadeesh.model.Token;

public interface TokenRepository extends JpaRepository<Token,String>{

}
