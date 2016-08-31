package lista6;

import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int linha, coluna, numero, resto;
        String msg = "";
        for (linha = 0; linha <= 3; linha = linha + 2) {
            for (coluna = 0; coluna <= 3; coluna++) {
                numero = (int) (Math.random() * 101);
                resto = (numero % 2);
                if (resto == 0) {
                    matriz[ linha][ coluna] = numero;
                } else {
                    matriz[ linha][ coluna] = (numero + 1);
                }
            }
        }
        for (linha = 1; linha <= 3; linha = linha + 2) {
            for (coluna = 0; coluna <= 3; coluna++) {
                numero = (int) (Math.random() * 101);
                resto = (numero % 2);
                if (resto == 1) {
                    matriz[ linha][ coluna] = numero;
                } else {
                    matriz[ linha][ coluna] = (numero + 1);
                }
            }
        }
        msg = "Matriz gerada: \n";
        for (linha = 0; linha <= 3; linha++) {
            for (coluna = 0; coluna <= 3; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
