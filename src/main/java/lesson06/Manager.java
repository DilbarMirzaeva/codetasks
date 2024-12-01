package lesson06;

public class Manager extends Employee {
    private int teamSize;


    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("teamSize:" + teamSize);
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        return super.calculateBonus(percentage, fixedAmount) + (teamSize * 10);

    }

}
