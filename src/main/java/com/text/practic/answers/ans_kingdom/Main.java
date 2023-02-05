package com.text.practic.answers.ans_kingdom;

import com.text.practic.answers.ans_kingdom.entity.Person;
import com.text.practic.answers.ans_kingdom.guild.ThievesGuild;
import com.text.practic.answers.ans_kingdom.repo.Guild;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        var person = new Person("Bilbo", "Begins", new GregorianCalendar(2001, Calendar.FEBRUARY, 20));
        var person2 = new Person("Astarto", "Zigrikh", new GregorianCalendar(2002, Calendar.FEBRUARY, 20));
        Guild thievesGuild = new ThievesGuild();

        thievesGuild.add(person);
        thievesGuild.add(person2);

        System.out.println(thievesGuild.guildHeadName());
        System.out.println(thievesGuild.getTitle());
        System.out.println(person.getBirthday());
        System.out.println(thievesGuild);

    }
}
