package Classes0708;

public class Pessoa {
	String nome;
	int idade;
	String endereco;
	String profissao;
	String rg;
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
    public String getEndereco() {
    	return endereco;
    }
    
    public void setEndereco(String endereco) {
    	this.endereco = endereco;
    	
    }
    public String getprofissao() {
    	return profissao;
    }
    public void setProfissao(String profissao) {
    	this.profissao = profissao;
    }
   
    public String getRg() {
    	return rg;
    }
    public void setRG (String rg) {
    	this.rg = rg;
    }
    public String setcpf() {
    	return cpf;
    }
    public void getcpf (String cpf) {
    	this.cpf = cpf;
    }
}
