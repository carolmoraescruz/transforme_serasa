package aula220408collections;

public class Carro implements Comparable<Carro>{

	private String modelo;
	private Integer ano; // wrapper => autoboxing (convers�o entre tipos primitivos e classes do mesmo tipo)
	private String cor;
	private String motor;
	
	public Carro() {
		
	}

	public Carro(String modelo, Integer ano, String cor, String motor) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return "Ano " + getAno() + "\nModelo " + getModelo() + "\nCor " + getCor() + "\nMotor " + getMotor();
	}
	
	@Override
	public int compareTo(Carro carro) {
		return this.getModelo().compareToIgnoreCase(carro.getModelo());
	}
	
}
