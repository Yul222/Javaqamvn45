package ru.netology.javaqa;

public class Radio {
    private int currentStation; // Номер текущей радиостанции
    private int volume; // Громкость звука


    public Radio() {

        this.currentStation = 0;
        this.volume = 50; //средняя громкость
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }


    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        } else {
            System.out.println();
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
