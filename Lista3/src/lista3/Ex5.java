package lista3;

import javax.swing.JOptionPane;

public class Ex5 {

    public static void main(String args[]) {
        int codigo;
        float total = 0;
        String dado;
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o código");
            codigo = Integer.parseInt(dado);
            switch (codigo) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando");
                case 10:
                    total = (float) (total + 2.50);
                    break;
                case 11:
                    total = (float) (total + 6.00);
                    break;
                case 12:
                    total = (float) (total + 6.50);
                    break;
                case 13:
                    total = (float) (total + 5.00);
                    break;
                case 14:
                    total = (float) (total + 5.50);
                    break;
                case 15:
                    total = (float) (total + 2.00);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código Inválido");
            }
        } while (codigo != 0);
        JOptionPane.showMessageDialog(null, "O total é R$ " + total);
    }
}
