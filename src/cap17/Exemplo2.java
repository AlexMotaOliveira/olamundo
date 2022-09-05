package cap17;

public class Exemplo2 {

    public static void main(String[] args) throws InterruptedException {

        ExemploRunnable runnable = new ExemploRunnable();
        Thread teste = new Thread(runnable);
        teste.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("metodo main");
            Thread.sleep(100);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("outro metodo main");
            Thread.sleep(100);
        }
    }
}
