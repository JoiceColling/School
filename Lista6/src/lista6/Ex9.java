package lista6;

import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int linha, coluna, resto, divisores, numero, contador;
        String msg = "";
        for (linha = 0; linha <= 2; linha++) {
            for (coluna = 0; coluna <= 2; coluna++) {
                do {
                    numero = (int) (Math.random() * 20);
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
        msg = "Matriz gerada: \n";
        for (linha = 0; linha <= 2; linha++) {
            for (coluna = 0; coluna <= 2; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
