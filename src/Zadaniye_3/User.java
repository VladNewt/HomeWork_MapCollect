package Zadaniye_3;

import java.util.Objects;

public class User {
    private String login;
    private String pass;
    private int age;

    public User() {
    }

    public User(String login, String pass, int age) {
        this.login = login;
        this.pass = pass;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(login, user.login) &&
                Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, pass, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                '}';
    }
}
