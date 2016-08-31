
package joice_exercicios;

import javax.swing.JOptionPane;

public class NumeroMaiorMenor {
    public static void main(String args[]){
        int quantidadeDeNumeros = 5;
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        String msg = "";
        
        int count = 1;
        
        while(count <= quantidadeDeNumeros) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite " + quantidadeDeNumeros + " números:"));
            msg += (count == quantidadeDeNumeros) ? numero : numero + " - ";
            
            //if ternario, pesquisar criar conta git, criar repositório novo
            maior = (numero > maior) ? numero : maior;
            menor = (numero < menor) ? numero : menor; 

            count ++;
        }
        JOptionPane.showMessageDialog(null, "Os números digitados são: " + msg + "\nO maior número digitado é: " + maior + "\nE o menor número é: " + menor);
    }
}