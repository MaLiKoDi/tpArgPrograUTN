package argPrograUTN;

import argProgaUTN.entidades.Cliente;
import argProgaUTN.servicio.ClienteServicio;

public class EjemJPA {
	
	
	public static void main(String[] args) {
		
		ClienteServicio clienteServicio = new ClienteServicio();
		
		Cliente cliente = new Cliente (1222, "Java", "Mail@mail.com");
		
		clienteServicio.crearCliente(cliente);
		
		
		
	}
	
	

}
