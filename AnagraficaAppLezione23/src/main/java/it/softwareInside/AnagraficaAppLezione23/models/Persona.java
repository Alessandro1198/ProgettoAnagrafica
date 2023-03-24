package it.softwareInside.AnagraficaAppLezione23.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Persona {
	
	@Id @Size(min = 5, max = 5)
	private String codiceFiscale;
	
	
	@Column(name = "nome")
	@NotNull @NotEmpty
	private String nome;
	
	@Column(name = "cognome")
	@NotNull @NotEmpty
	private String cognome;
	
	@Column(name = "eta")
	@NotNull
	@Min(value = 15)
	private int eta;
	
	public Persona() {
		this("","","",0);
	}

	public Persona(@Size(min = 5, max = 5) String codiceFiscale, @NotNull @NotEmpty String nome,
			@NotNull @NotEmpty String cognome, @NotNull @Min(15) int eta) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}



	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta
				+ "]";
	}

}
