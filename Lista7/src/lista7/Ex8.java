package lista7;

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int linha, coluna, numero, contador, divisores, resto;
        String msg = "";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                if (linha > coluna) {
                    do {
                        numero = (int) ((Math.random() * 101) + 1);
                        resto = (numero % 2);
                        if (resto == 1) {
                            matriz[ linha][ coluna] = numero;
                        }
                    } while (resto != 1);
                }
            }
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                if (linha == coluna) {
                    do {
                        numero = (int) ((Math.random() * 101) + 1);
                        divisores = 0;
                        for (contador = 1; contador <= numero; contador++) {
                            if ((numero % contador) == 0) {
                                divisores = (divisores + 1);
                            }
                        }
                    } while (divisores > 2);
                    matriz[ linha][ coluna] = numero;
                }
            }
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                if (coluna > linha) {
                    do {
                        numero = (int) ((Math.random() * 101) + 1);
                        resto = (numero % 2);
                        if (resto == 0) {
                            matriz[ linha][ coluna] = numero;
                        }
                    } while (resto != 0);
                }
            }
        }
        msg = "Matriz Gerada \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}
