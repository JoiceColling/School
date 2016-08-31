package lista3;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String args[]) {
        int n, cont, div, cond = 0;
        String dado;
        cont = 1;
        dado = JOptionPane.showInputDialog(null, "Digite um número");
        n = Integer.parseInt(dado);
        do {
            div = (n % cont);
            cont = (cont + 1);
            if (div == 0) {
                cond = (cond + 1);
            }
        } while (cont < n);
        if (cond == 2) {
            JOptionPane.showMessageDialog(null, "O número " + n + " é primo");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + n + " não é primo");
        }
    }
}
