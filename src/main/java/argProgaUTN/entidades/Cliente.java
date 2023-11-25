package argProgaUTN.entidades;

import java.util.Set;

import javax.persistence.*;





@Entity
public class Cliente extends Persona  {
	
	@Column
	private int idcontrato;
	
	@Column
	private String razonSocial;
	
	@Column
	private String mail;
	
	
	@ManyToMany(targetEntity = Servicio.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
	private Set<Servicio> servicios;


	public Cliente(int idcontrato, String razonSocial, String mail) {
		super();
		this.idcontrato = idcontrato;
		this.razonSocial = razonSocial;
		this.mail = mail;
		this.servicios = null;
	}


	public int getIdcontrato() {
		return idcontrato;
	}


	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public Set<Servicio> getServicios() {
		return servicios;
	}


	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}




}
