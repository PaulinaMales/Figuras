import javax.swing.*;

import static javax.swing.text.StyleConstants.setBackground;
import java.awt.Color;

public class principal {
    public static void main(String[] args) {
        //String entrada= JOptionPane.showInputDialog("Escriba 1 para dibujar nuestros nombres");
        int opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "(1) CARITA FELIZ :)\n"
                        +"(2) CARITA TRISTE :(\n"
                        +"(3) CARITA SONRIENTE :D\n"
                        +"(4) CARITA GUIÑANDO ;)\n"
                        +"(5) CARITA SORPRENDIDA :o\n"
                        +"(6) CARITA SERIA :|\n"
                        +"(7) CARITA MÁS SERIA -_-\n"
                        +"(8) CARITA SIN BOCA\n"
                        +"(9) ESTRELLITA\n"
                        +"(10) DIAMANTE\n"
                        +"(11) CORAZON\n"
                        +"(12) CASITA"
                                +"(5) SALIR\n","MENU DE EMOJIS",JOptionPane.QUESTION_MESSAGE));

        Figuras panel= new Figuras(opcion);
        JFrame aplicacion =new JFrame("EMOJIS");

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(300, 300); //TAMAÑO

        aplicacion.setVisible(true);



    }
}
