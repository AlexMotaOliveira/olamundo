package cap17;

public class ExemploThread extends Thread{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("executando a thead");
        }
    }

    public void run(String s) {
        System.out.println("executando a thead: " + s);
    }

}
