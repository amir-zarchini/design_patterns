public class AdvanceRemote extends BasicRemote {

    public AdvanceRemote(Device device) {
        super(device);
    }

    void mute() {
        System.out.println("Advance remote:mute()");
        super.device.setVolume(0);
    }
}
