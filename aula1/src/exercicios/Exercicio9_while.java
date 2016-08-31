package exercicios;

import javax.swing.*;

public class Exercicio9_while {

    public static void main(String args[]) {
        int idade;
        String dado;
        dado = JOptionPane.showInputDialog("Digite uma idade maior que 18 anos:");
        idade = Integer.parseInt(dado);
        while (idade < 18) {
            JOptionPane.showMessageDialog(null, "idade inválida, digite novamente!");
            dado = JOptionPane.showInputDialog("Digite a idade:");
            idade = Integer.parseInt(dado);
        }
        JOptionPane.showMessageDialog(null, "Idade Válida! Finalizando.");
    }
}
