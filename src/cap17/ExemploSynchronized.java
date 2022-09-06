package cap17;

public class ExemploSynchronized extends Thread {

    private int total;

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            total +=i;
        }
//        notify();
    }
    public int getTotal() {
        return total;
    }
}
