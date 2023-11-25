package argProgaUTN.entidades;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Incidente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String tipoIncidente;
	
	@ManyToOne(targetEntity = Cliente.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id")
	private Cliente cliente;

	@OneToOne(targetEntity = Tecnico.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "tecnico_id", referencedColumnName = "id")
	private Tecnico tecnico;

	@ManyToMany(targetEntity = Servicio.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
	private Set<Servicio> servicios;


}