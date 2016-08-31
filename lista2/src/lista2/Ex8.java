package lista2;

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String args[]) {
        int idade;
        String dado;
        do {
            dado = JOptionPane.showInputDialog(null, "Digite a idade:");
            idade = Integer.parseInt(dado);
            if (idade < 0) {
                JOptionPane.showMessageDialog(null, "idade não permitida");
            }
            if ((idade >= 1) && (idade <= 4)) {
                JOptionPane.showMessageDialog(null, "Idade Insuficiente");
            }
            if ((idade >= 5) && (idade <= 7)) {
                JOptionPane.showMessageDialog(null, "Categoria Infantil A");
            }
            if ((idade >= 8) && (idade <= 10)) {
                JOptionPane.showMessageDialog(null, "Categoria Infantil B");
            }
            if ((idade >= 11) && (idade <= 13)) {
                JOptionPane.showMessageDialog(null, "Categoria Juvenil A");
            }
            if ((idade >= 14) && (idade <= 17)) {
                JOptionPane.showMessageDialog(null, "Categoria Juvenil B");
            }
            if (idade >= 18) {
                JOptionPane.showMessageDialog(null, "Categoria Sênior");
            }
            if (idade == 0) {
                JOptionPane.showMessageDialog(null, "Finalizando");
            }
        } while (idade != 0);
    }
}
