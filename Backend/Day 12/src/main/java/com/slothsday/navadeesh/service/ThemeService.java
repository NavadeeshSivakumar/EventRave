package com.slothsday.navadeesh.service;

import com.slothsday.navadeesh.dto.request.ThemeRequest;
import com.slothsday.navadeesh.dto.response.ThemeResponse;

public interface ThemeService {

    ThemeResponse addtheme(ThemeRequest request);

    ThemeResponse getthemeinfo(String themeName);
    
    ThemeResponse deletetheme(String themeName);

    ThemeResponse editTheme(String themeName, ThemeRequest request);
}
