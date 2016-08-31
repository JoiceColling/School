
package joice_exercicios;

//import java.util.ArrayList;

import javax.swing.JOptionPane;

//import java.util.List;

public class OrdenaNumeros {
    public static void main (String[] args){
        //List<Integer> numeros = new ArrayList<Integer>();
        final int QuantidadeDeNumeros = 5;
        int numeros[] = new int[QuantidadeDeNumeros];
        int i, j;
        int VariavelAuxiliar;
        String msg1 = "Os números digitados são: ", msg2 = "Números Ordenados: ";
        
        for(i = 0; i < QuantidadeDeNumeros; i++){ 
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite " + QuantidadeDeNumeros + " números"));
                msg1 += (i == QuantidadeDeNumeros) ? numeros[i] : numeros[i] + " - "; 
        } 
        
        for (i = 0; i < QuantidadeDeNumeros; i++){
            for (j = 0; j < QuantidadeDeNumeros; j++){
                if (numeros[i] < numeros[j]){
                    VariavelAuxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = VariavelAuxiliar;   
                }
            }
        }
        
        for (i = 0; i < QuantidadeDeNumeros; i++){
            msg2 += (i == QuantidadeDeNumeros) ? numeros[i] : numeros[i] + " - ";
        }
        
        JOptionPane.showMessageDialog(null,msg1 + "\n" + msg2);
    }
}