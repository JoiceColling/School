package lista7;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int linha, coluna, contn, l, c, numero, contgeral = 0;
        String msg = "";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = (int) (Math.random() * 101);
            }
        }
        msg = msg + "Matriz gerada: \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                numero = matriz[ linha][ coluna];
                contn = 0;
                for (l = 0; l <= 4; l++) {
                    for (c = 0; c <= 4; c++) {
                        if (matriz[ l][ c] != -1) {
                            if (numero == matriz[ l][ c]) {
                                matriz[ l][ c] = -1;
                                contn = (contn + 1);
                            }
                        }
                    }
                }
                if (contn > 1) {
                    msg = msg + "O numero " + numero + " foi localizado " + contn + " vezes \n";
                    contgeral = (contgeral + 1);
                }
            }
        }
        if (contgeral == 0) {
            msg = msg + "Nao foram encontrados numeros repetidos \n";
        } else {
            msg = msg + "Foram encontrados " + contgeral + " numeros repetidos \n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
