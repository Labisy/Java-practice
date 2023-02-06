package com.text.practic.answers.ans_kingdom.entity;

import com.text.practic.answers.ans_kingdom.tipes.PostType;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public abstract class AbstractPerson {
    public static final String OUTPUT_DATE_FORMAT = "yyyy-MM-dd";
    public final SimpleDateFormat dateFormat = new SimpleDateFormat(OUTPUT_DATE_FORMAT);
    private String firstName;
    private String lastName;
    private String middleName;
    private Calendar birthday;
    private PostType postType;
    private int salary;
    private String guildName;

    protected AbstractPerson(String firstName, String lastName, String middleName, Calendar birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.postType = PostType.NOT_A_MEMBER;
        this.salary = 2;
    }

    protected AbstractPerson(String firstName, String lastName, Calendar birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.postType = PostType.NOT_A_MEMBER;
        this.salary = 2;
    }

    protected AbstractPerson(AbstractPerson person) {
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

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String getPostType() {
        return postType.getPost();
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
                "fullName='" + getFullName() + '\'' +
                ", birthday=" + dateFormat.format(birthday.getTime()) +
                ", postType=" + postType +
                ", guildName='" + guildName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPerson person = (AbstractPerson) o;
        return salary == person.salary && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(middleName, person.middleName) && Objects.equals(birthday, person.birthday) && postType == person.postType && Objects.equals(guildName, person.guildName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, birthday, postType, salary, guildName);
    }
}
