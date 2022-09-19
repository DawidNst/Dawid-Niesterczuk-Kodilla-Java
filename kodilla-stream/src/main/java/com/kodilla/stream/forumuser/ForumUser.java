package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPost;

    public ForumUser(final int userId, final String userName,final char sex, final LocalDate birthDate,
                     final int numberOfPost)
    {
        this.userId=userId;
        this.userName=userName;
        this.sex=sex;
        this.birthDate=birthDate;
        this.numberOfPost=numberOfPost;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}
