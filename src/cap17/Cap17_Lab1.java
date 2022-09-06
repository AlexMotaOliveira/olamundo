package cap17;

public class Cap17_Lab1 {

    public static void main(String[] args) throws InterruptedException {

        ThreadLab threadLab1 = new ThreadLab("Thread 1");
        ThreadLab threadLab2 = new ThreadLab("Thread 2");
        Thread threadLab3 = new Thread(threadLab2, "Thread 3");

        // lab 2
        synchronized (threadLab1){
            threadLab1.start();
            threadLab1.wait();
        }

        threadLab2.start();
        threadLab3.start();
    }
}
