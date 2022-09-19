package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(121, "Monica Balck", 'F', LocalDate.of(1999,5,13),5));
        userList.add(new ForumUser(112, "David Dog", 'M',LocalDate.of(2004,5,18),1));
        userList.add(new ForumUser(125, "Jesica Fox", 'F', LocalDate.of(2003,6,29),9));
        userList.add(new ForumUser(129, "Jan White", 'M',LocalDate.of(2002,9,30),3));
        userList.add(new ForumUser(128, "Kathe Cat", 'F', LocalDate.of(2002,6,30),12 ));
        userList.add(new ForumUser(126, "John Smith", 'M', LocalDate.of(2001,7,27),99));

    }
        public List<ForumUser> getUserList()
        {
            return new ArrayList<>(userList);
        }


}
