package negocio;

import modelo.Evento;

public class EventoCorporativo extends Evento{

	private boolean	_filmado ;
	private boolean	_recorrente ;
	private String	_empresa ;

	public EventoCorporativo(String titulo, int np,
							 String data, float preco,
							 boolean filmado, boolean recorrente, String empresa )
	{
		super(titulo, np, data, preco) ;

		this._filmado = filmado ;
		this._recorrente = recorrente ;
		this._empresa = empresa ;
		nFilhos++ ;
	}

	public void exibir( )
	{
		super.exibir( ) ;
		System.out.println( "Evento Corporativo" ) ;
		System.out.println( this.toString( ) ) ;
	}

	@Override
	public String toString( )
	{
		
		return String.format( "%s ; %s ; %s ; %s \n",
								super.toString( ) ,
								this._filmado,
								this._recorrente,
								this._empresa );
	}
	
}
