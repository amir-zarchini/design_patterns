public interface Device {

    boolean isEnable();

    void turnOff();

    void turnOn();

    void setChanel(int chanel);

    int getChanel();

    void setVolume(int volume);

    int getVolume();

    void printStatus();
}
