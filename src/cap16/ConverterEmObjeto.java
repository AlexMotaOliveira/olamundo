package cap16;

import br.com.impacta.prateleiradigital.negocio.Filme;

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
            bR.readLine();
            while ((linha = bR.readLine()) != null) {
               String[] array = linha.split(";");
               Filme filme = new Filme();
               filme.setTitulo(array[0]);
               filme.setDiretor(array[1]);
               filme.setGenero(array[2]);
               filme.setNota(Double.parseDouble(array[3]));
                System.out.println(filme);
            }
            bR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
