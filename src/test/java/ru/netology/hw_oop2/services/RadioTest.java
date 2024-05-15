package ru.netology.hw_oop2.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio qtyOfStations = new Radio(15);
    Radio volume = new Radio(100, 0);
    //Radio defaultStations = new Radio(10);
    @Test
    public void shouldSetQuantityOfStations() {
        Assertions.assertEquals(15, qtyOfStations.getNumberOfStations());
    }

    /*@Test
    public void setDefaultNumbersOfStation() {
        Radio defaultStations = new Radio();
        Assertions.assertEquals(10, defaultStations.getNumberOfStations());
    }*/

    @Test
    public void shouldSetNewStation() {
        qtyOfStations.setCurrentStation(3);

        int expected = 3;
        int actual = qtyOfStations.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        Assertions.assertEquals(14,qtyOfStations.getMaxStation());
    }

   @Test
    public void shouldSetMinStation() {
        Assertions.assertEquals(0, qtyOfStations.getMinStation());
   }

   @Test
    public void setMinAfterMaxIfNext() {
        qtyOfStations.setCurrentStation(14);
        qtyOfStations.nextStation();

        Assertions.assertEquals(0, qtyOfStations.getCurrentStation());
   }

   @Test
    public void setMaxAfterMinIfPrev() {
        qtyOfStations.setCurrentStation(0);
        qtyOfStations.prevStation();

        Assertions.assertEquals(14, qtyOfStations.getCurrentStation());
   }




    /*@Test
    public void shouldSetZeroAfterNine() {

        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxStation() {
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinStation() {
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessMinStation() {
        station.setCurrentStation(9);
        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        station.setCurrentStation(7);
        station.nextStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineAfterZero() {
        station.setCurrentStation(0);
        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }*/

    //VOLUME TESTS

    @Test
    public void shouldSetVolume() {
        volume.setCurrentVolume(50);

        Assertions.assertEquals(50, volume.getCurrentVolume());
    }


    @Test
    public void shouldNotSetAboveMaxVolume() {
        volume.setCurrentVolume(120);
        volume.increaseVolume();

        Assertions.assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void shouldNotSetLessMinVolume() {
        volume.setCurrentVolume(-5);
        volume.decreaseVolume();

        Assertions.assertEquals(0,volume.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        volume.setCurrentVolume(60);
        volume.increaseVolume();

        int expected = 61;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        volume.setCurrentVolume(99);
        volume.decreaseVolume();

        Assertions.assertEquals(98, volume.getCurrentVolume());
    }
}
