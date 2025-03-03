package checkk;

public class CheckThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread myThread=new MyThread(i);
            MyThread myThread2=new MyThread(i);

            myThread.start();
            myThread2.start();
        }

    }
}
