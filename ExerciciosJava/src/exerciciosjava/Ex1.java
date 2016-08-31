package exerciciosjava;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        int ano, resto;
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um ano"));
        resto = (ano % 4);
        if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ano % 400 == 0 ){
            JOptionPane.showMessageDialog(null, "o ano " + ano + " é bissexto");
        } else {
            JOptionPane.showMessageDialog(null, "o ano " + ano + " não é bissexto");
        }
    }
}