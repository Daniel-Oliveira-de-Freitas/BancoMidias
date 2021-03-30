package application;

import java.util.ArrayList;

public class ProcessamentoMidia {
	ArrayList<Filme>filmes = new ArrayList<Filme>();
	ArrayList<Musica>musicas= new ArrayList<Musica>();
	ArrayList<Foto>fotos= new ArrayList<Foto>();
	
	public void AdicionarFilme(Filme filme) {
		filmes.add(filme);
	}

	public void AdicionarMusica(Musica musica) {
		musicas.add(musica);
	}
	public void AdicionarFoto(Foto foto) {
		fotos.add(foto);
	}
	
	public Foto procuraFoto(String t) {
		for(Foto fotosb: fotos ) {
		   if(t.equals(fotosb.getTitulo())) {
			   return fotosb;
		   }
			
		}
		return null;
	}
}
