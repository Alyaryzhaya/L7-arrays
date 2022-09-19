package ru.netology.lekcii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureServiceTest {

    @Test

    public void shouldFindBetweenEnds(){  // будет находить номер минимального дня между концами

        TemperatureService service = new TemperatureService(); // объект (сервис)

        int[] temps = {15, 20, 18, 4, 34, 30};  // создаем массив температур

        int expectedDay = 3; // номер дня
        int actualDay = service.getMinDay(temps); // вызываем метод и передаем туда массив температур

        Assertions.assertEquals(expectedDay, expectedDay);
    }
}
