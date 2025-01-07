package smartHome;

import java.util.ArrayList;
import java.util.List;

public class SmartHome implements Manageable {
    private List<User> users = new ArrayList<>();
    private List<Device> devices = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public Device getDeviceStatus(int id) {
        for (Device device : devices) {
            if (device.getId() == id) return device;
        }
        return null;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "SmartHome{" +
                "users=" + users +
                ", devices=" + devices +
                '}';
    }
}
