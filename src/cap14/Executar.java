package cap14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Executar {

    public static void main(String[] args) {

        OperacaoAritimetica soma = new Somar();
        System.out.println("soma :" + soma.executar(10, 30));

        OperacaoAritimetica divisao = new Dividir();
        System.out.println("divisão :" + divisao.executar(10.0, 30.0));

        OperacaoAritimetica multiplicacao = new Multiplicar();
        System.out.println("multiplicar: " + multiplicacao.executar(10, 30));

        OperacaoAritimetica subtracao = new Subtrair();
        System.out.println("subtração: " + subtracao.executar(10, 30));

        OperacaoAritimetica funcionalSoma =
                (parametro1, parametro2) -> parametro1 + parametro2;

        OperacaoAritimetica funcionalSomaReferencia = Double::sum;

        System.out.println(funcionalSomaReferencia.executar(10.0, 30));

        ExibirDados interfaceExibir = s -> System.out.println(s);
        ExibirDados interfaceExibirReferencia = System.out::println;


        double resultado = funcionalSoma.executar(3, 3);
        interfaceExibir.exibir(resultado);

        List<String> lista = new ArrayList<>();

        lista.stream().filter(s -> s.equals("algumacoisa"));


        ExibirDados interfaceExibir1 = s -> {
            if (s > 10) {
                System.out.println(s);
            } else {
                System.out.println("valor menor que 10");
            }
        };

        interfaceExibir1.exibir(resultado);

        Produto produto = new Produto("Sabonete", 2);
        OperacaoAritimetica calculaNovoValor = produto::aumentarPreco;

        OperacaoAritimetica calculaNovoValor1 = Produto::aumentarPreco1;

        double valor1 = calculaNovoValor.executar(30.3, 20);
        double valor2 = calculaNovoValor1.executar1(10, 10);

        // classe Funcitonal Java 8
        Consumer<Double> exibirValor = System.out::println;
        exibirValor.accept(valor1);
        exibirValor.accept(valor2);

        BiFunction<Double, Double, Double> somar = Double::sum;
        System.out.println(somar.apply(100.0, 30.3));
        BiFunction<Double, Double, String> somar2 = (x,z) -> String.valueOf(x + z);
        System.out.println(somar2.apply(60.0, 10.0));


    }

}
