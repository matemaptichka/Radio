package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testNext() {
        Radio radio = new Radio(23);
        radio.setCurrentStation(8);
        radio.next();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testNextMax() {
        Radio radio = new Radio(3);
        radio.setCurrentStation(radio.getStationCount() - 1);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextMoreMax() {
        Radio radio = new Radio(4);
        radio.setCurrentStation(radio.getStationCount());
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio(45);
        radio.setCurrentStation(1);
        radio.prev();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevMin() {
        Radio radio = new Radio(28);
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(radio.getStationCount() - 1, radio.getCurrentStation());
    }

    @Test
    public void testPrevLessMin() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(-1);
        radio.prev();
        Assertions.assertEquals(radio.getStationCount() - 1, radio.getCurrentStation());
    }

    @Test
    public void testSet() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(3);
        radio.SetCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetLessMax() {
        Radio radio = new Radio(13);
        radio.setCurrentStation(3);
        radio.SetCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testSetMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(radio.getStationCount() - 1);
        Assertions.assertEquals(radio.getStationCount() - 1, radio.getCurrentStation());
    }

    @Test
    public void testSetMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(radio.getStationCount());
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void testSetMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(1);
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testSetMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(-1);
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void testPlus() {
        Radio radio = new Radio();
        radio.setVolume(radio.getMaxVolume() - 1);
        radio.plus();
        Assertions.assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    public void testPlusMax() {
        Radio radio = new Radio();
        radio.setVolume(radio.getMaxVolume());
        radio.plus();
        Assertions.assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    public void testPlusMoreMax() {
        Radio radio = new Radio();
        radio.setVolume(radio.getMaxVolume() + 1);
        radio.plus();
        Assertions.assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    public void testMinus() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.minus();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testMinusMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.minus();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testMinusLessMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.minus();
        Assertions.assertEquals(0, radio.getVolume());
    }
}
