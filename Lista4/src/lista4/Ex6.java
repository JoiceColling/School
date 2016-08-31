package lista4;

import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String args[]) {
        int numero[] = new int[10];
        int cont, div3, div5;
        String msg = "";
        for (cont = 0; cont <= 9; cont++) {
            numero[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da posição " + cont + " :"));
        }
        for (cont = 0; cont <= 9; cont++) {
            div3 = (numero[cont] % 3);
            div5 = (numero[cont] % 5);
            if ((div3 == 0) && (div5 == 0)) {
                msg = msg + numero[cont] + " é divisível por 3 e por 5 \n";
            } else {
                msg = msg + numero[ cont] + " não é divisível por 3 nem por 5 \n";
            }

            div3 = 0;
            div5 = 0;
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}