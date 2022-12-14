package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate localDate;
    private final int postNumber;

    public ForumUser(final int id, final String userName,final char sex, final LocalDate localDate, final int postNumber) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.localDate = localDate;
        this.postNumber = postNumber;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", localDate=" + localDate +
                ", postNumber=" + postNumber +
                '}';
    }
}
