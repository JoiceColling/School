package lista1;

import javax.swing.JOptionPane;

public class Ex_2 {

    public static void main(String args[]) {
        float celcius, fahrenheit, kelvin;
        String dado;
        dado = JOptionPane.showInputDialog("Digite a temperatura em graus Celcius");
        celcius = Float.parseFloat(dado);
        fahrenheit = (float) (celcius * 1.8 + 32);
        kelvin = (float) (celcius + 273.15);
        JOptionPane.showMessageDialog(null, "a temperatura em Fahrenheit é: " + fahrenheit);
        JOptionPane.showMessageDialog(null, "a temperatura em Kelvin é: " + kelvin);

    }
}
