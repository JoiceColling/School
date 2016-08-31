
package joice_exercicios;

import javax.swing.JOptionPane;

public class media {
    public static void main (String[] args){
        float num;
        int cont = 0;
        char sair= 'a';
        float total = 0;
        float media;
        
        String msg = "A média dos números ";
        while(sair == 'a'){
            num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número:"));
            cont = (cont + 1);
            total = total + num;
            msg = msg + num + ", ";
            sair = (JOptionPane.showInputDialog(null, "Digite 'a' para acrescentar outro número ou outra letra para sair")).charAt(0);
        }
        media = total / cont;
        JOptionPane.showMessageDialog(null,msg + "é: " + media);
    }
}
