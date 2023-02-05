package com.text.practic.answers.ans_kingdom.api;

import com.text.practic.answers.ans_kingdom.entity.Person;

import java.util.Map;

public interface Guild {
    void addDefaultPerson();

    void add(Person person);
    boolean remove(Person person);
    String guildHeadName();
    void renameGuid(String newName);
    Map<Person, String> getMembers();
    String getTitle();
}
