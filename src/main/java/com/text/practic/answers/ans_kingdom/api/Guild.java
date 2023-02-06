package com.text.practic.answers.ans_kingdom.api;

import com.text.practic.answers.ans_kingdom.entity.AbstractPerson;

import java.util.Map;

public interface Guild {
    void addDefaultPerson();

    void add(AbstractPerson person);
    boolean remove(AbstractPerson person);
    String guildHeadName();
    void renameGuid(String newName);
    Map<AbstractPerson, String> getMembers();
    String getTitle();
}
