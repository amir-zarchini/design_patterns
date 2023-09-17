public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote::power()");
        if(device.isEnable()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void chanelUp() {
        System.out.println("Remote::chanelUp()");
        device.setChanel(device.getChanel() + 1);
    }

    @Override
    public void chanelDown() {
        System.out.println("Remote:chanelDown()");
        device.setChanel(device.getChanel() - 1);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote:volumeUp()");
        device.setVolume(device.getVolume() + 5);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote:volumeDown()");
        device.setVolume(device.getVolume() - 5);
    }
}
