package negocio;

import modelo.Evento;

//import java.util.Date;

public class EventoPresencial extends Evento {

	private boolean	_filmado ;
	private int		_edicao ;
	private String	_endereco ;

	public EventoPresencial(String titulo, int np, String data, float preco, boolean filmado, int edicao,
			String endereco) {
		super(titulo, np, data, preco) ;

		this._filmado = filmado ;
		this._edicao = edicao ;
		this._endereco = endereco ;
		nFilhos++ ;
	}

	public void exibir( )
	{
		super.exibir( ) ;
		System.out.println( "Evento Presencial" ) ;
		System.out.println( this.toString( ) ) ;
	}

	@Override
	public String toString( )
	{
		
		return String.format( "%s ; %s ; %s ; %s \n",
								super.toString( ) ,
								this._filmado,
								this._edicao,
								this._endereco );
	}

}
