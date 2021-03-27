package application;

public class Musica extends Filme{
	
	
	private String autores;
	private String interpretes;
	
	
	

	public Musica(String f,String genero, String idioma, String autores, String interpretes, String duracao, String ano, String diretor, String atoresPrincipais) {
		super(f);
		
		this.autores = autores;
		this.interpretes = interpretes;
	}
	
	public String getAutores() {
		return autores;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public String getInterpretes() {
		return interpretes;
	}
	
	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}

	
}
