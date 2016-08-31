package lista5;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String args[]) {
        final int TAMANHO = 10;
        final int LIMITE = 51;
        int vetor[] = new int[TAMANHO];
        int cont, numero, resto;
        String msg = "";
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            numero = (int) (Math.random() * LIMITE);
            resto = (numero % 2);
            if (resto == 0) {
                vetor[ cont] = numero;
            } else {
                vetor[ cont] = (numero + 1);
            }
        }
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            msg = msg + vetor[ cont] + "-";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
