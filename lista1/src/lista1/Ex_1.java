package lista1;

import javax.swing.JOptionPane;

public class Ex_1 {

    public static void main(String args[]) {
        float cotacao;
        float valor;
        float total;
        String dado;
        dado = JOptionPane.showInputDialog("Digite a cotação do dólar");
        cotacao = Float.parseFloat(dado);
        dado = JOptionPane.showInputDialog("Digite o valor em reais");
        valor = Float.parseFloat(dado);
        total = (float) (valor / cotacao);
        JOptionPane.showMessageDialog(null, total + "\n Fim");
    }
}
