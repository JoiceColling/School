package exerciciosjava;

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String args[]) {
        int num, centena, dezena, unidade;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 0 e 999"));
            if (num > 999) {
                JOptionPane.showMessageDialog(null, "Este número não é válido");
            }
        } while (num > 999);
        centena = (int) (num / 100);
        dezena =(int) ((num % 100) / 10);
        unidade = (int) (num % 10);
                JOptionPane.showMessageDialog(null, "o número " + num + " possui " + centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades.");
    }
}
