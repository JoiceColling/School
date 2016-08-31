package exercicios;

import javax.swing.*;

public class exercicio16_conversaoDireta {

    public static void main(String args[]) {

        int vet[] = new int[5];
        String msg = "Vetor gerado \n";
        for (int i = 0; i < 5; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da posi��o " + i));
        }
        for (int i = 0; i < 5; i++) {
            msg = msg + vet[i] + " - ";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
