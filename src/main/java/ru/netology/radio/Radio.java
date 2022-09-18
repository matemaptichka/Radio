package ru.netology.radio;

public class Radio {
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    private int currentStation;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private int volume;

    public void next() {
        if (currentStation >= 9) {
            currentStation = 0;
            return;
        }
        currentStation += 1;
    }

    public void prev() {
        if (currentStation <= 0) {
            currentStation = 9;
            return;
        }
        currentStation -= 1;
    }

    public void SetCurrentStation(int Station) {
        if (Station < 0 | Station > 9) {
            return;
        }
        currentStation = Station;
    }

    public void plus() {
        if (volume >= 10) {
            volume = 10;
            return;
        }
        volume += 1;
    }

    public void minus() {
        if (volume <= 0) {
            volume = 0;
            return;
        }
        volume -= 1;
    }
}

