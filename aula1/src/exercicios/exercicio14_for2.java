
package exercicios;

import javax.swing.*;
public class exercicio14_for2 {
    


    public static void main(String args[]) {
        int inicio;
        int fim;
        int incremento;
        String dado;
        dado = JOptionPane.showInputDialog("Digite o valor do inicio");
        inicio = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite o valor do fim");
        fim = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite o valor do incremento");
        incremento = Integer.parseInt(dado);
        
        for (int i = inicio; i <= fim; i=i+incremento) {
            System.out.println(i + " - Olá");
        }
    }
}

