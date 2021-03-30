package application;

public abstract class AudioVisual {
	private String caminhoArquivo;
	private String titulo;
	private String descricao;
	private String genero;
	private String idioma;
	private String duracao;
	private String ano;

	public AudioVisual(String caminhoArquivo, String titulo, String descricao,String genero, String idioma, String duracao, String ano) {
		this.caminhoArquivo = caminhoArquivo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.genero = genero;
		this.idioma = idioma;
		this.duracao = duracao;
		this.ano = ano;
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
	
	public String toString() {
		return  "Caminho do Arquivo: "+ caminhoArquivo +"\n"+
				"Titulo: " + titulo+"\n"+
				"Descrição: "+descricao + "\n" +
				"Genero: " + genero + "Idioma: "+ idioma +"\n"+
				"Duração: "+ duracao+ "Ano: " + ano;
	}

}
