package application;

public abstract class AudioVisual extends Midia{

	private String genero;
	private String idioma;
	private String duracao;
	private String ano;

	public AudioVisual(String caminhoArquivo, String titulo, String descricao,String genero, String idioma, String duracao, String ano) {
		super(caminhoArquivo,titulo,descricao);
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
	
	public String toString() {
		return  super.toString() +
				" Genero: " + genero + " Idioma: "+ idioma +"\n"+
				" Duração: "+ duracao+ " Ano: " + ano;
	}

}
