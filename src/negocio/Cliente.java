package negocio;

public class Cliente {

	private String	_nome;
	private int		_idade;
	private String	_email;

	public Cliente( String nome, int idade, String email )
	{
		this._nome = nome ;
		this._idade = idade ;
		this._email = email ;
	}
	
	public void exibir() {
		System.out.println("Cliente");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s", this._nome, this._idade, this._email);
	}

}
