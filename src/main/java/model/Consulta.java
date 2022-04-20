package model;

import java.sql.Date;

public class Consulta {
	private int id;
	private Date data;
    private Date horario;
    
	public Consulta(int id, Date data, Date horario) {
		super();
		this.id = id;
		this.data = data;
		this.horario = horario;
	}
	
	public Consulta() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}
	

	
	
}
