package com.text.practic.answers.ansKingdom.guild;

import com.text.practic.answers.ansKingdom.entity.Person;

import java.util.*;

public abstract class Guild {
    private String title;
    private String guildHeadName;
    private List<Person> members;
    private Map<Person, String> dateOfEntry;

    protected Guild() {
        this.title = "";
        this.guildHeadName = "";
        this.members = new ArrayList<>();
        this.dateOfEntry = new HashMap<>();
    }


    public void add(Person person) {
        if (!members.contains(person)) {
            members.add(person);
            String i = String.valueOf(new GregorianCalendar().getTime());
            dateOfEntry.put(person, i);
        }

    }

    public boolean remove(Person person) {
        if (members.contains(person)) {
            members.remove(person);
            dateOfEntry.remove(person);
            return true;
        }
        return false;
    }

    protected static String findHeadName(Map<Person, String> dateOfEntry) {
        return dateOfEntry.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .skip(dateOfEntry.size() - 1L)
                .map(Map.Entry::getKey)
                .map(Person::getFullName)
                .findFirst().orElseThrow();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGuildHeadName() {
        return guildHeadName;
    }

    public void setGuildHeadName(String guildHeadName) {
        this.guildHeadName = guildHeadName;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public Map<Person, String> getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Map<Person, String> dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    @Override
    public String toString() {
        return "Guild{" +
                "title='" + title + '\'' +
                ", guildHeadName='" + guildHeadName + '\'' +
                ", members=" + members +
                ", dateOfEntry=" + dateOfEntry +
                '}';
    }
}
