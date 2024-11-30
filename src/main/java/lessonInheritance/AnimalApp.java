package lessonInheritance;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal=new Animal("Monkey",10);
        System.out.println(animal);

        Cat cat = new Cat("myu",5,"male");
        System.out.println(cat);

        Dog dog = new Dog("dg",5,"blue");
        System.out.println(dog);



    }
}
