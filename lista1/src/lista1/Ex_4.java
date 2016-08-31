package lista1;

import javax.swing.JOptionPane;

public class Ex_4 {

    public static void main(String args[]) {
        float compra, desconto, vbruto, vliquido, vacrescimo;
        String dado;
        dado = JOptionPane.showInputDialog("Valor da compra:");
        compra = Float.parseFloat(dado);
        vbruto = compra;
        if (compra <= 100.00) {
            desconto = (float) ((compra * 5) / 100);
            vliquido = (float) (compra - desconto);
            JOptionPane.showMessageDialog(null, "desconto concedido é: " + desconto);
        }
    else {
            vacrescimo = (float) ((compra * 7) / 100);
            vliquido = (float) (compra + vacrescimo);
            JOptionPane.showMessageDialog(null, "o acrescimo é de: " + vacrescimo + "\nO valor bruto é: " + vbruto + "\nO valor liquido é: " + vliquido);
        }
    }
}
