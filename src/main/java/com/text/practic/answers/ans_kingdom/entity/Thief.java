package com.text.practic.answers.ans_kingdom.entity;

import java.util.Calendar;

public class Thief extends AbstractPerson {
    public Thief(String firstName, String lastName, String middleName, Calendar birthday) {
        super(firstName, lastName, middleName, birthday);
    }

    public Thief(String firstName, String lastName, Calendar birthday) {
        super(firstName, lastName, birthday);
    }

    public Thief(AbstractPerson person) {
        super(person);
        if (person.getMiddleName() != null) {
            setFirstName(person.getFirstName());
            setLastName(person.getLastName());
            setMiddleName(person.getMiddleName());
            setBirthday(person.getBirthday());
        } else {
            setFirstName(person.getFirstName());
            setLastName(person.getLastName());
            setBirthday(person.getBirthday());
        }
    }
}
