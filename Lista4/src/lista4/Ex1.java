package lista4;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        int numero, div3, div5;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite um numero:");
        numero = Integer.parseInt(dado);
        div3 = (numero % 3);
        div5 = (numero % 5);
        if ((div3 == 0) && (div5 == 0)) {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 3 e por 5 \n");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 3 nem por 5 \n");
        }
    }
}
