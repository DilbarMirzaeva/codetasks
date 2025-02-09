package humanBase.controller;

import humanBase.Human;
import humanBase.service.HumanService;

public class HumanController {
    HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    public HumanService getHumanService() {
        return humanService;
    }

    public void setHumanService(HumanService humanService) {
        this.humanService = humanService;
    }

    public Human getHumanById(int Id) {
        return humanService.getHumanByID(Id);
    }

    public void addHuman(Human human) {
        humanService.addHuman(human);
    }

    public void removeHumanByID(int id){
        humanService.removeHuman(id);
    }

    public void updateHumanAge(int id,int age){
        humanService.updateHumanAge(id, age);
    }

    public void updateHumanName(int id,String name){
        humanService.updateHumanName(id, name);
    }



    @Override
    public String toString() {
        return "{" +
                "" + humanService +"}";
    }
}
