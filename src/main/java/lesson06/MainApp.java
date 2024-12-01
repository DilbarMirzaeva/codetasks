package lesson06;

public class MainApp {
    public static void main(String[] args) {
        Employee[] obj=new Employee[2];
        obj[0]=new Developer("Dilbar",5000.0,"java");
        obj[1]=new Manager("Aydan",2000.0,8);

        for(Employee emp:obj) {
            if (emp.getName() != null) {
                emp.displayInfo();
                System.out.println("bonus:" + emp.calculateBonus(20));
                System.out.println("bonus+fixedAmount:" + emp.calculateBonus(20, 500));
            }
            System.out.println();
        }


    }
}
