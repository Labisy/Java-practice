package com.text.practic.answers.ans_kingdom.entity;

import com.text.practic.answers.ans_kingdom.tipes.PostType;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private Calendar birthday;
    private PostType postType;
    private int salary;
    private String guildName;

    public Person(String firstName, String lastName, String middleName, Calendar birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.postType = PostType.NOT_A_MEMBER;
        this.salary = 2;
    }

    public Person(String firstName, String lastName, Calendar birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.postType = PostType.NOT_A_MEMBER;
        this.salary = 2;
    }

    public String getFullName() {
        if (middleName == null) {
            return String.format("%s %s", firstName, lastName);
        }
        return String.format("%s %s %s", firstName, lastName, middleName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthday() {
        return birthday.getTime();
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthday=" + birthday.getTime() +
                ", postType=" + postType +
                ", guildName='" + guildName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return salary == person.salary && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(middleName, person.middleName) && Objects.equals(birthday, person.birthday) && postType == person.postType && Objects.equals(guildName, person.guildName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, birthday, postType, salary, guildName);
    }
}
