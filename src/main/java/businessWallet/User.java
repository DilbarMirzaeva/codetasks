package businessWallet;

public class User {
    private static int UserIdNum = 0;
    private int ID;
    private String name;
    private String email;

    public User(String name, String email) {
        this.ID = UserIdNum++;
        this.name = name;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
