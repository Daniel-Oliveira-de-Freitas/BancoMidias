package application;

public class Musica {
	private String caminhoArquivo;
	private String titulo;
	private String descricao;
	private String genero;
	private String idioma;
	private String autores;
	private String interpretes;
	private String duracao;
	private String ano;
	

	public Musica(String caminhoArquivo, String titulo, String descricao, String genero, String idioma, String autores, String interpretes, String duracao, String ano) {
	
		this.caminhoArquivo = caminhoArquivo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.genero = genero;
		this.idioma = idioma;
		this.autores = autores;
		this.interpretes = interpretes;
		this.duracao = duracao;
		this.ano = ano;
		
		
	}
	
	public Musica(String titulo, String interpretes) {
		this.titulo = titulo;
		this.interpretes = interpretes;
	}
	
	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}
	
	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
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

	public String getDuracao() {
		return duracao;
	}
	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
}
