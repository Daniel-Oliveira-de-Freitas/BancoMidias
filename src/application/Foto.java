package application;

public class Foto extends Midia {
	
	private String fotografo;
	private String pessoas;
	private String local;
	private String data;
	
	public Foto(String t, String fotografo, String pessoas, String local, String data) {
		super(t);
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
		return (super.toString()+ "Fotografo: "+ fotografo + "Pessoas:"+ pessoas+"\n"+
								  "Local: " + local + "Data: " +data);
	}
	
	
	
	
	
	

}
