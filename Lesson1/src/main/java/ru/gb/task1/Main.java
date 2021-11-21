package ru.gb.task1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person.Builder().addFirstName("Bob").addLastName("Ivanov").build();
        System.out.println(p.getFirstName() + " " + p.getLastName());
    }
}
