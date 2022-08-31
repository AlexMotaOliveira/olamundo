package cap14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DescontoSalarial {

    public static void main(String[] args) {

        List<Double> salariosBrutos = List.of(
                1_350.00, 4_320.15, 8_235.25, 2_500.55,
                1_830.00, 850.26, 3_614.29, 12_500.00);

        List<Double> salariosLiquidos =
                DoubleArrayUtils
                        .transformaValores(salariosBrutos, s -> s * 0.90 );

        DoubleArrayUtils
                .processaValores(salariosLiquidos, System.out::println);
    }
}
