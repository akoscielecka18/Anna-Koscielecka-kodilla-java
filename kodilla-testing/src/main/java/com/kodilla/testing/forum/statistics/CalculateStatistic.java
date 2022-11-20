package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistic {

    private Statistics statistics;

    public CalculateStatistic(Statistics statistics){
        this.statistics = statistics;
    }

    int numbersOfUsers = statistics.usersNames().size();
    int numberOfPosts = statistics.postsCount();
    int numberOfComments = statistics.commentsCount();

    public double averagePostsNumberOfUser(){
        return statistics.postsCount()/numbersOfUsers;
    }
    public double averageCommentsOfUser(){
        return statistics.commentsCount()/numbersOfUsers;
    }
    public double averageCommentsOfPost(){
        return statistics.commentsCount()/numberOfPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){
        int numbersOfUsers;
        int numberOfPosts;
        int numberOfComments;
        double averagePostsNumberOfUser;
        double averageCommentsOfUser;
        double averageCommentsOfPost;
    }
    public List<String> showStatistics() {
        return null;
    }
}
