import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Тестирование радиостанций.

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreThanTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    // Граничные значения радиостанций: -1 , 0 , 1

    @Test
    public void lessThanBoundZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void boundZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreThanBoundZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    // Граничные значения радиостанций: 8 , 9 , 10

    @Test
    public void lessThanBoundNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void boundNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreThanBoundNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    // Тестирование переключения следующей и предыдущай радиостанции

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    // Граничные значения 1 , 0 , -1
    // Увеличение громкости на один пункт

    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Уменьшение громкости на один пункт

    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    // Уменьшение громкости на один пункт для проверки граничного значения.
    // Должно получиться 0 , а не -1

    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }



    // Увеличение громкости на один пункт 99 раз
    // для проверки граничных значений 99, 100, 101

    public void shouldIncreaseVolumeTo99() {
        Radio radio = new Radio();

        for (int i = 0; i < 99; i++) {
            radio.increaseVolume();
        }

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    public void shouldIncreaseVolumeTo100() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    public void tryingIncreaseVolumeTo101() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }




}






