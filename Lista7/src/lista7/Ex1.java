package lista7;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        int matriz[][] = new int[6][4];
        int linha, coluna, soma, maior = 0;
        char sair = 0;
        String msg = "";
        do {
            for (linha = 0; linha <= 5; linha++) {
                for (coluna = 0; coluna <= 3; coluna++) {
                    matriz[ linha][ coluna] = (int) (Math.random() * 101);
                }
            }
            for (linha = 0; linha <= 5; linha++) {
                for (coluna = 0; coluna <= 3; coluna++) {
                    msg = msg + matriz[ linha][ coluna] + " - ";
                }
                msg = msg + "\n";
            }

            for (linha = 0; linha <= 5; linha++) {
                maior = 0;
                for (coluna = 0; coluna <= 3; coluna++) {
                    if (matriz[ linha][ coluna] > maior) {
                        maior = matriz[ linha][ coluna];
                    }
            
                for (coluna = 0; coluna <= 3; coluna++) {
                    matriz[ linha][ coluna] = (matriz[ linha][ coluna] * maior);
                }
                }
            }
                msg = msg + "Matriz Gerada: \n";
                for (linha = 0; linha <= 5; linha++) {
                    for (coluna = 0; coluna <= 3; coluna++) {
                        msg = msg + matriz[ linha][ coluna] + " - ";
                    }
                    msg = msg + "\n";
                }
                JOptionPane.showMessageDialog (null,msg);
                sair = (JOptionPane.showInputDialog(null, "Digite s para sair ou qualquer letra para continuar: ")).charAt(0);
            } while (sair != 's');
        }
}