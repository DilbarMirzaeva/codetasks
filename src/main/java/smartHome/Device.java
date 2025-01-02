package smartHome;

public class Device {
    private int id;
    private String deviceName;
    private boolean status;
    private DeviceType deviceType;

    public Device(int id, String deviceName, boolean status, DeviceType deviceType) {
        this.id = id;
        this.deviceName = deviceName;
        this.status = status;
        this.deviceType = deviceType;
    }

    public void turnOn() {
    }

    public void turnOff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }
}
