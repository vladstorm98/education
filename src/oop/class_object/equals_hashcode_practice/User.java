package oop.class_object.equals_hashcode_practice;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj  == null) return false;
        if (obj instanceof User userToCheck) {
            return this.login.equals(userToCheck.login) && this.password.equals(userToCheck.password);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.login.hashCode();
    }
}
