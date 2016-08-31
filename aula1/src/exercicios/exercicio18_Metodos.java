package exercicios;

public class exercicio18_Metodos {

    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vet = new int[10];
        int sv;
        for (int i = 0; i < 5; i++) {
            vetor[i] = (i + 1) * 10;
        }
        escrever(vetor);
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            vet[i] = (int) (Math.random() * 100);
        }
        escrever(vet);
        sv = somavetor(vetor);
        System.out.println("\n A soma do vetor é: " + sv);
    }

    public static void escrever(int x[]) {
        int tamanho = x.length;
        for (int i = 0; i < (tamanho); i++) {
            System.out.print(x[i] + "-");
        }
    }

    public static int somavetor(int x[]) {
        int tamanho = x.length;
        int soma = 0;
        for (int i = 0; i < (tamanho); i++) {
            soma = soma + x[i];
        }
        return soma;
    }
}
