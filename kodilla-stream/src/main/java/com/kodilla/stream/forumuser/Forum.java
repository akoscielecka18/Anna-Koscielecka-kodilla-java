package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    public static List<ForumUser> getUserList(){
        final List<ForumUser> theUserForum = new ArrayList<>();

        theUserForum.add(new ForumUser(123, "Tom", 'M', LocalDate.of(1990, 6, 12), 2));
        theUserForum.add(new ForumUser(234, "Sam", 'M', LocalDate.of(2000, 10, 10), 0));
        theUserForum.add(new ForumUser(345, "Ben", 'M', LocalDate.of(2004, 5, 12), 12));
        theUserForum.add(new ForumUser(963, "Carol", 'M', LocalDate.of(2002, 9, 22), 6));
        theUserForum.add(new ForumUser(456, "Ann", 'F', LocalDate.of(1987, 12, 14), 15));
        theUserForum.add(new ForumUser(567, "Ola", 'F', LocalDate.of(2000, 1, 25), 1));
        theUserForum.add(new ForumUser(678, "Taylor", 'F', LocalDate.of(2010, 11, 19), 10));

        return new ArrayList<>(theUserForum);
    }
}

