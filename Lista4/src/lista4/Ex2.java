package lista4;

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String args[]) {

        int numero, div, cont, divisores = 0;
        String dado, msg = "";
        dado = JOptionPane.showInputDialog(null, "Digite um numero: ");
        numero = Integer.parseInt(dado);
        cont = 1;
        msg = "Os divisores por " + numero + " são: ";
        do {
            div = (numero % cont);
            if (div == 0) {
                divisores = (divisores + 1);
                msg = msg + cont + " - ";
            }
            cont = (cont + 1);
        } while (cont <= numero);
        msg = msg + "\nE a quantidade total de divisores é: " + divisores;
        JOptionPane.showMessageDialog(null, msg);

    }
}
