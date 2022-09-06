package cap17;

public class Exemplo5 {

    public static void main(String[] args) throws InterruptedException {

        ExemploSynchronized exemploSynchronized =
                new ExemploSynchronized();
        exemploSynchronized.start();

        synchronized (exemploSynchronized){
            System.out.println("Aguardando a execu��o");
            exemploSynchronized.wait(50000);

        }

        System.out.println(
                "Valor total �: " +
                        exemploSynchronized.getTotal());
    }
}
