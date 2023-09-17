public class Fan extends FanMachine {

    private boolean isOn = false;

    public Fan(FanMediator fanMediator) {
        super(fanMediator);
    }

    public void on() {
        fanMediator.start();
        isOn = true;
        System.out.println("Fan is on");
    }

    public void off() {
        isOn = false;
        System.out.println("Fan is off");
        fanMediator.stop();
    }

    public boolean isOn() {
        return isOn;
    }
}
