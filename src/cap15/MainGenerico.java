package cap15;

public class MainGenerico<T> {

    public static void main(String[] args) {

        ClasseGenerica classeGenerica = new ClasseGenerica<>();

        classeGenerica.setValor("Alex");
        System.out.println(classeGenerica.getValor());
        classeGenerica.setValor(10);
        System.out.println(classeGenerica.getValor());
        classeGenerica.setValor(new Funcionario());
        System.out.println(classeGenerica.getValor());
    }
}
