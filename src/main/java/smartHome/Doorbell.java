package smartHome;

public class Doorbell extends Device {

    public Doorbell(String deviceName) {
        super(deviceName, DeviceType.DOORBELL);
    }

    public void turnOn() {
        if (!isStatus()) {
            setStatus(true);
            System.out.println("Doorbell on");
        } else {
            System.out.println("Doorbell is already on");
        }
    }

    public void turnOff() {
        if (isStatus()) {
            setStatus(false);
            System.out.println("Doorbell off");
        } else {
            System.out.println("Doorbell is already off");
        }
    }

    public void ring() {
        System.out.println("Doorbell is ringing");
    }

}
