package com.text.practic.answers.ans_kingdom.guild;

import com.text.practic.answers.ans_kingdom.entity.AbstractPerson;
import com.text.practic.answers.ans_kingdom.entity.Thief;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ThievesGuild extends AbstractGuild {

    private int theftCounter;
    public ThievesGuild() {
        renameGuid("Thieves");
        addDefaultPerson();
        findHeadName();
    }

    @Override
    public void addDefaultPerson() {
        var p = new Thief("Alvor", "Sec", new GregorianCalendar(2000, Calendar.FEBRUARY, 20));
        var p2 = new Thief("Rockster", "f", new GregorianCalendar(1980, Calendar.JANUARY, 20));
        add(p);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        add(p2);
    }

    @Override
    public void add(AbstractPerson person) {
        super.add(new Thief(person));
    }

    public int getTheftCounter() {
        return theftCounter;
    }

}
