package lista7;

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int linha, coluna, resto, numero;
        String msg = "";
        msg = "Os números divisíveis por 3 são: \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                do {
                    numero = (int) (Math.random() * 301);
                    if (numero > 100) {
                        matriz[ linha][ coluna] = numero;
                    }
                } while (numero < 100);
            }
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                resto = (matriz[ linha][ coluna] % 3);
                if (resto == 0) {
                    msg = msg + matriz[ linha][ coluna] + " - ";
                }
            }
        }
        msg = msg + "\n";
        msg = msg + "Matriz Gerada \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
