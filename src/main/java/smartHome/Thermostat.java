package smartHome;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String deviceName) {
        super(deviceName, DeviceType.THERMOSTAT);
    }

    public void turnOn() {
        if (!isStatus()) {
            setStatus(true);
            System.out.println("Thermostat on");
        } else {
            System.out.println("Thermostat is already on");
        }
    }

    public void turnOff() {
        if (isStatus()) {
            setStatus(false);
            System.out.println("Thermostat off");
        } else {
            System.out.println("Thermostat is already off");
        }
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}
