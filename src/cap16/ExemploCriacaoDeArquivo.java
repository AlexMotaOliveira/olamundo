package cap16;

import java.io.*;

public class ExemploCriacaoDeArquivo {

    public static void main(String[] args) {

        try {
            FileOutputStream arquivo =
                    new FileOutputStream("Arquivo.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(arquivo);
            dataOutputStream.writeChars("Olá Mundo");

            FileInputStream fileInputStream =
                    new FileInputStream("Arquivo.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            while (true) {
                char caracter = dataInputStream.readChar();
                System.out.println(caracter);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
