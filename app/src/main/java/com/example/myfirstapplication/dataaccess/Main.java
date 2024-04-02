package com.example.myfirstapplication.dataaccess;

public class Main {
    public static void main(String[] args) {
        UserTableDAO userTableAccess = new UserTableDAO();
        System.out.println(userTableAccess.validateLogin("bob14", "bob123"));
    }
}
