package testes;

import modelo.Evento;
import negocio.Agenda;
import negocio.Cliente;
import negocio.EventoOnline;
import negocio.EventoPresencial;

public class TesteAgenda {

	public static void main(String[] args) {
		String 		nome ;
		Evento[ ]	evento ;
		
		nome = "Workshops" ;
		evento = new Evento[ 3 ] ;
		
		evento[ 0 ] = new EventoPresencial("Meetup Aet", 60, "04/04/2019", 0.0f, false,
				4, "Instituto Infnet") ;
		evento[ 1 ] = new EventoOnline( "Podcast Dados", 200, "05/04/2019", 0.0f,
				true, false, true) ;
		evento[ 2 ] = new EventoPresencial( "Big Data Day", 300, "05/05/2019", 400.0f,
				false, 2, "Sao Paulo" ) ;
		
		Agenda agenda = new Agenda( nome ) ;
		
		for ( Evento e : evento )
		{
			agenda.adiciona( e );
		}
		
		agenda.exibir( ) ;

		Cliente c = new Cliente( "Eduardo Gaspar" , 45 , "eduardo@gaspar.com" ) ;
		agenda.associa( c ) ;
	}

}
 