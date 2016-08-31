package lista1;

import javax.swing.JOptionPane;

public class Ex_5 {

    public static void main(String args[]) {
        int serie;
        String dado;
        dado = JOptionPane.showInputDialog("Digite a série");
        serie = Integer.parseInt (dado);
        switch (serie) {
            case 1:
            case 2:
            case 3:
            case 4: {
                JOptionPane.showMessageDialog(null, "Turno da manhã \n Fim");
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8: {
                JOptionPane.showMessageDialog(null, "Turno da Tarde \n Fim");
                break;
            }
        }
    }
}
                

