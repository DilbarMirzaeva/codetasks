package smartHome;

public class MainApp {
    public static void main(String[] args) {
        User user1 = new User("Aidan", "Mammadova", "Aidanmmamd@yahoo.com", "qwerty2k37");
        User user2 = new User("Rufat", "Hasanov", "rufathasan@gmail.com", "bduhfcnf299");
        System.out.println(user1);

        Device camera1 = new Camera("Front Camera");
        System.out.println(camera1.toString());
        System.out.println(camera1.getDeviceType());
        System.out.println(camera1.getDeviceName());
        camera1.turnOn();
        camera1.turnOff();

        Camera camera2 = new Camera("Living Room Camera");
        System.out.println(camera2.toString());
        camera2.turnOn();
        camera2.startRecording();
        camera2.stopRecording();
        camera2.turnOff();

        Thermostat thermostat = new Thermostat("Living Room Thermostat");
        System.out.println(thermostat.toString());
        thermostat.turnOn();
        thermostat.setTemperature(30);
        thermostat.turnOff();

        Device light = new Light("Bedroom light");
        System.out.println(light.toString());
        System.out.println(light.getDeviceName());
        light.turnOn();
        System.out.println("Status is " + light.isStatus());

        Doorbell doorbell = new Doorbell("Garage doorbell");
        System.out.println(doorbell.toString());
        doorbell.turnOn();
        doorbell.ring();
        doorbell.turnOff();

        SmartHome smartHome = new SmartHome();
        smartHome.addUser(user1);
        smartHome.addUser(user2);
        smartHome.addDevice(light);
        smartHome.addDevice(camera2);
        smartHome.addDevice(camera1);
        smartHome.addDevice(thermostat);
        smartHome.addDevice(doorbell);
        System.out.println(smartHome.toString());
        smartHome.removeDevice(camera1);
        smartHome.removeUser(user1);
        System.out.println(smartHome.toString());

    }
}
