package lista2;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String args[]) {
        int mes, dia;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite o mês");
        mes = Integer.parseInt(dado);
        if ((mes == 4) || (mes == 5)) {
            JOptionPane.showMessageDialog(null, "Outono");
        }
        if (mes == 6) {
            dado = JOptionPane.showInputDialog(null, "Digite o dia");
            dia = Integer.parseInt(dado);
            if (dia < 21) {
                JOptionPane.showMessageDialog(null, "Outono");
            } else {
                JOptionPane.showMessageDialog(null, "Inverno");
            }
        }
        if ((mes == 7) || (mes == 8)) {
            JOptionPane.showMessageDialog(null, "Inverno");
        }
        if (mes == 9) {
            dado = JOptionPane.showInputDialog(null, "Digite o dia");
            dia = Integer.parseInt(dado);
            if (dia <= 23) {
                JOptionPane.showMessageDialog(null, "Inverno");
            } else {
                JOptionPane.showMessageDialog(null, "Primavera");
            }
        }
        if ((mes == 10) || (mes == 1)) {
            JOptionPane.showMessageDialog(null, "Primavera");
        }
        if (mes == 12) {
            dado = JOptionPane.showInputDialog(null, "Digite o dia");
            dia = Integer.parseInt(dado);
            if (dia < 21) {
                JOptionPane.showMessageDialog(null, "Primavera");
            } else {
                JOptionPane.showMessageDialog(null, "Verão");
            }
        }
        if ((mes == 1) || (mes == 2)) {
            JOptionPane.showMessageDialog(null, "Verão");
        }
        if (mes == 3) {
            dado = JOptionPane.showInputDialog(null, "Digite o dia");
            dia = Integer.parseInt(dado);
            if (dia < 21) {
                JOptionPane.showMessageDialog(null, "Verão");
            } else {
                JOptionPane.showMessageDialog(null, "Outono");
            }
        }
    }
}
