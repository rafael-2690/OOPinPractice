package br.com.alura.challenge2.personAge;

public class PersonsAge {

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

    public void verifyAge(){
        if (age >= 18){
            System.out.println("The person is of legal age");
        }else{
            System.out.println("The person is a minor");
        }
    }
}
