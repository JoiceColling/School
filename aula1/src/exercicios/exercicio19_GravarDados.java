package exercicios;

import java.io.*;
import javax.swing.*;

public class exercicio19_GravarDados {

    public static void main(String args[]) {
        int TAMANHO = 10;
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opcao: \n"
                    + "1- Gerar numero e gravar \n"
                    + "2- Ler numero gravados \n"
                    + " 0 - sair"));
            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Fim");
                    break;
                case 1:
                    grava(TAMANHO);
                    break;
                case 2:
                    le(TAMANHO);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida, informe novamente");
            }
        } while (opcao != 0);
    }

    public static void grava(int TAMANHO) {
        int vetor[] = new int[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        try {
            FileOutputStream arquivo = new FileOutputStream("dados.txt");
            DataOutputStream fluxo = new DataOutputStream(arquivo);
            for (int i = 0; i < TAMANHO; i++) {
                fluxo.writeInt(vetor[i]);
                fluxo.flush();
            }
            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso no arquivo dados.txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na gravacao do arquivo");
        }
    }

    public static void le(int TAMANHO) {
        int vetor[] = new int[TAMANHO];
        String msg = "";
        try {
            FileInputStream arquivo = new FileInputStream("dados.txt");
            DataInputStream stream = new DataInputStream(arquivo);
            for (int i = 0; i < TAMANHO; i++) {
                vetor[i] = (int) stream.readInt();
            }
            JOptionPane.showMessageDialog(null, "Dados lidos com sucesso no arquivo dados.txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na leitura do arquivo" + (e));
        }
        for (int i = 0; i < TAMANHO; i++) {
            msg = msg + vetor[i] + "-";
        }
        JOptionPane.showMessageDialog(null, "Vetor gerado: \n" + msg);
    }
}

