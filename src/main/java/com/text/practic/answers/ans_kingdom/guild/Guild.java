package com.text.practic.answers.ans_kingdom.guild;

import com.text.practic.answers.ans_kingdom.entity.Person;
import com.text.practic.answers.ans_kingdom.tipes.PostType;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Guild {
    private String title;
    private String guildHeadName;
    private final Map<Person, String> members;

    protected Guild() {
        this.title = "";
        this.guildHeadName = "";
        this.members = new HashMap<>();
    }


    public void add(Person person) {
        if (!members.containsKey(person)) {
            person.setPostType(PostType.RECRUIT);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            members.put(person, format.format(new GregorianCalendar().getTime()));
        }
    }

    public boolean remove(Person person) {
        if (members.containsKey(person)) {
            members.remove(person);
            return true;
        }
        return false;
    }

    protected String findHeadName() {
        String master = members.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .map(Person::getFullName)
                .skip(members.size() - 1L)
                .findFirst().orElseThrow();
        setNewMaster(master);
        return master;
    }

    private void setNewMaster(String master) {
        members.keySet().stream()
                .filter(x -> x.getFullName().equals(master))
                .findFirst().orElseThrow()
                .setPostType(PostType.MASTER);
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

    public Map<Person, String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Guild{" +
                "title='" + title + '\'' +
                ", guildHeadName='" + guildHeadName + '\'' +
                ", members=" + members +
                '}';
    }
}
