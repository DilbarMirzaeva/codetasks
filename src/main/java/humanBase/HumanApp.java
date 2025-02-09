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
        Human human4 = new Human(4L, "Ali", 25);
        Human human5 = new Human(5L, "Mike", 28);

        humanController.addHuman(human1);
        humanController.addHuman(human2);
        humanController.addHuman(human3);
        humanController.addHuman(human4);
        humanController.addHuman(human5);
        System.out.println(humanController);

        System.out.println(humanController.getHumanById(1));
        humanController.removeHumanByID(3);
        System.out.println(humanController);

        humanController.updateHumanAge(5,29);
        System.out.println(humanController.getHumanById(5));

        humanController.updateHumanName(2,"Aylin");
        System.out.println(humanController);

        humanController.updateHumanName(9,"shgsd");
    }
}
