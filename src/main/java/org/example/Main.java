package org.example;
public class Main {
    public static void main(String[] args) {
        int[] sales = {20, 30, 100, 50, 30};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + salesManager.max());
    }
}

