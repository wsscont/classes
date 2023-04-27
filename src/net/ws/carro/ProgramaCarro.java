package net.ws.carro;

public class ProgramaCarro {
	public static void main(String[] args) {
		Carro carro = new Carro("Sandero Stepway","Branco",50);
		
		System.out.println("Modelo do carro: " + carro.getModelo());
		System.out.println("Cor do carro: " + carro.getCor());
		System.out.println("Capacidade do tanque: " + carro.getCapacidadeTanque());
		
		double valorDoTanqueCheio = carro.valorTanqueCheio(5.98);
		System.out.printf("Valor do tanque cheio do carro: R$%.2f", valorDoTanqueCheio);
	}
}
