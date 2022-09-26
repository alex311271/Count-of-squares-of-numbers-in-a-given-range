package ru.netology.homework.sqr;


public class SQRService {
    public int calcSQRService(int rangeLimitLeft, int rangeLimitRight) {
        int s = 0;
        for (int i = 10; i <= 99; i++) {
            if (rangeLimitLeft <= i * i) {
                s = s + 1;
                if (rangeLimitRight < i * i) {
                    s = s - 1;
                    break;
                }

            }

        }
        return (s);
    }
}
