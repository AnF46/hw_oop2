package ru.netology.hw_oop2.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio station = new Radio();
    Radio volume = new Radio();

    @Test
    public void shouldSetNewStation() {
        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
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
    }

    //VOLUME TESTS

    @Test
    public void shouldASetVolume() {

        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetAboveMaxVolume() {
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLessMinVolume() {
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

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
    public void shouldNotSetMoreVolume() {
        volume.setCurrentVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessVolume() {
        volume.setCurrentVolume(50);
        volume.decreaseVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLessVolume() {
        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
