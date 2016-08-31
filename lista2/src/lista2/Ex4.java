package lista2;

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String args[]) {
        int coloc;
        String dado;
        do {
            dado = JOptionPane.showInputDialog("Digite o número de classificação");
            coloc = Integer.parseInt(dado);
            if ((coloc == 1) || (coloc == 2)) {
                JOptionPane.showMessageDialog(null, "Primeira Fila");
            }
            if ((coloc == 3) || (coloc == 4)) {
                JOptionPane.showInputDialog(null, "Segunda Fila");
            }
            if ((coloc == 5) || (coloc == 6)) {
                JOptionPane.showMessageDialog(null, "Terceira Fila");
            }
            if ((coloc == 7) || (coloc == 8)) {
                JOptionPane.showMessageDialog(null, "Quarta Fila");
            }
            if ((coloc == 9) || (coloc == 10)) {
                JOptionPane.showMessageDialog(null, "Quinta Fila");
            }
            if (coloc > 10) {
                JOptionPane.showMessageDialog(null, "Sexta fila em diante");
            }
        } while (coloc != 0);
        JOptionPane.showMessageDialog(null, "Fim");
    }
}