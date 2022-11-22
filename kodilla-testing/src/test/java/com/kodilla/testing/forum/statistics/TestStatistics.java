package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestStatistics {

    @Mock
    private Statistics statisticsMock;

    @Test
    void numberOfPosts0(){
        //given
        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        //when
        when(statisticsMock.postsCount()).thenReturn(0);
        //then
        Assertions.assertEquals(0, calculateStatistic.postsCount());
    }
}
