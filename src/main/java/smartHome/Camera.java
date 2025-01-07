package smartHome;

public class Camera extends Device {
    private boolean recording;

    public Camera(String deviceName) {
        super(deviceName, DeviceType.CAMERA);
    }

    public void turnOn() {
        if (!isStatus()) {
            setStatus(true);
            System.out.println("Camera on");
        } else {
            System.out.println("Camera is already on");
        }
    }

    public void turnOff() {
        if (isStatus()) {
            setStatus(false);
            System.out.println("Camera off");
        } else {
            System.out.println("Camera is already off");
        }
    }


    public void startRecording() {
        if (!isRecording()) {
            setRecording(true);
            System.out.println("Camera" + super.getId() + " recording is starting");
        } else {
            System.out.println("Camera" + super.getId() + " recording is already starting ");
        }
    }

    public void stopRecording() {
        if (isRecording()) {
            setRecording(false);
            System.out.println("Camera" + super.getId() + " recording is stopping ");
        } else {
            System.out.println("Camera" + super.getId() + " recording is already stopping");
        }
    }

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }
}
