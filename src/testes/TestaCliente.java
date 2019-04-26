package testes;

import negocio.Cliente;

public class TestaCliente {

	public static void main(String[] args) {

		String	nome ;
		int		idade;
		String	email;
		
		nome = "Eduardo Gaspar" ;
		idade = 45 ;
		email = "eduardo@gaspar.com" ;
		
		Cliente cliente = new Cliente( nome, idade, email ) ;
		
		cliente.exibir( ) ;

	}

}
