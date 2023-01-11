package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSalse( ){
        StatsService service = new StatsService();
        long [] sales = {
                1,2,3,};

        long expected = 6;
        long actual = service.totalSold(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averageSalesAmount (){
        StatsService service = new StatsService();
        long expected = 11;
        long [] sales= {
                0,15,20
        };
        long actual =service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonth( ){
        StatsService service = new StatsService();
        long [] sales = {
                22,17,10,14};

        long expected = 3;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxMonth( ){
        StatsService service = new StatsService();
        long [] sales = {
                22,17,10,14};

        long expected = 1;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageSales( ){
        StatsService service = new StatsService();
        long [] sales = {
                22,17,10,14};

        long expected =2;
        long actual = service.calcAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageSales( ){
        StatsService service = new StatsService();
        long [] sales = {
                22,17,10,14};

        long expected =2;
        long actual = service.calcBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}
