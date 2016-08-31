package lista3;

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String args[]) {
        int codigo;
        float area, altura, base, raio;
        String dado;
        JOptionPane.showMessageDialog(null, "1- Retângulo \n2- Triângulo \n3- Círculo \n0- Finalizar ");
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o código");
            codigo = Integer.parseInt(dado);
            switch (codigo) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando");
                    break;
                case 1:
                    dado = JOptionPane.showInputDialog(null, "Escreva a altura do retângulo");
                    altura = Float.parseFloat(dado);
                    dado = JOptionPane.showInputDialog(null, "Escreva a base do retângulo");
                    base = Float.parseFloat(dado);
                    area = (base * altura);
                    JOptionPane.showMessageDialog(null, "A área do retângulo é de: " + area);
                    break;
                case 2:
                    dado = JOptionPane.showInputDialog(null, "Escreva a altura do triângulo");
                    altura = Float.parseFloat(dado);
                    dado = JOptionPane.showInputDialog(null, "Escreva a base do triângulo");
                    base = Float.parseFloat(dado);
                    area = ((base * altura) / 2);
                    JOptionPane.showMessageDialog(null, "A área do triângulo é de: " + area);
                    break;
                case 3:
                    dado = JOptionPane.showInputDialog(null, "Escreva qual o raio do círculo");
                    raio = Float.parseFloat(dado);
                    area = (float) (3.14 * raio * raio);
                    JOptionPane.showMessageDialog(null, "A área do círculo é de: " + area);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código inválido");
            }
        } while (codigo != 0);
    }
}
