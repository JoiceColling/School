package lista2;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String args[]) {
        int codigo;
        String dado;
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o código do funcionário");
            codigo = Integer.parseInt(dado);
            switch (codigo) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Gerente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Supervisor");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Contador");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Digitador");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Auxiliar administrativo");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "fim");
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Código inválido");
                }
            }
        } while (codigo != 0);
    }
}
