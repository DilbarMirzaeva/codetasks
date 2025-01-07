package smartHome;

public class Light extends Device {

    public Light(String deviceName) {
        super(deviceName, DeviceType.LIGHT);
    }

    public void turnOn() {
        if (!isStatus()) {
            setStatus(true);
            System.out.println("Light on");
        } else {
            System.out.println("Light is already on");
        }
    }

    public void turnOff() {
        if (isStatus()) {
            setStatus(false);
            System.out.println("Light off");
        } else {
            System.out.println("Light is already off");
        }
    }


}
