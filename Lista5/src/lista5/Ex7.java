package lista5;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String args[]) {
        final int TAMANHO = 10;
        final int LIMITE = 51;
        int vetor[] = new int[TAMANHO], vetorp[] = new int[TAMANHO], vetori[] = new int[TAMANHO];
        int cont, num, resto, pospar = 0, posimpar = 0;
        String msg = "";
        for (cont = 0; cont < TAMANHO; cont++) {
            vetor[cont] = (int) (Math.random() * LIMITE);
        }
        msg = msg + "Todos os números: \n";
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            msg = msg + vetor[cont] + "-";
        }
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            num = vetor[cont];
            resto = (num % 2);
            if (resto == 0) {
                vetorp[pospar] = vetor[cont];
                pospar = (pospar + 1);
            } else {
                vetori[posimpar] = vetor[cont];
                posimpar = (posimpar + 1);
            }
        }
        msg = msg + "\nNúmeros pares gerados: \n";
        for (cont = 0; cont <= pospar - 1; cont++) {
            msg = msg + vetorp[cont] + "-";
        }
        msg = msg + "\nNúmeros ímpares gerados: \n";
        for (cont = 0; cont <= posimpar - 1; cont++) {
            msg = msg + vetori[cont] + "-";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
