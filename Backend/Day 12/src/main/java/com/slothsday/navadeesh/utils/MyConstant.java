package com.slothsday.navadeesh.utils;

import java.util.Arrays;
import java.util.List;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.HEAD;
import static org.springframework.http.HttpMethod.PATCH;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;

public class MyConstant {
    public static final String USER="/api/v1/user";
    public static final String REGISTER ="/signup";

    // Request Mappings
        public static final String AUTH = "/api/v1/auth";

        // End Points
        public static final String LOGIN = "/login";
        public static final String REFRESR_TOKEN = "/refresh-token";
        public static final String LOGOUT = "/logout";
        public static final String FORGOT_PASSWORD = "/forgot-password";

        // Web Security
        public static final String[] WHITELIST_URL = {
                        "/api/v1/auth/**",
                        "/swagger-ui/**",
                        "/swagger-ui.html/",
                        "/v3/api-docs/**"
        };
        public static final List<String> ORIGINS = Arrays.asList("http://localhost:4000");
        public static final List<String> HEADERS = Arrays.asList(AUTHORIZATION, CONTENT_TYPE);
        public static final List<String> METHODS = Arrays.asList(GET.name(), POST.name(), PATCH.name(),
                        PUT.name(), DELETE.name(), HEAD.name());

        // Swagger Info
        public static final String SWAGGER_INFO_TITLE = "EVENTRAVE";
        public static final String SWAGGER_INFO_DESCRIPTION = "EventRave";
        public static final String SWAGGER_INFO_VERSION = "1.2.3";
        public static final String SWAGGER_INFO_CONTACT_NAME = "Navadeesh";
        public static final String SWAGGER_INFO_CONTACT_EMAIL = "navadeesh@gmail.com";
        public static final String SWAGGER_INFO_CONTACT_URL = "https://example.com";
        public static final String SWAGGER_INFO_LICENSE_NAME = "Apache 2.0";
        public static final String SWAGGER_INFO_LICENSE_URL = "https://www.apache.org/licenses/LICENSE-2.0.html";

        // JsonWebToken
        public static final String JWT_LOCALHOST_URL = "http://localhost:8181";
        public static final String JWT_SECURITY_SCHEME_NAME = "bearerAuth";
        public static final String JWT_SCHEME = "bearer";
        public static final String JWT_DESCRIPTION = "Provide the JWT token.";
        public static final String JWT_BEARER_FORMAT = "JWT";
}
