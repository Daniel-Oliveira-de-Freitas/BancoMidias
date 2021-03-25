package application;

public class Foto {
	private String caminhoArquivo;
	private String titulo;
	private String descricao;
	private String fotografo;
	private String pessoas;
	private String local;
	private String data;
	
	public Foto(String caminhoArquivo, String titulo, String descricao, String fotografo, String pessoas, String data) {
		this.caminhoArquivo = caminhoArquivo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.fotografo = fotografo;
		this.pessoas = pessoas;
		this.data = data;
		
	}
	
	public Foto(String titulo, String fotografo) {
		this.titulo = titulo;
		this.fotografo = fotografo;
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
	
	public String getFotografo() {
		return fotografo;
	}
	
	public void setFotografo(String fotografo) {
		this.fotografo = fotografo;
	}
	
	public String getPessoas() {
		return pessoas;
	}
	
	public void setPessoas(String pessoas) {
		this.pessoas = pessoas;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
	
	
	

}
