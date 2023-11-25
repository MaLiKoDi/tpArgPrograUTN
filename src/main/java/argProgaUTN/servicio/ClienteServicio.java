package argProgaUTN.servicio;

import argProgaUTN.entidades.Cliente;
import argProgaUTN.persistencia.ClienteDao;

public class ClienteServicio {
	
	private ClienteDao clienteDao;
	
	public ClienteServicio() {
		this.clienteDao = new ClienteDao();
	}

	public void crearCliente(Cliente cliente) {
		clienteDao.crearCliente(cliente);
	}
}
