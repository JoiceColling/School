
package lista1;

import javax.swing.JOptionPane;

public class Ex_3 {
    public static void main (String args[]){
    char sexo;
    float compra, desconto = 0, vbruto, dconcedido, vliquido;
    String dado;
    dado = JOptionPane.showInputDialog("Digite o sexo");
    sexo = dado.charAt(0);
    dado = JOptionPane.showInputDialog("Valor da compra");
    compra = Float.parseFloat(dado);
    vbruto = compra;
    if ((sexo == 'f')||(sexo == 'F')){
        desconto = (( compra * 15 ) / 100);
    }
    if ((sexo == 'm') || (sexo == 'M')){
        desconto = (( compra * 10 ) / 100);
    }
    vliquido = (float) (compra - desconto);
    JOptionPane.showMessageDialog(null, "O valor bruto é: " + vbruto + "\nO desconto concedido é: " + desconto + "\nO valor líquido é: " + vliquido);
    }
}
