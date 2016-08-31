package lista4;

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String args[]) {
        int vetor1[] = new int[10], vetor2[] = new int[10];
        int cont, cont2;
        String msg = "Vetor original: \n";
        String msg2 = "Vetor transformado: \n";
        for (cont = 0; cont <= 9; cont++) {
            vetor1[ cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da posição " + cont + " :"));
        }
        cont2 = 9;
        for (cont = 0; cont <= 9; cont++) {
            vetor2[ cont2] = vetor1[ cont];
            cont2 = (cont2 - 1);
        }

        for (cont = 0; cont <= 9; cont++) {
            msg = msg + "Número da posição " + cont + " :" + vetor1[ cont] + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
        for (cont = 0; cont <= 9; cont++) {
            msg2 = msg2 + "Número da posiçao " + cont + " :" + vetor2[ cont] + "\n";
        }
        JOptionPane.showMessageDialog(null, msg2);
    }
}
