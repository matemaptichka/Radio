package ru.netology.radio;

public class Radio {
    public int CurrentStation;
    public int Volume;

    public void next() {
        if (CurrentStation >= 9) {
            CurrentStation = 0;
            return;
        }
        CurrentStation += 1;
    }

    public void prev() {
        if (CurrentStation <= 0) {
            CurrentStation = 9;
            return;
        }
        CurrentStation -= 1;
    }

    public void SetCurrentStation(int Station) {
        if (Station < 0 | Station > 9) {
            return;
        }
        CurrentStation = Station;
    }

    public void plus() {
        if (Volume >= 10) {
            Volume = 10;
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

