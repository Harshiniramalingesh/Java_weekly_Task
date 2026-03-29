package org.example;
import com.google.gson.Gson;

public class UserExample {

    public static void main(String[] args) {

        User user = new User(1, "Harshini", "harshini@gmail.com");

        Gson gson = new Gson();

        String json = gson.toJson(user);

        System.out.println(json);

    }
}
