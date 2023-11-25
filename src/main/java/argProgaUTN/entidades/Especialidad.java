package argProgaUTN.entidades;

import javax.persistence.*;

@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nombre;
    @ManyToOne(targetEntity = Servicio.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
  
    private Servicio servicio;

    
    public Especialidad(String nombre) {
        this.nombre=nombre;
    }

    public Especialidad() {
    }

}
