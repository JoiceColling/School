package lista7;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        int linha, coluna, contador, linha1, coluna1, numero, resto;
        String msg = "";
        for (linha = 0; linha <= 9; linha++) {
            for (coluna = 0; coluna <= 9; coluna++) {
                do {
                    numero = (int) (Math.random() * 1000);
                    contador = 0;
                    for (linha1 = 0; linha1 <= 9; linha1++) {
                        for (coluna1 = 0; coluna1 <= 9; coluna1++) {
                            if (matriz[ linha1][ coluna1] == numero) {
                                contador = (contador + 1);
                            }
                            resto = (numero % 2);
                            if (resto != 0) {
                                contador = (contador + 1);
                            }
                        }
                    }
                } while (contador > 0);
                matriz[ linha][ coluna] = numero;
            }
        }
        msg = msg + "Matriz Gerada \n";
        for (linha = 0; linha <= 9; linha++) {
            for (coluna = 0; coluna <= 9; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog (null, msg);
    }
}
