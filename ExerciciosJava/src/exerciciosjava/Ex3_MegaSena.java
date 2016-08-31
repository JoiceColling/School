package exerciciosjava;

import javax.swing.JOptionPane;

public class Ex3_MegaSena {

    public static void main(String args[]) {
        int num1, num2, num3, num4, num5, num6, cont = 0;
        String msg = "";
        for (num1 = 1; num1 <= 60; num1++) {
            for (num2 = num1 + 1; num2 <= 60; num2++) {
                for (num3 = num2 + 1; num3 <= 60; num3++) {
                    for (num4 = num3 + 1; num4 <= 60; num4++) {
                        for (num5 = num4 + 1; num5 <= 60; num5++) {
                            for (num6 = num5 + 1; num6 <= 60; num6++) {
                                // System.out.println(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6 + "\n");
                                cont++;
                            }
                        }
                    }

                }
            }
        }
        System.out.println("Número de combinações: " + cont);
    }
}