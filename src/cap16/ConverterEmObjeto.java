package cap16;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

import java.io.*;
import java.util.Random;

public class ConverterEmObjeto {

    public static void main(String[] args) {

        File file = new File("NovaListaDeFilmes.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bW = new BufferedWriter(fileWriter);
            Random random = new Random();
            int count = 0;

            bW.write("titulo;diretor;nota;duracao;ano;genero;numerodevotos;url");
            bW.newLine();
            while (++count < 100) {
                bW.write(
                        "Terror Java" + count +
                                ";Alex Mota;" +
                                random.nextInt(11) + ";" +
                                random.nextInt(180) + ";" +
                                2022 + ";" +
                                "Terror;" +
                                random.nextInt(1001)+ ";" +
                                "www.impacta.com.br/" + count );

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
                filme.setNota(Double.parseDouble(array[2]));
                filme.setDuracao(Integer.parseInt(array[3]));
                filme.setAno(Integer.parseInt(array[4]));
                filme.setGenero(array[5]);
                filme.setNumeroDeVotos(Integer.parseInt(array[6]));
                filme.setUrl(array[7]);
                System.out.println(filme);
                System.out.println();
            }
            bR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
