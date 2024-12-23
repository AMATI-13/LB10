package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new User("Alice", 30);

        JacksonExample jacksonExample = new JacksonExample();
        String userJson = jacksonExample.serializeUser(user);
        System.out.println("Serialized User: " + userJson);

        String filePath = "user.json";
        FileExample fileExample = new FileExample(filePath);
        fileExample.writeToFile(userJson);
        System.out.println("User data written to file: " + filePath);

        String jsonFromFile = fileExample.readFromFile();
        System.out.println("Read from file: " + jsonFromFile);

        User deserializedUser = jacksonExample.deserializeUser(jsonFromFile);
        System.out.println("Deserialized User Name: " + deserializedUser.getName());
        System.out.println("Deserialized User Age: " + deserializedUser.getAge());
    }
}