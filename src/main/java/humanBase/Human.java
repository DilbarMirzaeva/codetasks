package humanBase;

import java.util.Objects;

public class Human {
    private final Long ID;
    private  String name;
    private Integer age;

    public Human(Long ID, String name, Integer age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(ID, human.ID) && Objects.equals(name, human.name) && Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
