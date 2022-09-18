package ru.netology.radio;

public class Radio {
    public Radio(int StationCount) {
        this.StationCount = StationCount;
    }

    public Radio() {
        this.StationCount = 10;
    }

    public int CurrentStation;
    public int Volume;
    private int StationCount;
    private int MaxVolume = 100;

    public void next() {
        if (CurrentStation >= StationCount - 1) {
            CurrentStation = 0;
            return;
        }
        CurrentStation += 1;
    }

    public void prev() {
        if (CurrentStation <= 0) {
            CurrentStation = StationCount - 1;
            return;
        }
        CurrentStation -= 1;
    }

    public void SetCurrentStation(int Station) {
        if (Station < 0 | Station > StationCount - 1) {
            return;
        }
        CurrentStation = Station;
    }

    public int getStationCount() {
        return StationCount;
    }

    public int getMaxVolume() {
        return MaxVolume;
    }

    public void plus() {
        if (Volume >= MaxVolume) {
            Volume = MaxVolume;
            return;
        }
        Volume += 1;
    }

    public void minus() {
        if (Volume <= 0) {
            Volume = 0;
            return;
        }
        Volume -= 1;
    }
}

