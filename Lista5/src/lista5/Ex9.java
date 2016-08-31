package lista5;

import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String args[]) {
        final int TAMANHO = 5;
        final int LIMITE = 20;
        int vetor[] = new int[TAMANHO];
        int cont, numero, contador, resto, cont2;
        String msg = "";
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            do {
                vetor[cont] = (int) ((Math.random() * LIMITE)) + 4;
                contador = 0;
                for (cont2 = 1; cont2 <= vetor[cont]; cont2++) {
                    resto = (vetor[cont] % cont2);
                    if (resto == 0) {
                        contador = (contador + 1);
                    }
                }
            } while (contador > 2);
        }
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            msg = msg + vetor[cont] + "-";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
