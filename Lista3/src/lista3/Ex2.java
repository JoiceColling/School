package lista3;

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String args[]) {
        int tipo, metros, quant = 0;
        String dado;
        JOptionPane.showMessageDialog(null, "1- Tijolo de 6 furos" + "\n2- Tijolo de 4 furos" + "\n3- Tijolo maciço");
        dado = JOptionPane.showInputDialog(null, "Qual o tipo do tijolo?");
        tipo = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog(null, "Quantos metros quadrados você vai ter?");
        metros = Integer.parseInt(dado);
        switch (tipo) {
            case 1:
                quant = (15 * metros);
                break;
            case 2:
                quant = (25 * metros);
                break;
            case 3:
                quant = (30 * metros);
                break;
        }
        JOptionPane.showMessageDialog(null, "Você deverá utilizar " + quant + " tijolos no total");
    }
}
