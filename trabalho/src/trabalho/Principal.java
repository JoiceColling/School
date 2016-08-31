package trabalho;

import java.awt.Component;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Principal {

    private static Component parent;

    public static void main(String args[]) {

        int cont;
        ArrayList<Funcionario> empresa = new ArrayList<Funcionario>();
        char opcao;
        String patharq = null;
        JFileChooser escolhe = new JFileChooser();
        int returnVal = escolhe.showOpenDialog(parent);
        float total;
        
        if (returnVal == 1) {
            JOptionPane.showMessageDialog(null, "Você não selecionou nenhum arquivo. \nFinalizando");
        } else {
            patharq = escolhe.getSelectedFile().getAbsolutePath();
            empresa = Util.le(patharq);
            do {
                opcao = JOptionPane.showInputDialog("Digite i para inserir, l para listar, r para remover, a para alterar, t para total de salários e s para sair").charAt(0);
                switch (opcao) {
                    case 'i': {
                        Funcionario funcionario = new Funcionario();
                        funcionario.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário")));
                        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
                        funcionario.setSexo(JOptionPane.showInputDialog("Digite o sexo do funcionário").charAt(0));
                        funcionario.setCargo(JOptionPane.showInputDialog("Digite o cargo do funcionário"));
                        funcionario.setFuncao(JOptionPane.showInputDialog("Digite a função do funcionário"));
                        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário")));
                        empresa.add(funcionario);
                    }
                    break;
                    case 'l': {
                        String msg = "lista de funcionários: \n";
                        if (empresa.size() == 0) {
                            JOptionPane.showMessageDialog(null, "Empresa vazia");
                        } else {
                            for (cont = 0; cont < empresa.size(); cont++) {
                                msg = msg + "Código: " + empresa.get(cont).getCodigo() + " - ";
                                msg = msg + "Nome: " + empresa.get(cont).getNome() + " - ";
                                msg = msg + "Sexo: " + empresa.get(cont).getSexo() + " - ";
                                msg = msg + "Cargo: " + empresa.get(cont).getCargo() + " - ";
                                msg = msg + "Função: " + empresa.get(cont).getFuncao() + " - ";
                                msg = msg + "Salario: " + empresa.get(cont).getSalario() + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    }
                    break;
                    case 'r': {
                        String msg = "lista de funcionários: \n";
                        if (empresa.size() == 0) {
                            JOptionPane.showMessageDialog(null, "Empresa vazia");
                        } else {
                            for (cont = 0; cont < empresa.size(); cont++) {
                                msg = msg + "Código: " + empresa.get(cont).getCodigo() + " - ";
                                msg = msg + "Nome: " + empresa.get(cont).getNome() + "\n";
                            }
                            int cod = Integer.parseInt(JOptionPane.showInputDialog(msg + "Digite o código do funcionário a remover"));
                            for (cont = 0; cont < empresa.size(); cont++) {
                                if (cod == empresa.get(cont).getCodigo()) {
                                    empresa.remove(cont);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                    case 'a': {
                        String msg = "lista de funcionários: \n";
                        if (empresa.size() == 0) {
                            JOptionPane.showMessageDialog(null, "Empresa vazia");
                        } else {
                            for (cont = 0; cont < empresa.size(); cont++) {
                                msg = msg + "Código: " + empresa.get(cont).getCodigo() + " - ";
                                msg = msg + "Nome: " + empresa.get(cont).getNome() + "\n";
                            }
                            int cod = Integer.parseInt(JOptionPane.showInputDialog(msg + "Digite o código do funcionário a alterar"));
                            for (cont = 0; cont < empresa.size(); cont++) {
                                if (cod == empresa.get(cont).getCodigo()) {
                                    empresa.get(cont).setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário", empresa.get(cont).getCodigo())));
                                    empresa.get(cont).setNome(JOptionPane.showInputDialog("Digite o nome do funcionário", empresa.get(cont).getNome()));
                                    empresa.get(cont).setSexo(JOptionPane.showInputDialog("Digite o Sexo do funcionário", empresa.get(cont).getSexo()).charAt(0));
                                    empresa.get(cont).setCargo(JOptionPane.showInputDialog("Digite o cargo do funcionário", empresa.get(cont).getCargo()));
                                    empresa.get(cont).setFuncao(JOptionPane.showInputDialog("Digite o cargo do funcionário", empresa.get(cont).getFuncao()));
                                    empresa.get(cont).setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o cargo do funcionário", empresa.get(cont).getSalario())));
                                    break;
                                }
                            }
                        }
                    }
                    break;
                        case 't': {
                          String msg = "lista de funcionários: \n";
                        if (empresa.size() == 0) {
                            JOptionPane.showMessageDialog(null, "Empresa vazia");
                        } else {
                            for (cont = 0; cont < empresa.size(); cont++) {
                                msg = msg + "Código: " + empresa.get(cont).getCodigo() + " - ";
                                msg = msg + "Nome: " + empresa.get(cont).getNome() + " - ";
                                msg = msg + "Salário: " + empresa.get(cont).getSalario() + "\n";
                            }
                            total = 0;
                            for (cont = 0; cont < empresa.size(); cont++) {
                                total = total + empresa.get(cont).getSalario();
                            }
                            JOptionPane.showMessageDialog(null,msg + "\n" + "O total de salários é " + total );
                    }
                        }
                    break;
                    case 's': {
                        JOptionPane.showMessageDialog(null, "Finalizando");
                    }
                    break;
                    default: {
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                    }
                }

            } while (opcao != 's');
            Util.grava(empresa, patharq);
        }
    }
}
