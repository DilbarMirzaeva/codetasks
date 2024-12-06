package gameSystem;

public class BoardGame extends Game {

    private int minPlayers;

    public BoardGame(String title, double price, int minPlayers) {
        super(title, price);
        this.minPlayers = minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void displayInfo() {
        System.out.println("Title:" + super.getTitle() + " | Price:" + super.getPrice() + " | minPlayers:" + minPlayers);
    }

}
