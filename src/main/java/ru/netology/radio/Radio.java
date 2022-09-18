package ru.netology.radio;

public class Radio {
    public Radio(int StationCount) {
        this.stationCount = StationCount;
    }

    public Radio() {
        this.stationCount = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private int currentStation;
    private int volume;
    private int stationCount;
    private int maxVolume = 100;

    public void next() {
        if (currentStation >= stationCount - 1) {
            currentStation = 0;
            return;
        }
        currentStation += 1;
    }

    public void prev() {
        if (currentStation <= 0) {
            currentStation = stationCount - 1;
            return;
        }
        currentStation -= 1;
    }

    public void SetCurrentStation(int Station) {
        if (Station < 0 | Station > stationCount - 1) {
            return;
        }
        currentStation = Station;
    }

    public int getStationCount() {
        return stationCount;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void plus() {
        if (volume >= maxVolume) {
            volume = maxVolume;
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

