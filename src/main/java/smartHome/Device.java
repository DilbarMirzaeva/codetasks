package smartHome;

public abstract class Device {
    private int id;
    private static int idNum = 0;
    private String deviceName;
    private boolean status;
    private DeviceType deviceType;
    private static int countDevice;

    public Device(String deviceName, DeviceType deviceType) {
        this.id = idNum++;
        this.deviceName = deviceName;
        this.status = false;
        this.deviceType = deviceType;
        countDevice++;
    }

    public abstract void turnOn();

    public abstract void turnOff();

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

    public static int getCountDevice() {
        return countDevice;
    }

    @Override
    public String toString() {
        return "Device{" + "id=" + id + ", deviceName='" + deviceName + '\'' + ", status=" + status + ", deviceType=" + deviceType + '}';
    }
}
