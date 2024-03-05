package com.slothsday.navadeesh.service.impl;

import org.springframework.stereotype.Service;

import com.slothsday.navadeesh.dto.request.ThemeRequest;
import com.slothsday.navadeesh.dto.response.ThemeResponse;
import com.slothsday.navadeesh.model.Theme;
import com.slothsday.navadeesh.repository.ThemeRepository;
import com.slothsday.navadeesh.service.ThemeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ThemeServiceImpl implements ThemeService{
    private final ThemeRepository themeRepository;

    @Override
    public ThemeResponse addtheme(ThemeRequest request) {
        var theme = Theme.builder().themeName(request.getThemeName()).themeDesc(request.getThemeDesc()).themePrice(request.getThemePrice()).build();
        themeRepository.save(theme);
        
        return ThemeResponse.builder().themeName(request.getThemeName()).themeDesc(request.getThemeDesc()).themePrice(request.getThemePrice()).message("Theme added successfully").build();
    }

    @Override
    public ThemeResponse getthemeinfo(String themeName) {
    Theme theme = themeRepository.findByThemeName(themeName);
    return ThemeResponse.builder()
            .themeName(theme != null ? theme.getThemeName() : null)
            .themeDesc(theme != null ? theme.getThemeDesc() : null)
            .themePrice(theme != null ? theme.getThemePrice() : 0.0f)
            .message(theme != null ? null : "No such theme found: " + themeName)
            .build();
}

    @Override
    public ThemeResponse deletetheme(String themeName) {
        try {
            Theme theme = themeRepository.findByThemeName(themeName);
            if (theme != null) {
                themeRepository.delete(theme);
                return ThemeResponse.builder().message("Theme deleted successfully").build();
            } else {
                return ThemeResponse.builder().message("No such theme found: " + themeName).build();
            }
        } catch (Exception e) {
            return ThemeResponse.builder().message("Failed to delete theme").build();
        }
    }

    @Override
    public ThemeResponse editTheme(String themeName, ThemeRequest request) {
        Theme theme = themeRepository.findByThemeName(themeName);
        if (theme != null) {
            try {
                theme.setThemeDesc(request.getThemeDesc());
                theme.setThemePrice(request.getThemePrice());
                themeRepository.save(theme);
                return ThemeResponse.builder()
                    .themeName(theme.getThemeName())
                    .themeDesc(theme.getThemeDesc())
                    .themePrice(theme.getThemePrice())
                    .message("Theme updated successfully")
                    .build();
            } catch (Exception e) {
                return ThemeResponse.builder().message("Failed to update theme").build();
            }
        } else {
            return ThemeResponse.builder().message("No such theme found: " + themeName).build();
        }
    }
    

}
