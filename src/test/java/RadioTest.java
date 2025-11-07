import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetNextRadioStation() {

        Radio radio = new Radio();

        radio.next();
        int expected = 1;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);



    }

    @Test
    public void shouldSetPreviousRadioStation() {

        Radio radio = new Radio();
        radio.prev();

        int expected = 0;
        int actual = radio.currentStation;;

        Assertions.assertEquals(expected, actual);



    }
}
