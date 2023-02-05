package com.text.practic.answers.ans_kingdom.guild;

import com.text.practic.answers.ans_kingdom.entity.Person;
import com.text.practic.answers.ans_kingdom.repo.Guild;
import com.text.practic.answers.ans_kingdom.tipes.PostType;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class AbstractGuild implements Guild {
    private String title;
    private String guildHeadName;
    private final Map<Person, String> members;

    protected AbstractGuild() {
        this.title = "";
        this.guildHeadName = "";
        this.members = new HashMap<>();
    }
    @Override
    public void add(Person person) {
        if (!members.containsKey(person)) {
            person.setPostType(PostType.RECRUIT);
            person.setGuildName(getTitle());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            members.put(person, format.format(new GregorianCalendar().getTime()));
        }
    }

    @Override
    public boolean remove(Person person) {
        if (members.containsKey(person)) {
            members.remove(person);
            person.setGuildName(null);
            return true;
        }
        return false;
    }

    protected void findHeadName() {
        String master = members.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .map(Map.Entry::getKey)
                .map(Person::getFullName)
                .skip(members.size() - 1L)
                .findFirst().orElseThrow();
        setNewMaster(master);
        setGuildHeadName(master);
    }

    private void setNewMaster(String master) {
        members.keySet().stream()
                .filter(x -> x.getFullName().equals(master))
                .findFirst().orElseThrow()
                .setPostType(PostType.MASTER);
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
     public void renameGuid(String newName) {
        this.title = newName;
    }
    @Override
    public String guildHeadName() {
        return guildHeadName;
    }

    private void setGuildHeadName(String guildHeadName) {
        this.guildHeadName = guildHeadName;
    }
    @Override
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
