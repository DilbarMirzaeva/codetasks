package humanBase.service;

import humanBase.Human;
import humanBase.dao.HumanDao;

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

    public Human getHumanByID(int Id){
        return humanDao.getHumanById(Id);
    }

    public void addHuman(Human human){
        humanDao.addHuman(human);
    }

    public void removeHuman(int id){
        humanDao.removeHuman(id);
    }

    public void updateHumanAge(int id,int age){
        humanDao.updateHumanAge(id,age);
    }

    public void updateHumanName(int id,String name){
        humanDao.updateHumanName(id, name);
    }

    @Override
    public String toString() {
        return
                "" + humanDao ;
    }
}
