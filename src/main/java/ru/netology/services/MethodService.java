package ru.netology.services;

public class MethodService {

    public int calculate(int income, int expenses, int threshold) {
        int counter = 0; // счетчик
        int money = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // отдыхает
                money -= expenses;
                money /=3;
                counter++;

            } else { // работает
                money += income;
                money -= expenses;
            }
        }
        return counter;
    }
}
