package lista6;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int linha, coluna, numero;
        String msg = "";
        numero = 2;
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = numero;
                numero = (numero + 2);
            }
        }
        msg = "Matriz Original: \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = (matriz[ linha][ coluna] / 2);
            }
        }
        msg = msg + "Matriz resultante: \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
