package com.text.practic.answers.ansKingdom;

import com.text.practic.answers.ansKingdom.entity.Person;
import com.text.practic.answers.ansKingdom.guild.ThievesGuild;
import com.text.practic.answers.ansKingdom.tipes.PostType;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var person = new Person("B", "f",new GregorianCalendar(2001, Calendar.FEBRUARY, 20), PostType.NOT_A_MEMBER);
        var person2 = new Person("D", "A",new GregorianCalendar(2002, Calendar.FEBRUARY, 20), PostType.NOT_A_MEMBER);
        var thievesGuild = new ThievesGuild();

        thievesGuild.add(person);
        thievesGuild.add(person2);

        System.out.println(thievesGuild.getGuildHeadName());
        System.out.println(person.getBirthday());
        System.out.println(thievesGuild);

    }
}
