package cap14;


public interface OperacaoAritimetica {

    public abstract double executar(double valor1, double valor2);

    default int executar1(int valor1, int valor2) {
        System.out.println("sobrecarga");
        return valor1 + valor2;
    }

    default void exibir(double valor) {
        System.out.println(valor);
    }

    default double filter(double valor) {
        return valor > 10 ? 0 : valor;
    }

}
