package lista4;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String args[]) {
        int numero[] = new int[10];
        int cont, maior = 0;
        for (cont = 0; cont <= 9; cont++) {
            numero[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número na posição " + cont + ":"));
            if (numero[cont] > maior) {
                maior = numero[ cont];
            }
        }
        JOptionPane.showMessageDialog(null, "O maior número foi: " + maior);
    }
}