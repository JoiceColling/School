
package lista6;

import javax.swing.JOptionPane;


public class Ex4 {
    public static void main(String[] args) {
        int matriz [] [] = new int [ 4 ] [ 4 ];
    int linha , coluna , soma  = 0, media;
    String msg = "";
    for (linha = 0;linha <= 3;linha++){
            for (coluna = 0;coluna <= 3;coluna++){
            matriz [ linha ] [ coluna ] = (int)(Math.random ( ) * 101);
            soma = soma + matriz [ linha ] [ coluna ];
            }
    }
    media = (soma / 16);
    msg = "Matriz gerada: \n";
    for (linha = 0;linha <= 3;linha++){
            for (coluna = 0;coluna <= 3;coluna++){
            msg = msg + matriz [ linha ] [ coluna ] + " - ";
            }
        msg = msg + "\n";
    }
    msg = msg + "A soma dos números é: " + soma + "\n" + "A média dos números é: " + media;
    JOptionPane.showMessageDialog (null, msg);
    }
}
