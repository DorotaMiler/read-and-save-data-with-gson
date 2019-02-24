package com.infoshareacademy;

import com.infoshareacademy.model.User;
import com.infoshareacademy.model.Users;
import com.infoshareacademy.utils.FileUtils;

public class App {
    public static void main(String[] args) {

        Users users = FileUtils.readUsersJsonFile();

        User user = new User("Grzegorz", "Michalak", "Developer");
        users.add(user);

        FileUtils.saveUsersToJsonFile(users);
    }
}
