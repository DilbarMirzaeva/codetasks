package humanBase;

import humanBase.controller.HumanController;
import humanBase.dao.HumanDao;
import humanBase.service.HumanService;

public class HumanApp {
    public static void main(String[] args) {
        HumanController humanController = new HumanController(new HumanService(new HumanDao()));
        Human human1 = new Human(1L, "Dilbar", 18);
        Human human2 = new Human(2L, "Nigar", 19);
        Human human3 = new Human(3L, "Aynur", 20);
        Human human4 = new Human(4L, "Ali", 22);
        Human human5 = new Human(5L, "Mike", 28);

        humanController.addHuman(human1);
        humanController.addHuman(human2);
        humanController.addHuman(human3);
        humanController.addHuman(human4);
        humanController.addHuman(human5);
        humanController.getListHuman().forEach(System.out::println);

        System.out.println("For id");
        System.out.println(humanController.getHumanById(1));

        System.out.println("Remove ");
        humanController.removeHumanByID(3);
        humanController.getListHuman().forEach(System.out::println);
        System.out.println("---------------------");

        System.out.println("Update");
        humanController.updateHuman(2, "age", 20);
        humanController.updateHuman(4, "name", "Ibrahim");
        humanController.getListHuman().forEach(System.out::println);
        System.out.println("---------------------");


        humanController.getListHuman().forEach(System.out::println);

    }   
}
