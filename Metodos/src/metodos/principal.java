package metodos;

public class principal {
public static void main(String args[]) {
        int linha, coluna, numero, contdiv, x;
        int matriz[][] = new int[5][5];
        String msg;
        for (linha = 0; linha <= 4; linha++) {
            for (coluna = 0; coluna <= 4; coluna++) {
                
                if (linha < coluna) {
                    matriz[ linha][ coluna] = utilidades.gerapar(100);
                }
                
                if (coluna < linha) {
                    matriz[ linha][ coluna] = utilidades.geraimpar(100);
                }
                if (linha == coluna) {
                    matriz[ linha][ coluna] = utilidades.geraprimo(100);
                }
            }
        }
        utilidades.escrevermatriz(matriz);
    }
}
