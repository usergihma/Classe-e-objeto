package lpamolde;

public class ObjetoCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		//OBJETO 1
		carro1.setMarca("Ferrari");
		carro1.setCor("Vermelho");
		carro1.setModelo("296 GTB");
		carro1.setPlaca("12345abc");
		
		//OBJETO 2
		carro2.setMarca("Ferrari");
		carro2.setCor("Preto");
		carro2.setModelo("296 GTS");
		carro2.setPlaca("67890def");
	
		//Chamando o método get() para apresentar os objetos
		System.out.println("----Objeto----");
		System.out.println(carro1.getCor());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getPlaca());
		
		System.out.println("----Objeto 2----");
		System.out.println(carro2.getCor());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getPlaca());
}
}
