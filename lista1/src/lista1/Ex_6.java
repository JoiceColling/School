package lista1;

import javax.swing.JOptionPane;

public class Ex_6 {

    public static void main(String args[]) {
        float v1, v2, v3, soma, desconto, vliquido;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        v1 = Float.parseFloat(dado);
        dado = JOptionPane.showInputDialog(null, "Digite o segundo valor");
        v2 = Float.parseFloat(dado);
        dado = JOptionPane.showInputDialog(null, "Digite o terceiro valor");
        v3 = Float.parseFloat(dado);
        soma = (float) (v1 + v2 + v3);
        if (soma >= 1000.00) {
            desconto = ((soma * 10) / 100);
        } else {
            desconto = ((soma * 8) / 100);
        }
        vliquido = (soma - desconto);
        JOptionPane.showMessageDialog(null, "O valor bruto é: " + soma + "\nO desconto concedido é: " + desconto + "\nO valor líquido é: " + vliquido);
    }
}
