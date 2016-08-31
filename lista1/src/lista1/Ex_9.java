
package lista1;

import javax.swing.JOptionPane;


public class Ex_9 {
    public static void main (String args[]){
    int contador, numero, maior = 0, menor = 0;
    String dado;
    contador = 1;
    do{
        dado = JOptionPane.showInputDialog (null, "Digite um número");
        numero = Integer.parseInt (dado);
        
        if (contador == 1) {
            maior = numero;
            menor = numero;
        }
        if (numero > maior){
            maior = numero;
        }
        if (numero < menor){
            menor = numero;
        }
        contador = (contador + 1);
                }while (contador <= 5);
    JOptionPane.showMessageDialog (null, "o maior numero digitado foi: " + maior + "\no menor numero digitado foi: " + menor);
    }
}
