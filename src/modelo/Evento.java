package modelo;

//import java.util.Date;

public abstract class Evento {
	
	protected String	_titulo ;
	protected int		_numParticipantes ;
	protected String	_data ;
	protected float		_preco ;
	
	static protected int nFilhos ;
	
	static public int NumeroFilhos( )
	{
		return nFilhos ;
	}
	
	public Evento( String titulo, int np, String data, float preco )
	{
		this._titulo = titulo ;
		this._data = data ;
		this._numParticipantes = np ;
		this._preco = preco ;
	}
	
	public void exibir() {
		System.out.println("Evento");
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return String.format("%s ; %s ; %s ; %s", 
				this._titulo,
				this._numParticipantes,
				this._data,
				this._preco
			);
	}

}
