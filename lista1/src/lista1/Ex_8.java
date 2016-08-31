package lista1;

import javax.swing.JOptionPane;

public class Ex_8 {

    public static void main(String args[]) {
        int contador, numero, maior = 0;
        String dado;
        contador = 1;
        do {
            dado = JOptionPane.showInputDialog(null, "Digite um número");
            numero = Integer.parseInt(dado);
            contador = (contador + 1);
            if (numero > maior) {
                maior = numero;
            }
        }while (contador <= 5);
                JOptionPane.showMessageDialog(null, "o maior numero digitado foi: " + maior);
            }
}
