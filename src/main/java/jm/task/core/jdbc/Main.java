package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Smith", (byte) 26);
        userService.saveUser("John", "Smith", (byte) 15);
        userService.saveUser("Bob", "Smith", (byte) 18);
        userService.saveUser("Michael", "Smith", (byte) 32);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
