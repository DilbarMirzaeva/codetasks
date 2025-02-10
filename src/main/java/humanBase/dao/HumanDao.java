package humanBase.dao;

import humanBase.Human;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class HumanDao {
    private List<Human> listHuman = new ArrayList<>();

    public HumanDao() {
    }

    public Human getHumanById(int Id) {
        Human human = null;
        System.out.print("Human(ID=" + Id + ") =>>  ");
        for (Human h : listHuman) {
            if (h.getID() == Id) {
                human = h;
            }
        }
        return human;
    }

    public void addHuman(Human human) {
        listHuman.add(human);
    }

    public void removeHuman(int id) {
        System.out.println(getHumanById(id) + " was deleted.");
        listHuman.removeIf(x -> x.getID() == id);
    }

    public void updateHuman(int id, String fieldName, Object newValue) {
        for (Human human : listHuman) {
            if (human.getID() == id) {
                try {
                    Field field = Human.class.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(human, newValue);
                    System.out.println("Human(Id=" + id + ")'s " + fieldName + " was updated");

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public List<Human> getListHuman() {
        return listHuman;
    }
}
