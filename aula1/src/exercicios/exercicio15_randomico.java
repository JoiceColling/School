package exercicios;

import javax.swing.JOptionPane;

public class exercicio15_randomico {
    
public static void main (String args[]){
    int vetor[] = new int[10];
    int cont;
    String msg = "Vetor gerado: \n";
     for (cont = 0; cont < 10; cont++) {
            vetor[cont] = (int) (Math.random() * 101);
    }
    for (cont  = 0; cont < 10; cont++){
            msg = msg + vetor[cont] + " - ";
    }
    JOptionPane.showMessageDialog(null, msg);

        }
    }


