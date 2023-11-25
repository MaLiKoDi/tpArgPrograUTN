package argProgaUTN.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import argProgaUTN.conexion.DAO;
import argProgaUTN.entidades.Cliente;


public class ClienteDao extends DAO {
	
	public void crearCliente(Cliente cliente) {
		EntityManager entidad = devolverEntityManager();
		EntityTransaction transaccion = null;

		try {
			transaccion = entidad.getTransaction();
			transaccion.begin();

			entidad.persist(cliente);
			transaccion.commit();
			System.out.println("Se creo nuevo cliente");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entidad.close();
		}

	}

	
}
