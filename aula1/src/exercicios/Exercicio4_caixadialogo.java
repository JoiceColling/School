
package exercicios;

import javax.swing.JOptionPane;


public class Exercicio4_caixadialogo {
    public static void main(String[] args){
        int idade;
        String nome;
        float altura;
        String dado;
        nome = JOptionPane.showInputDialog("Digite a nome"); 
        dado = JOptionPane.showInputDialog("Digite a idade");
        idade = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite a altura");
        altura = Float.parseFloat(dado);
        JOptionPane.showMessageDialog(null,"O nome é "+ nome + "\nA idade é "+ idade + "\nE a altura é "+ altura);
    }
    
}
