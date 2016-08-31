package exercicios;

import javax.swing.*;

public class exercicio10_while2 {

    public static void main(String args[]) {
        char sexo;
        String dado;
        dado = JOptionPane.showInputDialog("Digite o sexo:");
        sexo = dado.charAt(0);
        while (sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F') {
            JOptionPane.showMessageDialog(null, "Sexo inválido, digite novamente!");
            dado = JOptionPane.showInputDialog("Digite o sexo");
            sexo = dado.charAt(0);
        }
        JOptionPane.showMessageDialog(null, "Sexo Válido! Finalizando.");
    }
}

