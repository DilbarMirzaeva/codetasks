package humanBase.controller;

import humanBase.Human;
import humanBase.service.HumanService;

import java.util.List;

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

    public void removeHumanByID(int id) {
        humanService.removeHuman(id);
    }

    public void updateHuman(int id, String fieldName, Object newValue) {
        humanService.updateHuman(id, fieldName, newValue);
    }

    public List<Human> getListHuman() {
        return humanService.getListHuman();
    }
}
