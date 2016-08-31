package lista5;

import javax.swing.JOptionPane;


public class Ex5 {
    public static void main (String args[]){
    final int TAMANHO = 10;
    final int SUPERIOR = 51;
    int vetor[] = new int [ TAMANHO ];
    int cont , numero;
    String msg = "";
    for (cont = 0;cont <= TAMANHO - 1;cont++){
        do {
            numero = (int)(Math.random()*SUPERIOR);
            if (numero > 20){
                vetor [ cont ] = numero;
            }
        }while (numero < 20);
    }
    for (cont = 0;cont <=TAMANHO -1 ;cont++){
        msg = msg + vetor [ cont ] + "-";
    }
    JOptionPane.showMessageDialog (null, msg);
    }
}