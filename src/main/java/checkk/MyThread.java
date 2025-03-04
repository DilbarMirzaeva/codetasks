package checkk;

public class MyThread implements Runnable{
    private int threadNum;

    MyThread(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+"   from "+threadNum);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(int threadNum) {
        this.threadNum = threadNum;
    }
}


