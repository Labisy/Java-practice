package com.text.practic.answers.ans_kingdom.guild;

import com.text.practic.answers.ans_kingdom.entity.Person;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ThievesGuild extends AbstractGuild {
    public ThievesGuild() {
        renameGuid("Thieves");
        addDefaultPerson();
        findHeadName();
    }

    @Override
    public void addDefaultPerson() {
        var p = new Person("Alvor", "Sec", new GregorianCalendar(2000, Calendar.FEBRUARY, 20));
        var p2 = new Person("Rockster", "f", new GregorianCalendar(1980, Calendar.JANUARY, 20));
        add(p);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        add(p2);
    }

}
