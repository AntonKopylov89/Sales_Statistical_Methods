package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSales(long[] sales) {
        int avg = sumSales(sales) / 12;
        return avg;
    }

    public int numMonLowAvgSales(long[] sales) {
        int numMon = 0;
        for (long sale : sales) {
            if (sale < avgSales(sales)) {
                numMon++;
            }
        }
        return numMon;
    }

    public int numMonHighAvgSales(long[] sales) {
        int numMon = 0;
        for (long sale : sales) {
            if (sale > avgSales(sales)) {
                numMon++;
            }
        }
        return numMon;
    }
}
