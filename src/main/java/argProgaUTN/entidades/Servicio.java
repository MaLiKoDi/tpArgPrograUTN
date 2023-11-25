package argProgaUTN.entidades;

import javax.persistence.*;



@Entity
@Table(name="sevicio")
public class Servicio {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	@Column
    private String nombre;
}
