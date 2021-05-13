package main.codewars.fixmehello;

import java.util.Set;
import java.util.TreeSet;

public class Dinglemouse {
    String name;
    int age;
    char sex;
    Set<String> set = new TreeSet<>();

    public Dinglemouse() {
    }

    public Dinglemouse setAge(int age) {
        this.age = age;
        set.add("age");
        return this;
    }

    public Dinglemouse setSex(char sex) {
        this.sex = sex;
        set.add("sex");
        return this;
    }

    public Dinglemouse setName(String name) {
        this.name = name;
        set.add("name");
        return this;
    }

    public String hello() {
        StringBuilder sb = new StringBuilder("Hello. ");
        set.stream()
                .forEach(x -> {
                    switch (x) {
                        case "name":
                            sb.append("My name is ").append(name).append(". ");
                            break;
                        case "age":
                            sb.append("I am ").append(age).append(". ");
                            break;
                        case "sex":
                            sb.append("I am ").append(sex == 'M' ? "male" : "female").append(". ");
                            break;
                    }
                });
        return sb.toString().trim();
    }
}