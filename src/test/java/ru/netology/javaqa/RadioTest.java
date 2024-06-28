package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.next();
        assertEquals(9, radio.getCurrentStation());
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.prev();
        assertEquals(0, radio.getCurrentStation());
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveRange() {
        Radio radio = new Radio();
        radio.setStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationBelowRange() {
        Radio radio = new Radio();
        radio.setStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationWithinRange() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.decreaseVolume();
        }
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    void shouldWrapAroundToFirstStationFromLast() {
        Radio radio = new Radio(10);
        radio.setStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldWrapAroundToLastStationFromFirst() {
        Radio radio = new Radio(10);
        radio.setStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationBeyondRange() {
        Radio radio = new Radio(10);
        radio.setStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
}


