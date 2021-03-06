package application;

public class Foto extends Midia {
	
	private String fotografo;
	private String pessoas;
	private String local;
	private String data;
	

	public Foto(String caminhoArquivo,String titulo,String descricao,String fotografo, String pessoas, String local, String data) {
		super(caminhoArquivo, titulo, descricao);
		this.fotografo = fotografo;
		this.pessoas = pessoas;
		this.local = local;
		this.data = data;
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
	
	public String toString() {
		return (super.toString()+'\n'+ " Fotografo: "+ fotografo +'\n'+ " Pessoas:"+ pessoas+'\n'+
								  " Local: " + local +'\n'+ " Data: " +data);
	}
	
	
	
	
	
	

}
