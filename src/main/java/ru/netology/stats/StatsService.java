package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int totalSold(long[] sales) {
        int totalSold = 0; // сумма продаж за все месяцы
        int month; // месяц
        for (month = 0; month < sales.length; month++) {
            totalSold += sales[month];
        }
        return totalSold;
    }

    public int averageSalesAmount(long[] sales) {
        int averageAmount = totalSold(sales) / sales.length; // средняя сумма продаж в месяц
        return averageAmount;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; //месяц с мини мальными продажами
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        // sales[minMonth] - продажи в месяце minMonth
        // sale - продажи в рассматриваемом месяце
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // месяц с максимальными продажами
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calcAboveAverageSales(long[] sales) {
        int averageAmount = averageSalesAmount(sales); // средняя сумма продаж в месяц
        int aboveAverageSales = 0; // Колличество месяцев с продажами выше среднего

        for (long sale : sales) {
            if (sale > averageAmount) {
                aboveAverageSales = aboveAverageSales + 1;
            }
        }
        return aboveAverageSales;
    }

    public int calcBelowAverageSales(long[] sales) {
        int averageAmount = averageSalesAmount(sales); // средняя сумма продаж в месяц
        int belowAverageSales = 0; // Колличество месяцев с продажами ниже среднего

        for (long sale : sales) {
            if (sale < averageAmount) {
                belowAverageSales = belowAverageSales + 1;
            }
        }
        return belowAverageSales;
    }
}
