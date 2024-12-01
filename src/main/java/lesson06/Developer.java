package lesson06;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, double salary,String developerLanguage){
        super(name, salary);
        this.programmingLanguage =developerLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("teamSize:"+ programmingLanguage);
    }
    
    public double calculateBonus(double percentage,double fixedAmount) {
        return super.calculateBonus(percentage,fixedAmount)+(programmingLanguage.equalsIgnoreCase("java")? 100:30);

    }

}
