package testes;

import modelo.Evento;
import negocio.EventoOnline;

public class TesteEventoOnline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Evento[] evento = new Evento[ 3 ] ;
	
	evento[ 0 ] = new EventoOnline("Podcast Java", 60, "04/04/2019", 0.0f, false,
			true, true ) ;
	evento[ 1 ] = new EventoOnline( "Podcast Dados", 200, "05/04/2019", 0.0f,
			true, false, true) ;
	evento[ 2 ] = new EventoOnline( "Podcast Algebra", 300, "05/05/2019", 400.0f,
			false, false, false ) ;
	
	for ( Evento e : evento )
	{
		e.exibir( ) ;
	}

	}
}
