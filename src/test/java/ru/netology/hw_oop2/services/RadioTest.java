package ru.netology.hw_oop2.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio qtyOfStations = new Radio(15);
    Radio volume = new Radio(100, 0);
    Radio defaultStations = new Radio(10);

    @Test
    public void setDefaultNumbersOfStation() {
        Assertions.assertEquals(10, defaultStations.getNumberOfStations());
    }

    @Test
    public void notSetAbouveDefault() {
        defaultStations.setCurrentStation(15);

        Assertions.assertEquals(0,defaultStations.getCurrentStation());
    }

    @Test
    public void shouldSetQuantityOfStations() {
        Assertions.assertEquals(15, qtyOfStations.getNumberOfStations());
    }


    @Test
    public void shouldSetNewStation() {
        qtyOfStations.setCurrentStation(3);

        Assertions.assertEquals(3, qtyOfStations.getCurrentStation());
    }

    @Test
    public void maxStation() {

        Assertions.assertEquals(14, qtyOfStations.getMaxStation());
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

    @Test
    public void setNextStation() {
        qtyOfStations.setCurrentStation(8);
        qtyOfStations.nextStation();

        Assertions.assertEquals(9, qtyOfStations.getCurrentStation());
    }

    @Test
    public void setPrevStation() {
        qtyOfStations.setCurrentStation(5);
        qtyOfStations.prevStation();

        Assertions.assertEquals(4, qtyOfStations.getCurrentStation());
    }

    //VOLUME TESTS

    @Test
    public void shouldSetVolume() {
        volume.setCurrentVolume(50);

        Assertions.assertEquals(50, volume.getCurrentVolume());
    }


    @Test
    public void shouldNotSetAboveMaxVolume() {
        volume.setCurrentVolume(120);

        Assertions.assertEquals(0, volume.getCurrentVolume());
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
    public void notIncreaseVolumeAfterMax() {
        volume.setCurrentVolume(100);
        volume.increaseVolume();

        Assertions.assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void increaseIfMinVolume() {
        volume.setCurrentVolume(0);
        volume.increaseVolume();

        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        volume.setCurrentVolume(99);
        volume.decreaseVolume();

        Assertions.assertEquals(98, volume.getCurrentVolume());
    }

    @Test
    public void notDecreaseVolumeAfterMin() {
        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getCurrentVolume());
    }
}
