package lista3;

import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String args[]) {
        float valor, preco = 0;
        int frete;
        String dado;
        dado = JOptionPane.showInputDialog(null, "Qual é o valor de sua encomenda? ");
        valor = Float.parseFloat(dado);
        dado = JOptionPane.showInputDialog(null, "Qual a distância do frete em Km? ");
        frete = Integer.parseInt(dado);
        if ((frete > 0) && (frete <= 100)) {
            preco = ((valor * 20) / 100);
            preco = (valor + preco);
        }
        if ((frete >= 101) && (frete <= 300)) {
            preco = ((valor * 17) / 100);
            preco = (valor + preco);
        }
        if ((frete >= 301) && (frete <= 500)) {
            preco = ((valor * 15) / 100);
            preco = (valor + preco);
        }
        if ((frete >= 501) && (frete <= 1000)) {
            preco = ((valor * 13) / 100);
            preco = (valor + preco);
        }
        if (frete > 1000) {
            preco = ((valor * 10) / 100);
            preco = (valor + preco);
        }
        JOptionPane.showMessageDialog(null, "O preço do seu frete é R$ " + preco);
    }
}
