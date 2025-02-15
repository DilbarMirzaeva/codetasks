package fileIO;

import java.io.*;

public class FileApp {
    public static void main(String[] args) {
        Student student1=new Student("Dilbar","Mirzaeva",18);
        Student student2=new Student("Aydan","Gulieva",19);
        Student student3=new Student("Nigar","Hasanova",20);

        Group group1=new Group("JBE_1210");
        Group group2=new Group("UI/UX");
        group1.setStudents(student1);
        group2.setStudents(student2);
        group2.setStudents(student3);

        Course turing=new Course("Turing Academy",6);
        turing.setGroup(group1);
        turing.setGroup(group2);

        String path= "C:\\Users\\HP\\IdeaProjects\\codetasks\\src\\main\\java\\taskFile\\Object.dat";
        boolean append=new File(path).exists();
        try(ObjectOutputStream obus= append ?  new MyObjectOutputStream(new FileOutputStream(path,true)) : new MyObjectOutputStream(new FileOutputStream(path))){
            obus.writeObject(turing);
            System.out.println("write");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream obis=new ObjectInputStream(new FileInputStream(path))){
            Course intCourse=(Course) obis.readObject();
            System.out.println(intCourse.getCourseName()+" "+intCourse.getCourseDuration());
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
