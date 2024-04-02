package com.example.myfirstapplication.dataaccess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserTableAccess {
    List<List<String>> users = new ArrayList<>();
    public UserTableAccess() {
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
}
