package lista7;

import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int matriz2[][] = new int[5][5];
        int linha, coluna, numero, contador, divisores, resto;
        String msg = "";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = (int) ((Math.random() * 101) + 1);
            }
        }
        msg = "Matriz Gerada \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                numero = matriz[ linha][ coluna];
                matriz2[ coluna][ linha] = numero;
            }
        }
        msg = msg + "Matriz Resultante \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz2[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
