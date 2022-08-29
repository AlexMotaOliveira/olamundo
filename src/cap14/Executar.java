package cap14;

import java.util.ArrayList;
import java.util.List;

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
                (parametro1 , parametro2) ->  parametro1 + parametro2;

        ExibirDados interfaceExibir = s -> System.out.println(s);


        double resultado = funcionalSoma.executar(3, 3);
        interfaceExibir.exibir(resultado);

        List<String> lista = new ArrayList<>();

        lista.stream().filter(s -> s.equals("algumacoisa"));


        ExibirDados interfaceExibir1 = s -> {
            if (s > 10 ) {
                System.out.println(s);
            }else {
                System.out.println("valor menor que 10");
            }
        };

        interfaceExibir1.exibir(resultado);

    }
}
