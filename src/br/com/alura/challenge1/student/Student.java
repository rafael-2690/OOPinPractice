package br.com.alura.challenge1.student;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void DisplayRecord() {
        System.out.printf("""
                The name is: %s
                The age is: %d
                """, name, age);
    }

}
