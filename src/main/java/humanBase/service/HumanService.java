package humanBase.service;

import humanBase.Human;
import humanBase.dao.HumanDao;

import java.util.List;

public class HumanService {
    HumanDao humanDao;

    public HumanService(HumanDao humanDao) {
        this.humanDao = humanDao;
    }

    public HumanDao getHumanDao() {
        return humanDao;
    }

    public void setHumanDao(HumanDao humanDao) {
        this.humanDao = humanDao;
    }

    public Human getHumanByID(int Id) {
        return humanDao.getHumanById(Id);
    }

    public void addHuman(Human human) {
        humanDao.addHuman(human);
    }

    public void removeHuman(int id) {
        humanDao.removeHuman(id);
    }

    public void updateHuman(int id, String fieldName, Object newValue) {
        humanDao.updateHuman(id, fieldName, newValue);
    }

    public List<Human> getListHuman() {
        return humanDao.getListHuman();
    }
}
