package checkk;

public class CheckThread {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MyThread myThread=new MyThread(i);
            Thread thread=new Thread(myThread);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
