package cap14;

import java.util.ArrayList;
import java.util.List;

public class MaioresSalarios {


    public static void main(String[] args) {

        List<Double> salariosBrutos = new ArrayList<>();
                salariosBrutos.add(1_350.00);
                salariosBrutos.add(4_320.15);
                salariosBrutos.add(2_500.55);
                salariosBrutos.add(850.26);
                salariosBrutos.add(3_614.29);
                salariosBrutos.add(12_500.00);

        List<Double> salariosTop =
                DoubleArrayUtils
                        .filtraValores(salariosBrutos, s -> s <= 3000);


        DoubleArrayUtils.processaValores(salariosTop, System.out::println);
    }
}
