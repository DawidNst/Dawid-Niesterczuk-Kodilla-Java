package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUser = forum
                .getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getBirthDate().getYear()<= LocalDate.now().minusYears(20).getYear())
                .filter(forumUser -> forumUser.getNumberOfPost()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));

        System.out.println("\nFiltered map:");
        theResultMapOfForumUser.entrySet()
                .forEach(System.out::println);

    }


}