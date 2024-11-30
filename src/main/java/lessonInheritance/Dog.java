package lessonInheritance;

public class Dog extends Animal{

    private String color;

    public Dog(String name,int age,String color){
        super(name,age);
        this.color= color;
    }

    public void setDogColor(){
        this.color=color;
    }
    public String getDogColor(){
        return color;
    }

    public String toString(){
        return "name:"+super.getName()+ " age:" +super.getAge()+" gender:"+color;
    }
}
