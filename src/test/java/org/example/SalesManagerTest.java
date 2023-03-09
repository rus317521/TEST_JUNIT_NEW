package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesManagerTest {

    @org.junit.jupiter.api.Test
    void test_method_max_expected_valid_result() {

        int[] sales = {12,10,5,15,7,2};
        SalesManager salesManager = new SalesManager(sales);

        int result = salesManager.max();
        int expectedResult = 15;

        Assertions.assertEquals(expectedResult,result);

    }

    @Test
    void test_method_min_expected_valid_result()
    {
        int[] sales = {17,14,11,13,12,16,22,19};
        SalesManager salesManager = new SalesManager(sales);

        int result = salesManager.min();
        int expectedResult = 11;

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    void test_method_min_max_expected_boolean_result()
    {
        int[] sales = {18,17,11,23,12,16,22,19};
        SalesManager salesManager = new SalesManager(sales);

        int minR = salesManager.min();
        int maxR = salesManager.max();


        Assertions.assertTrue(minR <= maxR);
    }
}