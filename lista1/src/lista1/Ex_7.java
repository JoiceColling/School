
package lista1;

import javax.swing.JOptionPane;

public class Ex_7 {
    public static void main (String args[]){
    float n1, n2, n3, n4, soma1, soma2, desconto, acrescimo, bruto, vliquido;
    String dado;
    dado = JOptionPane.showInputDialog (null, "Priomeiro número"); 
    n1 = Float.parseFloat (dado);
    dado = JOptionPane.showInputDialog (null, "Segundo número");
    n2 = Float.parseFloat (dado);
    dado = JOptionPane.showInputDialog (null, "Terceiro númeoro");
    n3 = Float.parseFloat (dado);
    dado = JOptionPane.showInputDialog (null, "Quarto número");
    n4 = Float.parseFloat (dado);
    soma1 = (n1 + n2);
    soma2 = (n3 + n4);
    bruto = (soma1 + soma2);
    if (soma1 > soma2){
        desconto = (float) (( bruto * 20 ) / 100);
        vliquido = (bruto - desconto);
        JOptionPane.showMessageDialog (null, "o desconto concedido é: " + desconto );
    }
    else{
        acrescimo = (( bruto * 20 ) / 100);
        vliquido = (bruto + acrescimo);
        JOptionPane.showMessageDialog (null,"o acréscimo é de: " + acrescimo );
    }
    JOptionPane.showMessageDialog (null, "a soma dos dois primeiros números é: " + soma1 + "\na soma dos dois últimos números é: " + soma2 + "\no valor bruto é: " + bruto + "\no valor liquido é: " + vliquido);
    }
}
