package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Ann Smith");
        User user2 = new YGeneration("Carl Table");
        User user3 = new ZGeneration("Sara Jones");

        //When
        String annShare = user1.sharePost(new FacebookPublisher());
        System.out.println("Ann shares: " + annShare);
        String carlShare = user2.sharePost(new TwitterPublisher());
        System.out.println("Carl shares: " + carlShare);
        String saraShare = user3.sharePost(new SnapchatPublisher());
        System.out.println("Sara shares: " + saraShare);

        //Then
        Assertions.assertEquals("Facebook", annShare);
        Assertions.assertEquals("Twitter", carlShare);
        Assertions.assertEquals("Snapchat", saraShare);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user1= new Millenials("Ann Smith");

        //When
        String annShare = user1.sharePost(new SnapchatPublisher());
        System.out.println("Damian shares: " + annShare);

        //Then
        Assertions.assertEquals("Snapchat", annShare);

    }
}
