package ru.netology.sqr.HowManySquares.services;

public class SQRService {
    public int calcSqr(int x, int y) {
        int numberOfSquares = 0;
        counterLoop:
        for (int i = 10; i <= 99; i++) {
            while (i * i >= x & i * i <= y) {
                numberOfSquares++;
                continue counterLoop;
            }
        }
        return numberOfSquares;
    }
}
