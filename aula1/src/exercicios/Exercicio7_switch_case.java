package exercicios;

import javax.swing.JOptionPane;

public class Exercicio7_switch_case {

  
public static void main(String args[]) {
        int diaDaSemana;
        String dado;
        dado = JOptionPane.showInputDialog("Digite o dia:");
        diaDaSemana = Integer.parseInt(dado);
        switch (diaDaSemana) {
            case 1: {
                JOptionPane.showMessageDialog(null, "Domingo");
            }
            break;
            case 2: {
                JOptionPane.showMessageDialog(null, "Segunda-feira");
            }
            break;
            case 3: {
                JOptionPane.showMessageDialog(null, "Terça-feira");
            }
            break;
            case 4: {
                JOptionPane.showMessageDialog(null, "Quarta-feira");
            }
            break;
            case 5: {
                JOptionPane.showMessageDialog(null, "Quinta-feira");
            }
            break;
            case 6: {
                JOptionPane.showMessageDialog(null, "Sexta-feira");
            }
            break;
            case 7: {
                JOptionPane.showMessageDialog(null, "Sábado");
            }
            break;
            default: {
                JOptionPane.showMessageDialog(null, "Este não é um dia válido!");
            }
        }
    }
}
