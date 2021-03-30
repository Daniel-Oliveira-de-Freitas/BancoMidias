package application;

    class Filme extends Midia {
	
	private String genero;
	private String idioma;
	private String diretor;
	private String atoresPrincipais;
	private String duracao;
	private String ano;

	
	    public Filme( String caminhoArquivo,String titulo,String descricao, String genero, String idioma, String diretor, String atoresPrincipais, String duracao, String ano) {
		super(caminhoArquivo, titulo, descricao);
		this.genero = genero;
		this.idioma = idioma;
		this.diretor = diretor;
		this.atoresPrincipais = atoresPrincipais;
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
	
	public String toString() {
		return (super.toString() +"\n"+
				"Genero: " + genero + "Idioma: "+ idioma +"\n"+
				"Diretor: "+ diretor+ "Atores Principais " + atoresPrincipais+ "\n"+
				"Duração: "+ duracao+ "Ano: " + ano);
	}

}
