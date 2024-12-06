package gameSystem;

public class VideoGame extends Game {

    private String platform;

    public VideoGame(String title, double price, String platform) {
        super(title, price);
        this.platform = platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void displayInfo() {
        System.out.println("Title:" + super.getTitle() + " | Price:" + super.getPrice() + " | platform:" + platform);
    }

}
