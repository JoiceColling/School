package lista3;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String args[]) {
        int ano, mes, dia, totaldias;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite o número de anos");
        ano = Integer.parseInt(dado);
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o número de meses");
            mes = Integer.parseInt(dado);
            if (mes > 11) {
                JOptionPane.showMessageDialog(null, "O número de meses não pode exceder 11!");
            }
        } while (mes > 11);
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o número de dias");
            dia = Integer.parseInt(dado);
            if (dia > 29) {
                JOptionPane.showMessageDialog(null, "O número de dias não pode exceder 29!");
            }
        } while (dia > 29);
        totaldias = ((ano * 365) + (mes * 30) + dia);
        JOptionPane.showMessageDialog(null, "O total de dias é: " + totaldias);
        JOptionPane.showMessageDialog(null, "Finalizando");
    }
}
