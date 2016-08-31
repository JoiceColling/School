package lista2;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String args[]) {
        int operacao, n1, n2, resultado;
        String dado;
        do {
            dado = JOptionPane.showInputDialog(null, "Escolha a operação 1-Soma , 2-Subtração , 3-Multiplicação , 4-Divisão ou 0 para sair:");
            operacao = Integer.parseInt(dado);
            if (operacao == 0) {
                JOptionPane.showMessageDialog(null, "Finalizando");
            } else {
                dado = JOptionPane.showInputDialog(null, "Digite um número:");
                n1 = Integer.parseInt(dado);
                dado = JOptionPane.showInputDialog(null, "Digite outro número:");
                n2 = Integer.parseInt(dado);
                if (operacao == 1) {
                    resultado = (n1 + n2);
                    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
                }
                if (operacao == 2) {
                    resultado = (n1 - n2);
                    JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado);
                }
                if (operacao == 3) {
                    resultado = (n1 * n2);
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
                }
                if (operacao == 4) {
                    if ((n1 == 0) || (n2 == 0)) {
                        JOptionPane.showMessageDialog(null, "Não é permitido divisão por 0");
                    } else {
                        resultado = (n1 / n2);
                        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
                    }
                }
                if (operacao > 4) {
                    JOptionPane.showMessageDialog(null, "Código inválido");
                }
            }
        } while (operacao != 0);
    }
}
