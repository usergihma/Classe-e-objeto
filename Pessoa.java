package lpamolde;

public class Pessoa {
	String cpf;
	String rg;
	String nome;
	int idade;
	String endereço;
	String profissão;
	
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
	this.endereço = endereço;
	}
	public String getProfissão() {
		return profissão;
	}
	public void setProfisão(String profissão) {
	this.profissão = profissão;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
	this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
	this.rg = rg;
	}
}
	