package exercicios;

import javax.swing.*;

public class exercicio12_do_while2 {

    public static void main(String args[]) {
        char sexo;
        String dado;
        do {
            dado = JOptionPane.showInputDialog("Digite o sexo");
            sexo = dado.charAt(0);
            if (sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F') {
                JOptionPane.showMessageDialog(null, "Sexo inválido, digite novamente!");
            }
        } while (sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F');
        JOptionPane.showMessageDialog(null, "Sexo Válido! Finalizando.");
    }
}
