package net.ws.carro;

public class Carro {
	String cor;
	String modelo;
	int capacidadeTanque;

	public Carro() {}
	
	public Carro(String modelo, String cor, int capacidadeTanque) {
		setModelo(modelo);
		setCor(cor);
		setCapacidadeTanque(capacidadeTanque);
	}
	
	public double valorTanqueCheio(double valorGasolina) {
		return valorGasolina * getCapacidadeTanque();
	}

	public void finalize() {
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
}
