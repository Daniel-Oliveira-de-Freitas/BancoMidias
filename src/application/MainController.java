package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class MainController implements Initializable{
	
	public void acaobotaocadastro(){
		Main.changeScene("cadastro");
	}
	
	public void acaobotaoeditar(){
		Main.changeScene("editar");
}
	
	public void acaobotaopesquisa(){
		Main.changeScene("pesquisar");
}
	public void acaobotaoexibir() {
		Main.changeScene("exibir");
	}
	
	public void acaobotaoexcluir() {
		Main.changeScene("excluir");
	}
	public void leituraFoto() {
		 String caminholocal = null, tituloa = null, desca = null,fotografoa = null,pessoasa = null,locala = null,dataa = null,linha;
		 try {
	          if (!Main.fotofile().exists()) {
	        	  Main.fotofile().createNewFile();
	          }
	      }catch (IOException e) {}
		 try {
	          FileReader fr = new FileReader(Main.fotofile());
	          BufferedReader br = new BufferedReader(fr);
	          while (br.ready()) {
	              linha = br.readLine();  
	              String dados[] = linha.split(";");
	              caminholocal = dados[0];
	              tituloa = dados[1];
	              desca = dados[2];
	              fotografoa  = dados[3];
	              pessoasa = dados[4];
	              locala = dados[5];
	              dataa= dados[6];
	          Foto foto = new Foto(caminholocal, tituloa, desca, fotografoa, pessoasa, locala, dataa);
	          Main.instancia().AdicionarFoto(foto);
	          }
	      } catch (IOException n) {System.out.println("Oi");}
	}
	public void leituraMusica() {
		String linha, caminholocal = null, tituloa = null, desca = null, generoa = null, idiomaa = null,
				autoresa = null, intepretesa = null, duracaoa = null, anoa = null;
		 try {
	          if (!Main.musicafile().exists()) {
	        	  Main.musicafile().createNewFile();
	          }
	      }catch (IOException e) {}
		try {
			FileReader fr = new FileReader(Main.musicafile());
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				linha = br.readLine();
				String dados[] = linha.split(";");
				caminholocal = dados[0];
				tituloa = dados[1];
				desca = dados[2];
				generoa = dados[3];
				idiomaa = dados[4];
				autoresa = dados[5];
				intepretesa = dados[6];
				duracaoa = dados[7];
				anoa = dados[8];
				Musica musicaa = new Musica(caminholocal, tituloa, desca, generoa, idiomaa, autoresa, intepretesa,
						duracaoa, anoa);
				Main.instancia().AdicionarMusica(musicaa);
			}
		} catch (IOException n) {
			System.out.println("Houve algum erro");
		}
	}
	public void leituraFilme() {
		String linha, caminhoarquivo = null, titulo = null, descricao = null, genero = null, idioma = null,
				diretor = null, atoresprincipais = null, duracao = null, ano = null;
		 try {
	          if (!Main.filmefile().exists()) {
	        	  Main.filmefile().createNewFile();
	          }
	      }catch (IOException e) {}
		try {
			FileReader fr = new FileReader(Main.musicafile());
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				linha = br.readLine();
				String dados[] = linha.split(";");
				caminhoarquivo = dados[0];
				titulo = dados[1];
				descricao = dados[2];
				genero = dados[3];
				idioma = dados[4];
				diretor = dados[5];
				atoresprincipais = dados[6];
				duracao = dados[7];
				ano = dados[8];
				Filme filme = new Filme(caminhoarquivo, titulo, descricao, genero, idioma,diretor, atoresprincipais, duracao, ano);
				Main.instancia().AdicionarFilme(filme);			}
		} catch (IOException n) {
			System.out.println("Houve algum erro");
		}
	
		}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		leituraFoto();
		leituraMusica();
		leituraFilme();
	}
	
}