package metodos;

import javax.swing.JOptionPane;

public class utilidades {

   public static int gerapar(int limite) {

        int resposta;

        resposta = (int) (Math.random() * limite);

        if ((resposta % 2) != 0) {
            resposta = resposta + 1;
        }

        return resposta;
    }

    public static int geraimpar(int limite) {

        int resposta;

        resposta = (int) (Math.random() * limite);

        if ((resposta % 2) == 0) {
            resposta = resposta + 1;
        }

        return resposta;
    }

    public static int geraprimo(int limite) {
        int contdiv, numero, x;

        do {
            contdiv = 0;
            numero = (int) (Math.random() * limite);
            for (x = 1; x <= numero; x++) {
                if ((numero % x) == 0) {
                    contdiv = contdiv + 1;
                }
            }
        } while (contdiv > 2);

        return numero;

    }

    public static void escrevervetor(int x[]) {
        int tamanho = x.length;
        String msg = "";
        for (int i = 0; i < (tamanho); i++) {
            msg = msg + (x[i] + "-");
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void escrevermatriz(int x[][]) {
        int tamanholinha = x.length;
        int tamanhocoluna = x[0].length;
        String msg = "";
        for (int i = 0; i < (tamanholinha); i++) {
            for (int j = 0; j < (tamanholinha); j++) {
                msg = msg + (x[i][j] + "-");
            }
            msg = msg + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
