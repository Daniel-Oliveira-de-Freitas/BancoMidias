package application;

public class Musica extends AudioVisual {
	
	private String autores;
	private String interpretes;
	
	
		
	public Musica(String caminhoArquivo,String titulo,String descricao,String genero, String idioma, String autores, String interpretes, String duracao, String ano) {
		super(caminhoArquivo, titulo, descricao, genero, idioma, duracao, ano);
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
