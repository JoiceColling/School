package exercicios;

import javax.swing.JOptionPane;

public class exercicio17_Try_Catch_Finally_Throw {

    public static void main(String args[]) {
        int numero = 0, num = 0, res = 0;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
                res = numero / num;
                JOptionPane.showMessageDialog(null, "resposta:" + res);
                throw new Exception("ME");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Erro divisão por zero ");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro na conversão ");
            } catch (Exception ME) {
                if (res < 20) {
                    JOptionPane.showMessageDialog(null, "Boa tarde ");
                }
            } finally {
                JOptionPane.showMessageDialog(null, "oi");
            }

        } while (numero != 0);
        JOptionPane.showMessageDialog(null, "fim");
    }
}
