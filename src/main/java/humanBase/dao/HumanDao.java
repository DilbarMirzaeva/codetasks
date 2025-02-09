package humanBase.dao;

import humanBase.Human;

import java.util.ArrayList;
import java.util.List;

public class HumanDao {
    private List<Human> listHuman=new ArrayList<>();

    public HumanDao() {
    }

    public Human getHumanById(int Id){
        System.out.print("Human(ID="+Id+") =>>  ");
        for (Human h:listHuman){
            if(h.getID()==Id){
                return h;
            }
        }return null;
    }
    public void addHuman(Human human){
        listHuman.add(human);
    }

    public void removeHuman(int id){
        listHuman.removeIf(x->x.getID()==id);
        System.out.println(getHumanById(id)+" was deleted.");

    }

    public void updateHumanAge(int id,int newAge){
        try {
            Human human=getHumanById(id);
            human.setAge(newAge);
            System.out.println("Human age updated");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
    public void updateHumanName(int id,String newName){
        try {
            Human human=getHumanById(id);
            human.setName(newName);
            System.out.println("Human name updated");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }



    @Override
    public String toString() {
        return     "" + listHuman ;
    }
}
