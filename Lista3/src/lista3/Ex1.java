package lista3;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        float hnormal, hextra, snormal, sextra, salario;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Número de horas normais trabalhadas:");
        hnormal = Float.parseFloat(dado);
        dado = JOptionPane.showInputDialog(null, "Numero de horas extras trabalhadas:");
        hextra = Float.parseFloat(dado);
        snormal = (float) (hnormal * 20.00);
        sextra = (float) (hextra * 25.00);
        salario = (snormal + sextra);
        JOptionPane.showMessageDialog(null, "Seu salário é de: " + salario);

    }
}
