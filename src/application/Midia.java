package application;

public class Midia {
	private String caminhoArquivo;
	private String titulo;
	private String descricao;

	public Midia(String caminhoArquivo, String titulo, String descricao ) {
		this.caminhoArquivo = caminhoArquivo;
		this.titulo = titulo;
		this.descricao = descricao;
		
	}
	
	public Midia(String t) {
		this.titulo = t;
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

}
