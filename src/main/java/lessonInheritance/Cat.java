package lessonInheritance;

public class Cat extends Animal {

    private String gender;

    public Cat(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public void setCatGender(String gender) {
        this.gender = gender;
    }

    public String getCatGender() {

        return gender;
    }

    public String toString() {

        return super.toString() + " gender:" + gender;
    }
}
