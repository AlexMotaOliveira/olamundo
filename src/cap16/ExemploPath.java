package cap16;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Eclipse\\java\\olamundo\\");
        if (!file.exists()) {
            file.createNewFile();
        }

        if (file.isDirectory()) {
            System.out.println("não é um diretorio");
        }





        file.getPath();
        file.getAbsoluteFile();

        file.isDirectory();
        file.exists();


        Path path = Paths.get("novalistadefilmes2");
        System.out.println(path.getFileSystem());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getFileName());

    }
}
