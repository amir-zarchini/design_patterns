public class Radio implements Device {

    private boolean enabled = false;
    private int chanel = 1;
    private int volume = 50;

    @Override
    public boolean isEnable() {
        return enabled;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio: turned off");
        enabled = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Radio: turned on");
        enabled = true;
    }

    @Override
    public void setChanel(int chanel) {
        System.out.println("Radio: chanel sets to " + chanel);
        this.chanel = chanel;
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio: volume sets to " + volume);
        if(volume < 0) {
            this.volume = 0;
        } else if(volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("I am radio");
        System.out.println("Status is " + (enabled ? "on" : "off"));
        System.out.println("Volume is " + volume);
        System.out.println("Chanel is " + chanel);
    }
}
