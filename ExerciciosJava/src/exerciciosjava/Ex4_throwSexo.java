
package exerciciosjava;

import javax.swing.JOptionPane;


public class Ex4_throwSexo {
    public static void main (String args[]){
        char sexo = 0;
        do {
            try {
        sexo = (JOptionPane.showInputDialog(null, "Digite m para masculino, f para feminino ou s para sair").charAt(0));
        JOptionPane.showMessageDialog(null, "O sexo digitado é: " + sexo);
        throw new Exception("ME");
        } catch (Exception ME) {
                if ((sexo != 'm') && (sexo != 'M') && (sexo != 'f') && (sexo != 'F') && (sexo != 's') && (sexo != 'S')) {
                    JOptionPane.showMessageDialog(null, "Sexo Inválido");
                }
            } finally {
                JOptionPane.showMessageDialog(null, "Fim");
            }
} while (sexo != 's');
    }

}
