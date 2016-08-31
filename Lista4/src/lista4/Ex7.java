package lista4;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String args[]) {
        int vetor[] = new int[10];
        int cont, temp, pi, temp2, cont2, contdiv;
        String msg = "";
        for (cont = 0; cont <= 9; cont++) {
            vetor[ cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da posição " + cont + " :"));
        }
        for (cont = 0; cont <= 9; cont++) {
            pi = (vetor[ cont] % 2);
            msg = msg + "O numero " + vetor[ cont] + " armazenado na posição " + cont;
            if (pi == 0) {
                msg = msg + " é par ";
            } else {
                msg = msg + " é impar ";
            }
            contdiv = 0;
            for (cont2 = 1; cont2 <= vetor[ cont]; cont2++) {
                temp2 = (vetor[ cont] % cont2);
                if (temp2 == 0) {
                    contdiv = (contdiv + 1);
                }
            }
            if (contdiv < 3) {
                msg = msg + "e é primo \n";
            } else {
                msg = msg + "e não é primo \n";
            }
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
