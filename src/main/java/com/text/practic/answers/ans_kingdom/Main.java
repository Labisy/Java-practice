package com.text.practic.answers.ans_kingdom;

import com.text.practic.answers.ans_kingdom.entity.AbstractPerson;
import com.text.practic.answers.ans_kingdom.entity.Citizen;
import com.text.practic.answers.ans_kingdom.entity.Thief;
import com.text.practic.answers.ans_kingdom.guild.ThievesGuild;
import com.text.practic.answers.ans_kingdom.api.Guild;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var person = new Citizen("Bilbo", "Begins", new GregorianCalendar(2001, Calendar.FEBRUARY, 20));
        var person2 = new Citizen("Astarto", "Zigrikh", new GregorianCalendar(2002, Calendar.FEBRUARY, 20));
        Guild thievesGuild = new ThievesGuild();

        thievesGuild.add(person);
        thievesGuild.add(person2);

        var a = thievesGuild.getMembers();

        for (Map.Entry b: a.entrySet()) {
           if (b instanceof Thief) {
               System.out.println("да");
           }
        }

        System.out.println(thievesGuild.guildHeadName());
        System.out.println(thievesGuild.getTitle());
        System.out.println(thievesGuild);

    }
}
