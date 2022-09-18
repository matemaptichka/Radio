package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testNextMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testPrevLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSet() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetLessMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testSetMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.SetCurrentStation(10);
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
        radio.setVolume(9);
        radio.plus();
        Assertions.assertEquals(10, radio.getVolume());
    }

    @Test
    public void testPlusMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.plus();
        Assertions.assertEquals(10, radio.getVolume());
    }

    @Test
    public void testPlusMoreMax() {
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.plus();
        Assertions.assertEquals(10, radio.getVolume());
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
