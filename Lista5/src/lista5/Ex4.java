package lista5;

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String args[]) {
        final int TAMANHO = 10;
        final int LIMITE = 51;
        int vetor[] = new int[TAMANHO];
        int cont, numero, resto, maior, menor;
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
        maior = vetor[ 0];
        menor = vetor[ 0];
        for (cont = 0; cont <= TAMANHO - 1; cont++) {
            msg = msg + vetor[ cont] + "-";
            if (vetor[ cont] > maior) {
                maior = vetor[ cont];
            }
            if (vetor[ cont] < menor) {
                menor = vetor[ cont];
            }
        }
        JOptionPane.showMessageDialog(null,msg + "\nO maior número digitado é: " + maior + "\n" + "O menor número digitado é: " + menor);
    }
}
