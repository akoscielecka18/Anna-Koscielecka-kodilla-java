package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistic {

    private Statistics statistics;

    public CalculateStatistic(Statistics statistics){
        this.statistics = statistics;
    }
    public List<String> userNames(){
        return statistics.usersNames();
    }
    public int postsCount() {

        return statistics.postsCount();
    }

    public int commentsCount() {
        return statistics.commentsCount();
    }

    public void calculateAdvStatistics(Statistics statistics){
        int usersCount = statistics.usersNames().size();
        double averagePostsNumberOfUser = statistics.postsCount()/usersCount;
        double averageCommentsOfUser = statistics.commentsCount()/usersCount;
        double averageCommentsOfPost = statistics.commentsCount()/ statistics.postsCount();
    }
    public List<String> showStatistics() {
        return null;
    }
}
