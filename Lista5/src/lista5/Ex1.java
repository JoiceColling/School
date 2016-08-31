package lista5;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        final int TAMANHO = 10;
        int vetor[] = new int[TAMANHO];
        int cont;
        String msg = "";
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            vetor[ cont] = (int) (Math.random() * 51);
        }
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            msg = msg + vetor[cont] + "-";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}