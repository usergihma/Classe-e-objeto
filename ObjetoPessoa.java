package lpamolde;

public class ObjetoPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		//OBJETO
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereço("Rua tal");
		pessoa1.setProfisão("Ator");
		pessoa1.setCpf("8888888888");
		pessoa1.setRg("xxxxx");
		
		//OBJETO 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereço("Rua tal");
		pessoa2.setProfisão("Jogador de futebol");
		pessoa2.setCpf("99999999999");
		pessoa2.setRg("xxxxx");
	
		//Chamando o método get() para apresentar os objetos
		System.out.println("----Objeto----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereço());
		System.out.println(pessoa1.getProfissão());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());
		
		System.out.println("----Objeto 2----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereço());
		System.out.println(pessoa2.getProfissão());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());

}
}
