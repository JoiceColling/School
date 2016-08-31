package exercicios;


import javax.swing.JOptionPane;

public class Exercicio5_if {

    public static void main(String args[]) {
        
        int idade;
        String dado;
        dado = JOptionPane.showInputDialog("Digite a idade");
        idade = Integer.parseInt(dado);
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Já pode possuir CNH");
        } else {
            JOptionPane.showMessageDialog(null,"Ainda não pode possuir CNH");
        }
    }
}

