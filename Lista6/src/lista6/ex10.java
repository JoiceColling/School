package lista6;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String[] args) {
        char matriz[][] = new char[5][5];
        int linha, coluna, controle;
        char sair;
        String msg = "";
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                matriz[ linha][ coluna] = 'l';
            }
        }
        do {
            do {
                controle = 0;
                linha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a fila que deseja sentar: "));
                coluna = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da poltrona: "));
                if (matriz[ linha][ coluna] == 'r') {
                    controle = 1;
                    JOptionPane.showMessageDialog(null, "Poltrona Reservada \n" + "Escolha outra poltrona");
                } else {
                    matriz[ linha][ coluna] = 'r';
                }
            } while (controle == 1);
            msg = "Mapa: \n";
            for (linha = 0; linha <= 4; linha++) {
                for (coluna = 0; coluna <= 4; coluna++) {
                    msg = msg + matriz[ linha][ coluna] + " - ";
                }
                msg = msg + "\n";
            }
            sair = (JOptionPane.showInputDialog(null, "Digite s para sair ou c para continuar:")).charAt(0);
        } while (sair == 'c');
        JOptionPane.showMessageDialog(null, msg);
    }
}
