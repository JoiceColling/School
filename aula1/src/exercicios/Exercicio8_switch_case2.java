package exercicios;

import javax.swing.*;

public class Exercicio8_switch_case2 {

    public static void main(String args[]) {
        int idade;
        String dado;
        dado = JOptionPane.showInputDialog("Digite a idade para indicação das vacinas aplicadas");
        idade = Integer.parseInt(dado);
        switch (idade) {
            case 1:
            case 2:
            case 3: {
                JOptionPane.showMessageDialog(null, "Varíola");
                break;
            }
            case 4:
            case 5:
            case 6: {
                JOptionPane.showMessageDialog(null, "Gripe A");
                break;
            }
            case 7:
            case 8:
            case 9:
            case 10: {
                JOptionPane.showMessageDialog(null, "Rubéola");
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Idade maior que dez anos");
            }
        }
    }
}

