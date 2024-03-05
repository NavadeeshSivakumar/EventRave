package com.slothsday.navadeesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slothsday.navadeesh.model.Theme;



public interface ThemeRepository extends JpaRepository<Theme,Integer>{

    Theme findByThemeName(String themeName);
}
