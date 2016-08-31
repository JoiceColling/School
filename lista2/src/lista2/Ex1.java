package lista2;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String args[]) {

        int n1, n2, p;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite um número");
        n1 = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog(null, "Digite outro número");
        n2 = Integer.parseInt(dado);
        if (n1 > n2) {
            p = (n1 % 2);
            if (p == 0) {
                JOptionPane.showMessageDialog(null, "O primeiro número digitado é o maior e é par");
            } else {
                JOptionPane.showMessageDialog(null, "O primeiro número digitado é o maior e é impar");
            }
        } else {
            p = (n2 % 2);
            if (p == 0) {
                JOptionPane.showMessageDialog(null, "O segundo número digitado é o maior e é par");
            } else {
                JOptionPane.showMessageDialog(null, "O segundo número digitado é o maior e é impar");
            }
        }
    }
}
