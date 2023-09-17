public class MediatorTest {

    public static void main(String[] args) {

        FanMediator fanMediator = new FanMediatorImpl();

        PowerButton powerButton = new PowerButton(fanMediator);
        Fan fan = new Fan(fanMediator);
        PowerSupply powerSupply = new PowerSupply();

        ((FanMediatorImpl) fanMediator).setFan(fan);
        ((FanMediatorImpl) fanMediator).setPowerSupply(powerSupply);

        powerButton.press();
        powerButton.press();
    }
}
