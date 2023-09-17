public class PowerButton extends FanMachine {

    public PowerButton(FanMediator fanMediator) {
        super(fanMediator);
    }

    public void press() {
        fanMediator.pressButton();
    }
}
