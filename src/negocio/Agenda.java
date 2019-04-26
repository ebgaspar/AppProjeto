package negocio;


import java.util.List;
import java.util.ArrayList;

import modelo.Evento;
import auxiliar.Constante;

public class Agenda {
	private String			_nome ;
	private List< Evento >	_evento ;
	private int[ ]			_qtdeEventos ;
	private Cliente			_cliente ;
	
	private boolean validar( )
	{
		if ( _evento.size( ) == Evento.NumeroFilhos( ) )
		{
			return true ;
		}
		
		return false ;
	}
	
	private void contabiliza( Evento e )
	{
		if( e instanceof EventoPresencial )
		{
			this._qtdeEventos[ 0 ]++ ;
		}
		else if ( e instanceof EventoOnline )
		{		
			this._qtdeEventos[ 1 ]++ ;
		}

	}
	
	private void showContabiliza( )
	{
		System.out.println("Contabiliza");
		
		for ( int i = 0 ; i < this._evento.size( ) ; i++ )
		{
			this.contabiliza( this._evento.get( i ) );
		}
		
		for ( int i = 0 ; i < this._qtdeEventos.length ; i++ )
		{
			System.out.println( "- " + Constante.Eventos[ i ] + ": " + this._qtdeEventos[ i ] );
		}
		
	}
	
	public Agenda( String nome )
	{
		this._nome = nome ;
		this._evento = new ArrayList< Evento >( ) ;
	}
	
	public void associa( Cliente c )
	{
		this._cliente = c ;
	}
	
	public void adiciona( Evento e )
	{
		this._evento.add( e ) ;
	}
	
	public void exibir()
	{
		System.out.println("Agenda");
		
		if ( validar( ) )
		{
			this._qtdeEventos = new int[ Constante.Eventos.length ] ;
			System.out.println( this.toString( ) );
			showContabiliza( ) ;
		}
		else
		{
			System.err.println( "Inválido" ) ;
		}
	}
	
	@Override
	public String toString()
	{
		String ev = new String( ) ;
		
		for ( Evento e : this._evento )
		{
			ev += e.toString( ) ;
		}
		
		return String.format("%s\n%s", this._nome , ev ) ;
	}
	
}
