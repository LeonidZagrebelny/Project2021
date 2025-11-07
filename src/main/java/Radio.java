public class Radio {
    public int currentVolume;
    public int currentStation;
    public int getCurrentStation;


    public int getCurrentStation() {
        return currentStation;
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


    // Переключение радиостанции

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;

        }

        if (currentStation == 9) {
            currentStation = 0;

        }
    }


    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            }

        if (currentStation < 0) {
            currentStation = 9;
        }

    }


        public void setCurrentStation ( int newCurrentStation){


            if (newCurrentStation < 0) {
                return;
            }
            if (newCurrentStation > 9) {
                return;
            }

            currentStation = newCurrentStation;

        }

    }