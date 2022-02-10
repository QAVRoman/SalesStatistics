package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void sholdSum() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumOfAllSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void sholdAverageSum() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSum(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldQtyMonthSaleBelowAverage() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.QtyMonthSaleBelowAverage(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldQtyMonthSaleAboveAverage() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.QtyMonthSaleAboveAverage(allSales);
        assertEquals(expected, actual);
    }
}