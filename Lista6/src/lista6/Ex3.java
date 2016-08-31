package lista6;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int linha, coluna, numeros;
        String msg = "";
        numeros = 10;
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = numeros;
                numeros = (numeros + 1);
            }
        }
        msg = "Matriz gerada: \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog (null, msg);
    }
}
