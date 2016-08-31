package lista5;

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String args[]) {
        final int TAMANHO = 10;
        final int LIMITE = 51;
        int vetor[] = new int[TAMANHO];
        int cont;
        String msg = "";
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            vetor[ cont] = (int) (Math.random() * LIMITE);
        }
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            msg = msg + vetor[ cont] + "-";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
