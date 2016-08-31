package lista5;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String args[]) {
        final int TAMANHO = 10;
        final int LIMITE = 51;
        int vetor[] = new int[TAMANHO];
        int i, j, numerosortiado, numrepetidos;
        String msg = "";
        for (i = 0; i <= TAMANHO - 1; i++) {
            if (i == 0) {
                vetor[i] = (int) (Math.random() * LIMITE);
            } else {
                do {
                    numrepetidos = 0;
                    numerosortiado = (int) (Math.random() * LIMITE);
                    for (j = 0; j <= i; j++) {
                        if (vetor[j] == numerosortiado) {
                            numrepetidos = (numrepetidos + 1);
                        }
                    }
                } while (numrepetidos != 0);
                vetor[i] = numerosortiado;

            }
        }
        for (i = 0; i <= TAMANHO - 1; i++) {
            msg = msg + vetor[i] + "-";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
