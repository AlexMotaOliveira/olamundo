package cap17;

public class Exemplo1 {

    public static void main(String[] args) {

        Thread thread1 = new ExemploThread();
        thread1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Execução do metodo main");
        }
    }
}
