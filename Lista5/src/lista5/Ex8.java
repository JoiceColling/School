package lista5;

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String args[]) {
        final int TAMANHO = 5;
        final int LIMITE = 101;
        int vetor[] = new int[TAMANHO];
        int cont, numero;
        String msg = "";
        float resto;
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            do {
                numero = (int) (Math.random() * LIMITE);
                resto = (numero % 3);
                if (resto == 0) {
                    vetor[cont] = numero;
                }
            } while (resto != 0);
        }
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            msg = msg + vetor[cont] + "-";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
