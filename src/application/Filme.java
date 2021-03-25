package application;

public class Filme {
	private String caminhoArquivo;
	private String titulo;
	private String descricao;
	private String genero;
	private String idioma;
	private String diretor;
	private String atoresPrincipais;
	private String duracao;
	private String ano;

	public Filme(String caminhoArquivo, String titulo, String descricao, String genero, String idioma, String diretor, String atoresPrincipais, String duracao, String ano) {
		this.caminhoArquivo = caminhoArquivo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.genero = genero;
		this.idioma = idioma;
		this.diretor = diretor;
		this.atoresPrincipais = atoresPrincipais;
		this.duracao = duracao;
		this.ano = ano;
	
	}
	
	public Filme(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
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
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getAtoresPrincipais() {
		return atoresPrincipais;
	}
	
	public void setAtoresPrincipais(String atoreresPrincipais) {
		this.atoresPrincipais = atoreresPrincipais;
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
