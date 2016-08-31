package lista3;

import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String args[]) {
        int capacidade, bagagem, total = 0, pa = 0;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Digite a capacidade de cargta do avião");
        capacidade = Integer.parseInt(dado);
        do {
            dado = JOptionPane.showInputDialog(null, "Digite o peso da bagagem");
            bagagem = Integer.parseInt(dado);
            if (bagagem != 0) {
                if ((total + bagagem + 80) < capacidade) {
                    pa = (pa + 1);
                    total = (total + bagagem + 80);
                    JOptionPane.showMessageDialog(null, "Total de carga acumulada até o momento: " + total);
                } else {
                    JOptionPane.showMessageDialog(null, "Capacidade do avião atingiu o limite!");
                    bagagem = 0;
                }
            }
        } while (bagagem != 0);
        JOptionPane.showMessageDialog(null, "Foram computados " + pa + " passageiros \n" + "Total de carga acumulada: " + total);
    }
}
