package cap17;

public class ExemploSynchronize implements Runnable{

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " iniciou");
        for(int i=0; i < 10; i++) {
            try {
                Thread.sleep(600);
                System.out.println(Thread.currentThread().getName() + " rodando");
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "finalizou");
    }
}
