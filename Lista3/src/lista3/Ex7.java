package lista3;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String args[]) {
        float valor, temp;
        int ce, ci, dz, cc;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite o valor");
        valor = Float.parseFloat(dado);
        temp = valor;
        ce = (int) (temp / 100);
        temp = (temp - 100 * ce);
        ci = (int) (temp / 50);
        temp = (temp - 50 * ci);
        dz = (int) (temp / 10);
        temp = (temp - 10 * dz);
        cc = (int) (temp / 5);
        temp = (temp - cc * 5);
        JOptionPane.showMessageDialog(null, "Para decompor o valor " + valor + " Serão necessárias: \n" + ce + " cédulas de cem reais \n" + ci + " cédulas de cinquenta reais \n" + dz + " cédulas de dez reais \n" + cc + " cédulas de cinco reais \n" + temp + " cédulas de um real");
    }
}
