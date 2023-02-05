package com.text.practic.answers.ans_kingdom.guild;

import com.text.practic.answers.ans_kingdom.entity.Person;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ThievesGuild extends Guild {
    public ThievesGuild() {
        setTitle("Thieves");
        addDefaultPerson();
        setGuildHeadName(findHeadName());
    }

    private void addDefaultPerson() {
        var p = new Person("Alvor", "Sec", new GregorianCalendar(2000, Calendar.FEBRUARY, 20));
        var p2 = new Person("Rockster", "f", new GregorianCalendar(1980, Calendar.JANUARY, 20));
        add(p);
        add(p2);
    }
}
