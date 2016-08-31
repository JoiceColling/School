package lista7;

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int vetorlinha[] = new int[5];
        int vetorcoluna[] = new int[5];
        int linha, coluna, posivet1, posivet2;
        String msg = "";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = (int) (Math.random() * 20);
            }
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                vetorlinha[ linha] = (vetorlinha[ linha] + matriz[ linha][ coluna]);
            }
        }
        for (coluna = 0; coluna <= 4; coluna++) {
            for (linha = 0; linha <= 4; linha++) {
                vetorcoluna[ coluna] = (vetorcoluna[ coluna] + matriz[ linha][ coluna]);
            }
        }
        msg = msg + "Soma das Linhas: \n";
        for (posivet1 = 0; posivet1 <= 4; posivet1++) {
            msg = msg + vetorlinha[ posivet1] + " - ";
        }
        msg = msg + "\nSoma das Colunas: \n";
        for (posivet2 = 0; posivet2 <= 4; posivet2++) {
            msg = msg + vetorcoluna[ posivet2] + " - ";
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}
