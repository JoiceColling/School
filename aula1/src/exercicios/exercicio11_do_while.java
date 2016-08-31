package exercicios;

import javax.swing.*;

public class exercicio11_do_while {

    public static void main(String args[]) {
        int idade;
        String dado;
        do {
            dado = JOptionPane.showInputDialog("Digite a idade:");
            idade = Integer.parseInt(dado);
            if (idade < 18) {
                JOptionPane.showMessageDialog(null, "Digite a idade maior que 18 anos!");
            }
        } while (idade < 18);
        JOptionPane.showMessageDialog(null, "Idade Válida! Finalizando.");
    }
}
