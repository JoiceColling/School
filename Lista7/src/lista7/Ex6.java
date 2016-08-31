package lista7;

import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int linha, coluna, contador, linha1, coluna1, numero;
        String msg = "";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                do {
                    numero = (int) (Math.random() * 501);
                    contador = 0;
                    for (linha1 = 0; linha1 <= 4; linha1++) {
                        for (coluna1 = 0; coluna1 <= 4; coluna1++) {
                            if (matriz[ linha1][ coluna1] == numero) {
                                contador = (contador + 1);
                            }
                        }
                    }
                } while (contador > 0);
                matriz[ linha][ coluna] = numero;
            }
        }
        msg = "Matriz Gerada \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
