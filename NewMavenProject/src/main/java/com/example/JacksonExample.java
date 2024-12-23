package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public String serializeUser(User user) throws JsonProcessingException {
        return objectMapper.writeValueAsString(user);
    }

    public User deserializeUser(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, User.class);
    }
}
