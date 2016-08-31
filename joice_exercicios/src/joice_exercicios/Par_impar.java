
package joice_exercicios;

import javax.swing.JOptionPane;

public class Par_impar {

    public static void main(String[] args) {
        int num;
        char sair = 0;
        String msg = "";
        
        while (sair != 's'){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            msg = "O número " + num + " é par";
            if(num % 2 != 0){
                msg = "O número " + num + " é ímpar"; 
            }
            JOptionPane.showMessageDialog(null, msg);
            sair = (JOptionPane.showInputDialog("Digite 's' para sair ou outra letra para continuar")).charAt(0);
        }
    }
    
}
