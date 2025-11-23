public class Radio {
    private int currentVolume;
    private int currentStation;


    public void next() {
        if (currentStation != 9) {
            currentStation = currentStation +1;
        }
        else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        }
        else {
            currentStation = 9;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation){
        if (currentStation < 0) {
            return;
        }

        if (currentStation > 9) {
            return;
        }

        this.currentStation = currentStation;
    }







    public int getCurrentVolume() {
        return currentVolume;
    }



    // Регулирование громкости

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }




}