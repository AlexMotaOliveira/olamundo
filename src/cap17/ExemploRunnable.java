package cap17;

public class ExemploRunnable implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("implemenatando Runnable");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
