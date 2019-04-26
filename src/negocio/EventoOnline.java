package negocio;

import modelo.Evento;

//import java.util.Date;

public class EventoOnline extends Evento {

	private boolean _eAberto ;
	private boolean _comVideo ;
	private boolean _eInterativo ;

	public EventoOnline(String titulo, int np, String data, float preco, boolean aberto, boolean comVideo,
			boolean interativo) {
		super(titulo, np, data, preco);
		this._eAberto = aberto;
		this._comVideo = comVideo;
		this._eInterativo = interativo;
		nFilhos++ ;
	}

	public void exibir() {
		super.exibir( );
		System.out.println("Evento OnLine");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return String.format("%s ; %s ; %s ; %s \n",
				super.toString(),
				this._eAberto,
				this._comVideo,
				this._eInterativo
				);
	}

}
