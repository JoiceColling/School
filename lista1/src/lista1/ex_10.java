
package lista1;

import javax.swing.JOptionPane;

public class ex_10 {
    public static void main (String args[]){
    int numero, par, impar, contador, contpar = 0, contimpar = 0;
    String dado;
    contador = 1;
    do {
        dado = JOptionPane.showInputDialog (null, "Digite um numero");
        numero = Integer.parseInt (dado);
        if (numero % 2 == 0) {
            par = numero;
            contpar = (contpar + 1);
        }
        else {
            impar = numero;
            contimpar = (contimpar + 1);
        }
        contador = (contador + 1);
                }while (contador <= 10);
    JOptionPane.showMessageDialog (null, "A quantidade de números pares é: " + contpar + "\nA quantidade de números impares é: " + contimpar);
}
}