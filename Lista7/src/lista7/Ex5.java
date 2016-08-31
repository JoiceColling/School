package lista7;

import javax.swing.JOptionPane;

public class Ex5 {

    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        int linha, coluna, numero, cont;
        String msg = "";
        for (linha = 0; linha <= 9; linha++) {
            for (coluna = 0; coluna <= 9; coluna++) {
                matriz[ linha][ coluna] = (int) (Math.random() * 101);
            }
        }
        msg = "Matriz gerada: \n";
        for (linha = 0; linha <= 9; linha++) {
            for (coluna = 0; coluna <= 9; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero que deseja encontrar na matriz ou um numero negativo para sair:"));
            if (numero >= 0) {
                cont = 0;
                for (linha = 0; linha <= 9; linha++) {
                    for (coluna = 0; coluna <= 9; coluna++) {
                        if (matriz[ linha][ coluna] == numero) {
                            cont = (cont + 1);
                        }
                    }
                }
                if (cont > 0) {
                    msg = "O numero " + numero + " foi encontrado " + cont + " vezes \n";
                } else {
                    msg = "O numero nao foi encontrado matriz \n";
                }
                JOptionPane.showMessageDialog(null, msg);
            }
        } while (numero >= 0);
    }
}
