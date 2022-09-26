package ru.netology.homework.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRService.csv")
    public void test(int expected, int rangeLimitLeft, int rangeLimitRight) {
        SQRService service = new SQRService();
        int actual = service.calcSQRService(rangeLimitLeft, rangeLimitRight);
        Assertions.assertEquals(expected, actual);
    }


}

