package cap17;

public class Exemplo3 {

    public static void main(String[] args) {
        Thread thread =
                new Thread(() -> System.out.println(
                        "Thread interface funcional"));

        thread.start();

        outraExecucao();



        ExemploRunnable runnable = new ExemploRunnable();
        Thread teste = new Thread(runnable);
        teste.start();
        teste.setPriority(10);
    }

    public synchronized static void outraExecucao() {
        Thread thread =
                new Thread(() -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("outra thread");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
        thread.start();
        Thread.yield();
    }
}
