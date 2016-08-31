
package joice_exercicios;

import javax.swing.JOptionPane;


public class Mediacarro {
    public static void main (String [] args){
        int litros;
        int kilometros;
        String msg = "";
        int total;
        
        litros = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos litros de gasolina você abasteceu?"));
        kilometros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos quilômetros você percorreu?"));
        total = kilometros / litros;
        msg = "A média de quilômetros percorridos por litro é: ";
        
        JOptionPane.showMessageDialog(null, msg + total );
    }
}
