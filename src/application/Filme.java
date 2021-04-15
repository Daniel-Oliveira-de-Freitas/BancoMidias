package application;

public class Filme extends AudioVisual {

	private String diretor;
	private String atoresPrincipais;

	public Filme(String caminhoArquivo, String titulo, String descricao, String genero, String idioma, String diretor,
			String atoresPrincipais, String duracao, String ano) {
		super(caminhoArquivo, titulo, descricao, genero, idioma, duracao, ano);
		this.diretor = diretor;
		this.atoresPrincipais = atoresPrincipais;
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

	public String toString() {
		return (super.toString() + "\n" + " Diretor: " + diretor + '\n' + " Atores Principais: " + atoresPrincipais);
	}

}
