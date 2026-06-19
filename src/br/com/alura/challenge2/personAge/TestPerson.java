package br.com.alura.challenge2.personAge;

import br.com.alura.challenge1.person.Person;

public class TestPerson {
    public static void main(String[] args) {
        PersonsAge person = new PersonsAge();

        person.setName("Rafael");
        person.setAge(21);

        person.verifyAge();
    }
}
