
package exercicios;

public class exercicio20_OrientacaoEObjeto {
    
  String nome;
  int idade;
  char sexo;
  String telefone;
  String endereco;
  String cpf;
  
public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    public exercicio20_OrientacaoEObjeto(){
        
    }
    
    public exercicio20_OrientacaoEObjeto(String nome){
        this.nome = nome;
        this.sexo = 'm';
    }
    
    public exercicio20_OrientacaoEObjeto(int idade){
        this.nome = "fulano";
        this.sexo = 'm';
        this.idade = idade;
        this.telefone = "não informado";
        this.endereco = "não informado";
        this.cpf = "não informado"; 
    } 
    
    public exercicio20_OrientacaoEObjeto(String nome, int idade, char sexo, String telefone, String endereco, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    
  
}

