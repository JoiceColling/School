package lista4;

import javax.swing.JOptionPane;

public class Ex5 {

    public static void main(String args[]) {
        int vetor[] = new int[10];
        int cont, temp;
        String msg = "";
        for (cont = 0; cont <= 9; cont++) {
            vetor[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da posição " + cont + " :"));
        }
        for (cont = 0; cont <= 9; cont++) {
            temp = (vetor[ cont] * 2);
            msg = msg + "O valor armazenado na posição " + cont + " é " + vetor[cont] + " que multiplicado por 2 é: " + temp + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
