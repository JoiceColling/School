package lista6;

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int linha, coluna, numero;
        String msg = "";
        for (linha = 0; linha <= 3; linha++) {
            for (coluna = 0; coluna <= 3; coluna++) {
                matriz[ linha][ coluna] = (int) (Math.random() * 100);
            }
        }
        msg = "Matriz gerada: \n";
        for (linha = 0; linha <= 3; linha++) {
            for (coluna = 0; coluna <= 3; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog (null, msg);
    }
}
