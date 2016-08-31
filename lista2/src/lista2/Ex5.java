package lista2;

import javax.swing.JOptionPane;

public class Ex5 {

    public static void main(String args[]) {

        int idade;
        char sexo;
        String dado;
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o sexo:");
            sexo = dado.charAt(0);
            if ((sexo == 's') || (sexo == 'S')) {
                JOptionPane.showMessageDialog(null, "Finalizando");
            } else {
                dado = JOptionPane.showInputDialog(null, "Digite a idade");
                idade = Integer.parseInt(dado);
                if ((sexo == 'f')  && (idade >= 18)) {
                    JOptionPane.showMessageDialog(null, "Pode ter um automóvel rosa");
                }
                if ((sexo == 'f') && (idade < 18)) {
                    JOptionPane.showMessageDialog(null, "Pode ter uma bicicleta rosa");
                }
                if ((sexo == 'm') && (idade >= 18)) {
                    JOptionPane.showMessageDialog(null, "Pode ter um automóvel azul");
                }
                if ((sexo == 'm') && (idade < 18)) {
                    JOptionPane.showMessageDialog(null, "Pode ter uma bicicleta azul");
                }
                if ((sexo != 'f') && (sexo != 'm') && (sexo != 's')) {
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                }
            }
        } while (sexo != 's');
    }
}
