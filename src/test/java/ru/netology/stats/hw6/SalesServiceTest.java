package ru.netology.stats.hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void sumSaleForPeriod() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // Сумма всех месяцев

        long expectNumMix = 180;
        long actualNumMix = service.sumSales(sales);

        Assertions.assertEquals(expectNumMix, actualNumMix);
    }

    @Test
    public void sumSaleAverage() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};  // Среднее значение

        long expectedAver = 15;
        long actualAver = service.averageSumSale(sales);

        Assertions.assertEquals(expectedAver, actualAver);
    }

    @Test
    public void numberMonthMaxSale() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // Максимальное значение

        long expectNumMax = 8;
        long actualNumMax = service.maxSales(sales);

        Assertions.assertEquals(expectNumMax, actualNumMax);
    }

    @Test
    public void numberMonthMinSale() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // Минимальное значение

        long expectNumMix = 9;
        long actualNumMix = service.minSales(sales);

        Assertions.assertEquals(expectNumMix, actualNumMix);
    }

    @Test
    public void lessAverageSale() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};  // Меньше среднего

        long expectedLessAver = 7;
        long actualLessAver = service.getMinSale(sales);

        Assertions.assertEquals(expectedLessAver, actualLessAver);
    }

    @Test
    public void moreAverageSale() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};  // Больше среднего

        long expectedMoreAver = 7;
        long actualMoreAver = service.getMaxSale(sales);

        Assertions.assertEquals(actualMoreAver, expectedMoreAver);
    }


}