package exercicios;


import javax.swing.*;

public class Exercicio6_encadeamento_if {

    

        public static void main(String args[]) {
            int idade;
            String dado;
            dado = JOptionPane.showInputDialog("Digite a idade:");
            idade = Integer.parseInt(dado);
            if ((idade >= 18) && (idade < 40)) {
                JOptionPane.showMessageDialog(null, "Já pode possuir CNH");
            } else if ((idade >= 40) && (idade < 80)) {
                JOptionPane.showMessageDialog(null, "Já pode possuir CNH, mas precisa de óculos");
            } else if (idade >= 80) {
                JOptionPane.showMessageDialog(null, "Habilitado a possuir bengala");
            } else {
                JOptionPane.showMessageDialog(null, "Não pode possuir CNH");
            }
        }
    }

