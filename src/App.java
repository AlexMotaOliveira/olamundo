import java.io.*;

class App {
    public static void main(String args[]) {

        File f = new File("ArquivoCriado.txt");

        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Terror;Alex;ola");

            //INSERE UMA NOVA LINHA
            bw.newLine();

            bw.write("Continua sendo inserido em uma nova linha");

            bw.newLine();

            bw.write("Continua sendo inserido em uma 3ª linha");

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //EFETUANDO A LEITURA
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s;

            //ENQUANTO EXISTE DADOS CONTINUA IMPRIMINDO
            while ((s = br.readLine()) != null) {

                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("###### Erro: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
