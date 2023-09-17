public class FanMediatorImpl implements FanMediator {

    private Fan fan;
    private PowerSupply powerSupply;

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void pressButton() {
        if(fan.isOn())
            fan.off();
        else
            fan.on();
    }

    @Override
    public void start() {
        powerSupply.on();
    }

    @Override
    public void stop() {
        powerSupply.off();
    }
}
