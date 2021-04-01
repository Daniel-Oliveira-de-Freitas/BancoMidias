package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
	
	public String procuraFoto(String t) {
		for(Foto fotosb: fotos ) {
		   if(t.equals(fotosb.getTitulo())) {
			   return fotosb.toString();
		   }
			
		}
		return "Não há midia desse tipo cadastrada";
	}
	
	public String procuraMusica(String t) {
		for(Musica musicasb: musicas) {
		   if(t.equals(musicasb.getTitulo())) {
			   return musicasb.toString();
		   }
			
		}
		return "Não há midia desse tipo cadastrada";
	}
	public String procuraFilme(String t) {
		for(Filme filmesb: filmes) {
		   if(t.equals(filmesb.getTitulo())) {
			   return filmesb.toString();
		   }
			
		}
		return "Não há midia desse tipo cadastrada";
	}
	
	// função que envolve salvar as informações da foto em um arquivo de texto
	public void salvarFoto() {
		String linha;
		try {
			FileWriter fc = new FileWriter(Main.fotofile());
			BufferedWriter bc = new BufferedWriter(fc);
			for(Foto foto : fotos) {
			linha = foto.getCaminhoArquivo() + ";" + foto.getTitulo() + ";" + foto.getDescricao() + ";" + foto.getFotografo() + ";" + foto.getPessoas() + ";" + foto.getLocal() + ";"
					+ foto.getData() + ";";
			bc.write(linha);
			bc.newLine();
			}
			bc.close();
			fc.close();
		} catch (Exception m) {
			System.out.println(m);
			System.out.println("Deu erro");
		}
	}

	// função que envolve salvar as informações da musica em um arquivo de texto
	public void salvarMusica() {
		String linha;
		try {
			FileWriter fc = new FileWriter(Main.musicafile());
			BufferedWriter bc = new BufferedWriter(fc);
			for(Musica m: musicas) {
			linha = m.getCaminhoArquivo() + ";" + m.getTitulo() + ";" + m.getDescricao() + ";" + m.getGenero() + ";" + m.getIdioma() + ";" + m.getAutores() + ";"
					+ m.getInterpretes() + ";" + m.getDuracao() + ";" + m.getAno() + ";";
			bc.write(linha);
			bc.newLine();
			}
			bc.close();
			fc.close();
		} catch (Exception m) {
			System.out.println(m);
			System.out.println("Deu erro");
		}
	}

	// função que envolve salvar as informações do filme em um arquivo de texto
	public void salvarFilme() {
		String linha;
		try {
			FileWriter fc = new FileWriter(Main.filmefile());
			BufferedWriter bc = new BufferedWriter(fc);
			for(Filme f : filmes) {
			linha = f.getCaminhoArquivo() + ";" + f.getTitulo() + ";" + f.getDescricao() + ";" + f.getGenero() + ";" + f.getIdioma() + ";" + f.getDiretor()+ f.getAtoresPrincipais() + ";" + f.getDuracao() + ";" + f.getAno() + ";";
			bc.write(linha);
			bc.newLine();
			}
			bc.close();
			fc.close();
		} catch (Exception m) {
			System.out.println(m);
			System.out.println("Deu erro");
		}
	}

}
