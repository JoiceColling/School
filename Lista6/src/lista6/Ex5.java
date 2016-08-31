package lista6;

import javax.swing.JOptionPane;

public class Ex5 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int linha, coluna, maior, menor, linhamaior = 0, colunamaior = 0, linhamenor = 0, colunamenor = 0;
        String msg = "";
        for (linha = 0; linha <= 3; linha++) {
            for (coluna = 0; coluna <= 3; coluna++) {
                matriz[ linha][ coluna] = (int) (Math.random() * 101);
            }
        }
        menor = matriz[ 0][ 0];
        maior = matriz[ 0][ 0];
        for (linha = 0; linha <= 3; linha++) {
            for (coluna = 0; coluna <= 3; coluna++) {
                if (matriz[ linha][ coluna] > maior) {
                    maior = matriz[ linha][ coluna];
                    linhamaior = linha;
                    colunamaior = coluna;
                }
                if (matriz[ linha][ coluna] < menor) {
                    menor = matriz[ linha][ coluna];
                    linhamenor = linha;
                    colunamenor = coluna;
                }
            }
        }
        msg = "Matriz gerada: \n";
        for (linha = 0; linha <= 3; linha++) {
            for (coluna = 0; coluna <= 3; coluna++) {
                msg = msg + matriz[ linha][ coluna] + " - ";
            }
            msg = msg + "\n";
        }
        msg = msg + "O maior número é: " + maior + " na linha: " + linhamaior + " e coluna: " + colunamaior + "\n" + "O menor número é: " + menor + " na linha: " + linhamenor + " e coluna: " + colunamenor;
        JOptionPane.showMessageDialog(null, msg);
    }
}
