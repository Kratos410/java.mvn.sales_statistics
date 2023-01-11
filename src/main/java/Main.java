import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();

        System.out.println("Показатели за год: " + Arrays.toString(sales));

        int totalSold = service.totalSold(sales);
        System.out.println("Всего продано: " + totalSold);

        int averageAmount = service.averageSalesAmount(sales);
        System.out.println("Средняя сумма продаж в месяц:  " + averageAmount);

        int minMonth = service.minSales(sales);
        System.out.println("Месяц с минимальными продажами:  " + minMonth);

        int maxMonth = service.maxSales(sales);
        System.out.println("Месяц с максимальными продажами:  " + maxMonth);


        int aboveAverageSales = service.calcAboveAverageSales(sales);
        System.out.println("Месяцев с продажами выше среднего:  " + aboveAverageSales);

        int belowAverageSales = service.calcBelowAverageSales(sales);
        System.out.println("Месяцев с продажами ниже среднего:  " + belowAverageSales);

    }
}