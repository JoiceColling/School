package lista6;

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int linha, coluna, numero, somalinha4 = 0, somacoluna2 = 0, somatotal = 0, somadiagonalverde = 0, somadiagonalamarela = 0;
        String msg = "";
        numero = 1;
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = numero;
                numero = (numero + 1);
            }
        }
        msg = "Matriz Original: \n";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                somatotal = (somatotal + matriz[ linha][ coluna]);
                if (linha == 4) {
                    somalinha4 = (somalinha4 + matriz[ linha][ coluna]);
                }
                if (coluna == 2) {
                    somacoluna2 = (somacoluna2 + matriz[ linha][ coluna]);
                }
                if (linha == coluna) {
                    somadiagonalverde = (somadiagonalverde + matriz[ linha][ coluna]);
                }
            }
        }
        coluna = 4;
        for (linha = 0; linha <= 4; linha++) {
            somadiagonalamarela = (somadiagonalamarela + matriz[ linha][ coluna]);
            coluna = (coluna - 1);
        }
        msg = (msg + "A soma da linha 4 é: " + somalinha4 + "\n" + "A soma da coluna 2 é: " + somacoluna2 + "\n" + "A soma da diagonal principal é : " + somadiagonalverde + "\n" + "A soma da diagonal secundária é : " + somadiagonalamarela + "\n" + "A soma de todos os elementos é: " + somatotal);
        JOptionPane.showMessageDialog(null, msg);
    }
}
