package application;

 public abstract class Midia {
	private String caminhoArquivo;
	private String titulo;
	private String descricao;

<<<<<<< HEAD
	 Midia(String t ) {
		caminhoArquivo = "";
		titulo = t;
		descricao = "";
		
=======
	public Midia(String caminhoArquivo, String titulo, String descricao ) {
		this.caminhoArquivo = caminhoArquivo;
		this.titulo = titulo;
		this.descricao = descricao;		
>>>>>>> e5d181046e6cb75559ba9727b9240479310cf34f
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
		return "Destino: " + caminhoArquivo + "Titulo: " + titulo + "Descricao: "+ descricao;
	}

}
