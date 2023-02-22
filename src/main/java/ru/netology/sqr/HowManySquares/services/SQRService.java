package ru.netology.sqr.HowManySquares.services;

public class SQRService {
    public int calcSqr(int lowerLimit, int upperLimit) {
        int numberOfSquares = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit & i * i <= upperLimit) {
                numberOfSquares++;
            }
        }
        return numberOfSquares;
    }
}
