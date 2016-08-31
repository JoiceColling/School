package lista6;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int linha, coluna, numero;
        String msg = "";
        for (linha = 0; linha <= 3; linha++) {
            for (coluna = 0; coluna <= 3; coluna++) {
                matriz[ linha][ coluna] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da linha " + linha + " , coluna " + coluna + " :"));
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
