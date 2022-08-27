package cap18;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainApp {

    public static void main(String[] args) {

        JFrame tela = new JFrame("Hello Jar!");
        tela.setSize(new Dimension(400,200));
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

    }

}
