package reflectionAPI;


import fileIO.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MethodsReflectionApi {
    public MethodsReflectionApi() {
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Student student1 = new Student("Dilbar", "Mirzayeva", 18);
        Student student2 = new Student("Aida", "Guliyeva", 20);
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------------");

        Class<?> class1 = Student.class;
        Field[] fields = class1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " :" + field.getType());
        }

        System.out.println("-------------------------");

        Field field = class1.getDeclaredField("age");
        field.setAccessible(true);
        field.set(student1, 19);
        System.out.println(student1.getName() + " age changed: " + student1.getAge());

        System.out.println("-------------------------");

        Method method = class1.getDeclaredMethod("print");
        method.invoke(student2);

        System.out.println("-------------------------");

        Constructor<?>[] constructors = class1.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + ":");
            Class<?>[] typesParam = constructor.getParameterTypes();
            for (Class<?> paramType : typesParam) {
                System.out.println("-" + paramType.getName());
            }
        }

        System.out.println("-------------------------");

        Constructor<?> constructor = class1.getConstructor(String.class, String.class, int.class);
        Object newInstance = constructor.newInstance("Nigar", "dcfvgbh", 22);
        System.out.println(newInstance);

        System.out.println("-------------------------");

        MethodsReflectionApi obj1 = new MethodsReflectionApi();
        Method method1 = MethodsReflectionApi.class.getDeclaredMethod("checkParametr", String.class);
        method1.invoke(obj1, "Murad");

        System.out.println("-------------------------");

        Class<?> aClass = Class.forName("fileIO.Student");
        Constructor<?> constructor2 = aClass.getConstructor(String.class, int.class);
        Object object = constructor2.newInstance("Muhammed", 25);
        System.out.println(object);
    }

    public void checkParametr(String name) {
        System.out.println("Hi," + name);
    }


}
