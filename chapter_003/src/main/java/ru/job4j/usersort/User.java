package ru.job4j.usersort;

public class User implements Comparable<User> {


    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int compareTo(User user) {
        return this.age.compareTo(user.getAge());
    }
}
