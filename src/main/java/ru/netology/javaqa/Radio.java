package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int volume;
    private final int totalStations;


    public Radio(int totalStations) {
        this.currentStation = 0;
        this.volume = 50; // Средняя громкость
        this.totalStations = totalStations;
    }


    public Radio() {
        this(10);
    }

    public void next() {
        currentStation = (currentStation + 1) % totalStations;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = totalStations - 1;
        } else {
            currentStation--;
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station < totalStations) {
            currentStation = station;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
