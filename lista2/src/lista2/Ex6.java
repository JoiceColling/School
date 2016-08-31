package lista2;

import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String args[]) {
        float altura, peso = 0;
        char sexo, codigo;
        String dado;
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o sexo");
            sexo = dado.charAt(0);
            dado = JOptionPane.showInputDialog(null, "Digite a altura");
            altura = Float.parseFloat(dado);
            if (sexo == 'm') {
                peso = (float) ((72.7 * altura) - 58);
            }
            if (sexo == 'f') {
                peso = (float) ((62.1 * altura) - 44.7);
            }
            JOptionPane.showMessageDialog(null, "O peso ideal é " + peso);
            dado = JOptionPane.showInputDialog(null, "Digite z para finalizar ou outra letra para continuar");
            codigo = dado.charAt(0);
            if (codigo == 'z') {
                JOptionPane.showMessageDialog(null, "Fim");
            }
        } while (codigo != 'z');
    }
}
