package model;

public class Animal {
	private int id;
	private String nome;
	private String raca;
	private String especie;
	
	public Animal(int id, String nome, String raca, String especie) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.especie = especie;
	}
	
	public Animal() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
