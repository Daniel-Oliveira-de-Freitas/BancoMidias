package application;

public class Musica extends Filme {
	
	private String autores;
	private String interpretes;
	
	public Musica(String t, String diretor, String atoresPrincipais, String genero, String caminhoArquivo, String titulo, String descricao, String duracao, String ano) {
	    super(t, caminhoArquivo, titulo, descricao, genero, duracao, ano);
		
		this.autores = diretor;
		this.interpretes = atoresPrincipais;
	}	
	public Musica(String caminhoArquivo,String titulo,String descricao,String genero, String idioma, String autores, String interpretes, String duracao, String ano, String diretor, String atoresPrincipais) {
		super(caminhoArquivo, titulo, descricao, genero, idioma, diretor, atoresPrincipais, duracao, ano);
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
	
	public String toString() {
		return (super.toString() + "Autores: "+ autores + "Interpretes: "+ interpretes);
	}

	
}
