package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class ProcessamentoMidia {
	ArrayList<Filme>filmes = new ArrayList<Filme>();
	ArrayList<Musica>musicas= new ArrayList<Musica>();
	ArrayList<Foto>fotos= new ArrayList<Foto>();
	
	File fotofile = new File("C:\\tmp\\Foto.txt");
	File filmefile = new File("C:\\tmp\\Filme.txt");
	File musicafile = new File("C:\\tmp\\Musica.txt");
	
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
	
	// função que envolve criar um arquivo de texto para foto pegando as informações
	// do campos de texto
	public void salvarFoto() {
		String linha, caminhoarquivo = null, titulo = null, descricao = null, fotografo = null, pessoas = null,
				local = null, data = null;
		try {
			FileWriter fc = new FileWriter(fotofile);
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

	// função que envolve criar um arquivo de texto para musica pegando as
	// informações do campos de texto
	public void salvarMusica() {
		String linha;
		try {
			FileWriter fc = new FileWriter(musicafile);
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

	// função que envolve criar um arquivo de texto para filme pegando as
	// informações do campos de texto
	public void salvarFilme() {
		String linha, caminhoarquivo = null, titulo = null, descricao = null, genero = null, idioma = null,
				diretor = null, atoresprincipais = null, duracao = null, ano = null;
		try {
			FileWriter fc = new FileWriter(filmefile);
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
