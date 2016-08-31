package lista4;

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String args[]) {
        int numero[] = new int[10];
        int cont, soma = 0, media;
        for (cont = 0; cont <= 9; cont++) {
            numero[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número na posição " + cont + ":"));
        }
        for (cont = 0; cont <= 9; cont++) {
            soma = (numero[ cont] + soma);
        }
        media = (soma / 10);
        JOptionPane.showMessageDialog(null, "A soma de todos os números é: " + soma + "\n" + "A média dos números é: " + media);
    }
}
