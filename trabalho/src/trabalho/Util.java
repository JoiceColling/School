package trabalho;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Util {

    public static void grava(ArrayList empresa, String patharq) {


        try {
            FileOutputStream arquivo = new FileOutputStream(patharq);
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
            fluxo.writeObject(empresa);
            fluxo.flush();
            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso no arquivo " + patharq);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na gravação do arquivo");
        }


    }

    public static ArrayList le(String patharq) {
        ArrayList agenda = new ArrayList();

        try {
            FileInputStream arquivo = new FileInputStream(patharq);
            ObjectInputStream fluxo = new ObjectInputStream(arquivo);
            agenda = (ArrayList) fluxo.readObject();
            JOptionPane.showMessageDialog(null, "Dados lidos com sucesso no arquivo "+ patharq);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na leitura do arquivo");
        }

        return agenda;
    }
}
