package cap14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;

public class DoubleArrayUtils {

    public static List<Double> transformaValores(List<Double> valores,
                                                 DoubleUnaryOperator funcao) {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < valores.size(); i++) {
            double valor = funcao.applyAsDouble(valores.get(i));
            result.add(valor);
        }
        return result;
    }

    public static List<Double> filtraValores(List<Double> valores,
                                             DoublePredicate criterio) {

        List<Double> temp = new ArrayList<>();
            for (double val : valores) {
            if (criterio.test(val)) {
                temp.add(val);
            }
        }
        return temp;
    }

    public static void processaValores(List<Double> valores, DoubleConsumer processo) {
        for (double val : valores) {
            processo.accept(val);
        }
    }
}
