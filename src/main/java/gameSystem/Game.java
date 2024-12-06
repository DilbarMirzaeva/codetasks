package gameSystem;

import java.util.Objects;

public class Game {

    private String title;
    private double price;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("title:" + title + " | price:" + price);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return title.equals(game.title) && Double.compare(price, game.price) == 0;
    }

    public int hashCode() {
        return Objects.hash(title, price);
    }

}
