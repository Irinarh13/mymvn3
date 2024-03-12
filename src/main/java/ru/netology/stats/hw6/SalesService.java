package ru.netology.stats.hw6;

public class SalesService {
    public long sumSales(long[] sales) {             // Сумма всех месяцев
        int sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public long averageSumSale(long[] sales) {
        return sumSales(sales) / sales.length;     // Среднее значение
    }

    public long maxSales(long[] sales) {
        int maxMounth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMounth]) {     // Максимальное значение
                maxMounth = i;
            }
        }
        return maxMounth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {    // Минимальное значение
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long getMinSale(long[] sales) {
        int minSale = 0;
        long averageSale = averageSumSale(sales);
        for (long sale : sales) {
            if (sale <= averageSale) { // Меньше среднего
                minSale++;
            }
        }
        return minSale;
    }

    public long getMaxSale(long[] sales) {
        int maxSale = 0;
        long averageSale = averageSumSale(sales);
        for (long sale : sales) {
            if (sale >= averageSale) { // Больше среднего
                maxSale++;
            }
        }
        return maxSale;
    }
}
