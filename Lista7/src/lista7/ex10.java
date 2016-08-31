package lista7;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String[] args) {
        final int EQUIPES = 5;
        String times[] = new String[EQUIPES];
        String msg = "";
        int pontos[][] = new int[EQUIPES][EQUIPES - 1], cont, cont1, cont2, aux, aux2, linha, coluna, soma;
        for (cont = 0; cont <= EQUIPES - 1; cont++) {
            times[ cont] = JOptionPane.showInputDialog(null, "Digite o nome das equipe " + (cont + 1));
        }
        msg = "Foram digitados os times \n";
        for (cont = 0; cont <= EQUIPES - 1; cont++) {
            msg = msg + cont + " - " + times[ cont] + "\n";
        }
        msg = msg + "\n";
        for (cont = 0; cont <= EQUIPES - 1; cont++) {
            cont1 = (cont + 1);
            for (cont2 = cont; cont2 <= EQUIPES - 2; cont2++) {
                msg = msg + "Resultado do jogo entre: " + times[ cont] + " e " + times[ cont1] + "\n";
                aux = (int) (Math.random() * 5);
                msg = msg + times[ cont] + ": " + aux + " X ";
                aux2 = (int) (Math.random() * 5);
                msg = msg + times[ cont1] + ": " + aux2 + "\n";
                if (aux > aux2) {
                    pontos[ cont][ cont2] = 3;
                    pontos[ cont1][ cont] = 0;
                }
                if (aux < aux2) {
                    pontos[ cont][ cont2] = 0;
                    pontos[ cont1][ cont] = 3;
                }
                if (aux == aux2) {
                    pontos[ cont][ cont2] = 1;
                    pontos[ cont1][ cont] = 1;
                }
                cont1 = (cont1 + 1);
            }
        }
        msg = msg + "Pontos marcados: \n";
        for (linha = 0; linha <= EQUIPES - 1; linha++){
        msg = msg + times[ linha] + ": ";
        soma = 0;
        for (coluna = 0; coluna <= EQUIPES - 2; coluna++) {
            soma = (soma + pontos[ linha][ coluna]);
            msg = msg + "jogo " + coluna + 1 + ": " + pontos[ linha][ coluna] + " ponto(s) - ";
        }
        msg = msg + "total de pontos: " + soma + "\n";
    } 
        JOptionPane.showMessageDialog(null, msg);
}
}
