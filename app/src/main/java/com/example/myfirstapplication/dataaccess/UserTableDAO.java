package com.example.myfirstapplication.dataaccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserTableDAO {
    // each user array: [id, username, password]
    List<List<String>> users = new ArrayList<>();

    public UserTableDAO() {
        String PATH ="C:\\Users\\derro\\Documents\\Code\\3A\\safehive\\app\\src\\main\\java\\com\\example\\myfirstapplication\\dataaccess\\database\\UserTable.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line;
            line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                users.add(Arrays.asList(values));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(users);

    }

    // validate login
    public boolean validateLogin(String username, String password) {
        for (List<String> user: users) {
            if (user.get(1).equals(username) && user.get(2).equals(password)) {
                return true;
            }
        }
        return false;
    }

    // search user
    public List<List<String>> searchUserByUserName(String searchedUser) {
        List<List<String>> matchedUsers = new ArrayList<>();
        for (List<String> user: users) {
            if (user.get(1).contains(searchedUser)) {
                matchedUsers.add(user);
            }
        }
        return matchedUsers;
    }

    // get user by id
    public List<String> getUserByID(String id) {
        return users.get(Integer.valueOf(id) - 1);
    }
}
