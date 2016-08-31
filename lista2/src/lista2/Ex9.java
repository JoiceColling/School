package lista2;

import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String args[]) {
        int idade, codigo;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite a idade:");
        idade = Integer.parseInt(dado);
        if ((idade < 18) || (idade > 70)) {
            JOptionPane.showMessageDialog(null, "Não pode adquirir apólice de seguro");
        } else {
            dado = JOptionPane.showInputDialog(null, "Digite o Grupo de risco");
            codigo = Integer.parseInt(dado);
            if ((idade >= 18) && (idade <= 24) && (codigo == 7)) {
                JOptionPane.showMessageDialog(null, "Grupo Baixo");
            }
            if ((idade >= 18) && (idade <= 24) && (codigo == 8)) {
                JOptionPane.showMessageDialog(null, "Grupo Médio");
            }
            if ((idade >= 18) && (idade <= 24) && (codigo == 9)) {
                JOptionPane.showMessageDialog(null, "Grupo Alto");
            }
            if ((idade >= 18) && (idade <= 24) && (codigo != 7) && (codigo != 8) && (codigo != 9)) {
                JOptionPane.showMessageDialog(null, "Grupo Inválido");
            }
            if ((idade >= 25) && (idade <= 40) && (codigo == 4)) {
                JOptionPane.showMessageDialog(null, "Grupo Baixo");
            }
            if ((idade >= 25) && (idade <= 40) && (codigo == 5)) {
                JOptionPane.showMessageDialog(null, "Grupo Médio");
            }
            if ((idade >= 25) && (idade <= 40) && (codigo == 6)) {
                JOptionPane.showMessageDialog(null, "Grupo Alto");
            }
            if ((idade >= 25) && (idade <= 40) && (codigo != 4) && (codigo != 5) && (codigo != 6)) {
                JOptionPane.showMessageDialog(null, "Grupo Inválido");
            }
            if ((idade >= 41) && (idade <= 70) && (codigo == 1)) {
                JOptionPane.showMessageDialog(null, "Grupo Baixo");
            }
            if ((idade >= 41) && (idade <= 70) && (codigo == 2)) {
                JOptionPane.showMessageDialog(null, "Grupo Médio");
            }
            if ((idade >= 41) && (idade <= 70) && (codigo == 3)) {
                JOptionPane.showMessageDialog(null, "Grupo Alto");
            }
            if ((idade >= 41) && (idade <= 70) && (codigo != 1) && (codigo != 2) && (codigo != 3)) {
                JOptionPane.showMessageDialog(null, "Grupo Inválido");
            }
        }
    }
}
