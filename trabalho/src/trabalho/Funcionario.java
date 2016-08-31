package trabalho;


import java.io.Serializable;
import java.util.Date;


public class Funcionario implements Serializable {

int codigo;    
String nome;
char sexo;
String cargo;
String funcao;
float salario;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, char sexo, String cargo, String funcao, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.funcao = funcao;
        this.salario = salario;
    }
  
}