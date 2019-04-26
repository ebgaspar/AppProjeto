package testes;

import modelo.Evento;
import negocio.EventoPresencial;

public class TesteEventoPresencial {

	public static void main(String[] args) {
		
		Evento[] evento = new Evento[ 3 ] ;
		
		evento[ 0 ] = new EventoPresencial("meetup Aet", 60, "04/04/2019", 0.0f, false,
				4, "Senac Copacabana") ;
		evento[ 1 ] = new EventoPresencial("meetup Big Data", 60, "05/04/2019", 0.0f, false,
				4, "Senac Flamengo") ;
		evento[ 2 ] = new EventoPresencial("meetup Data Science", 60, "06/04/2019", 0.0f, false,
				4, "Senac Botafogo") ;
		
		for ( Evento e : evento )
		{
			e.exibir( ) ;
		}

	}

}
