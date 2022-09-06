package cap17;

public class Exemplo4 {

    public static void main(String[] args) throws InterruptedException {

        ExemploSynchronize exemploSynchronize = new ExemploSynchronize();
        Thread thread1 = new Thread(exemploSynchronize, "1:");
        Thread thread2 = new Thread(exemploSynchronize, "2:");

        thread1.start();
        thread2.start();
    }
}
