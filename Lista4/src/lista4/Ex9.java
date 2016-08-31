package lista4;

import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String args[]) {
        int vet1[] = new int[5];
        int vet2[] = new int[5];
        int vet3[] = new int[5];
        int cont1, cont2, cont3, soma;
        String msg1 = "", msg2 = "", msg3 = "";
        msg1 = "Digite 5 números \n";
        for (cont1 = 0; cont1 <= 4; cont1++) {
            vet1[ cont1] = Integer.parseInt(JOptionPane.showInputDialog(null, msg1 + "Posição " + cont1 + " é:\n"));
        }
        msg2 = "Digite mais 5 para serem somados com os primeiros \n";
        for (cont2 = 0; cont2 <= 4; cont2++) {
            vet2[ cont2] = Integer.parseInt(JOptionPane.showInputDialog(null, msg2 + "Posição " + cont2 + " é:\n"));
        }
        for (cont3 = 0; cont3 <= 4; cont3++) {
            soma = (vet1[ cont3] + vet2[ cont3]);
            msg3 = msg3 + "A soma das posições " + cont3 + " é: " + soma + "\n";
        }
        JOptionPane.showMessageDialog(null, msg3);
    }
}
