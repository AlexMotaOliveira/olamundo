package cap16;

import java.io.*;

public class OutroExemplo {

    public static void main(String[] args) {


        File file = new File("OutroArquivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bW = new BufferedWriter(fileWriter);

            bW.write("Vou inserir esse texto");
            bW.newLine();
            bW.write("segunda linha escrita");

            bW.flush();
            bW.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bR = new BufferedReader(fileReader);

            String linha;
            while ((linha = bR.readLine()) != null) {
                System.out.println(linha);
            }
            bR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
