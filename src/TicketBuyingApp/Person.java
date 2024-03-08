package TicketBuyingApp;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Person name cannot be null or empty.");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
    public int getAge() {
        return age;
    }
    public String displayInfo() {
       return "Name: "+name+", Age: "+age;
    }
}
