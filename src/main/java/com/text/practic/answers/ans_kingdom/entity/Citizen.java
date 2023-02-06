package com.text.practic.answers.ans_kingdom.entity;

import java.util.Calendar;

public class Citizen extends AbstractPerson {
    public Citizen(String firstName, String lastName, String middleName, Calendar birthday) {
        super(firstName, lastName, middleName, birthday);
    }

    public Citizen(String firstName, String lastName, Calendar birthday) {
        super(firstName, lastName, birthday);
    }

    public Citizen(AbstractPerson person) {
        super(person);
    }

    public Citizen changeStatus(AbstractPerson person) {
        if (person.getMiddleName() != null) {
            return new Citizen(person.getFirstName(), person.getLastName(), person.getMiddleName(), person.getBirthday());
        }
        return new Citizen(person.getFirstName(), person.getLastName(), person.getBirthday());
    }
}
