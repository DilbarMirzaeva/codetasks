package checkk;

public class CheckThread {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MyThread myThread=new MyThread(i);
            Thread thread=new Thread(myThread);
            thread.start();
            System.out.println(thread.isAlive());

            System.out.println("---------");
            System.out.println(Thread.activeCount());
            System.out.println(Thread.currentThread().getName());
            System.out.println("---------");

        }
    }
}
