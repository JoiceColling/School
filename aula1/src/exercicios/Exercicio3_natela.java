
package aula2;

import java.util.Scanner;

public class Exercicio3_natela {
    
    public static void main(String[] args){
        int idade;
        String nome;
        float altura;
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite a idade");
        idade = dados.nextInt();
        System.out.println("Digite o nome");
        nome = dados.next();
        System.out.println("Digite a altura");
        altura = dados.nextFloat();
        System.out.printf("A idade é %d, o nome é %s e a altura é %.2f\n",idade,nome,altura);
    }
}
