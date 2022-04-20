package model;

import java.util.ArrayList;

public class Tutor {
	private int id;
	private String nome;
	private ArrayList<Animal> pets = new ArrayList <Animal>();
	private String endereco;
	private String telefone;
	
	public Tutor(int id, String nome, ArrayList<Animal> pets, String endereco, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.pets = pets;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Tutor() {
		
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

	public ArrayList<Animal> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Animal> pets) {
		this.pets = pets;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
