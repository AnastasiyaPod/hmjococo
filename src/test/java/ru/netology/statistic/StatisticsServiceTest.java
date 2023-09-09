package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxOne() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {24, 17,6, 12, 9, 21, 24, 38, 19, 10, 26};
        long expected = 38;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}