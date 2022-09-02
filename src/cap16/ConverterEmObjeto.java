package cap16;

import java.io.*;
import java.util.Random;

public class ConverterEmObjeto {

    public static void main(String[] args) {

        File file = new File("ListaDeFilmes.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bW = new BufferedWriter(fileWriter);
            Random random = new Random();
            int count = 0;

            bW.write("Nome do Filme;Diretor;Genero;Nota");
            bW.newLine();
            while (++count < 10) {
                bW.write(
                        "Terror Java" +
                        count +
                        ";Alex Mota;Terror;" +
                        random.nextInt(11));
                bW.newLine();
            }
            bW.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bR = new BufferedReader(fileReader);

            String linha;
            while ((linha = bR.readLine()) != null) {

            }
            bR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
