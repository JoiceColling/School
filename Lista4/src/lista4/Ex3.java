package lista4;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String args[]) {
        int numero[] = new int[10];
        int cont;
        String msg = "";
        for (cont = 0; cont <= 9; cont++) {
            numero[cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição " + cont + ":"));
        }
        for (cont = 9; cont >= 0; cont--) {
            msg = msg + "O número armazenado na posição " + cont + " é: " + numero[cont] + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}