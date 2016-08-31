package lista3;

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String args[]) {
        float ano, mes, dia;
        String dado;
        int dias;
        dado = JOptionPane.showInputDialog(null, "Digite o número de total de dias");
        dias = Integer.parseInt(dado);
        ano = (dias / 365);
        dias = (int) (dias - (365 * ano));
        mes = (dias / 30);
        dias = (int) (dias - (30 * mes));
        JOptionPane.showMessageDialog(null, "O total de dias digitados corresponde a " + ano + " anos , " + mes + " mes(es) e " + dias + " dias" + "\nFinalizando...");
    }
}
