package application; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.sun.javafx.image.IntToIntPixelConverter;

import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import application.Midia;

public class ExibirController implements Initializable{
	@FXML
	private RadioButton musicaid;
	@FXML
	private RadioButton filmeid;
	@FXML
	private RadioButton fotoid;
	@FXML
	private TableView <Foto> tabela;
	@FXML
	private TableColumn<String,Foto> localarquivo;
	@FXML
	private TableColumn<String,Foto> titulo;
	@FXML
	private TableColumn<String,Foto> desc;
	@FXML
	private TableColumn<String,Foto> fotografo;
	@FXML
	private TableColumn<String,Foto> pessoas;
	@FXML
	private TableColumn<String,Foto> local;
	@FXML
	private TableColumn<String,Foto> data;
	
	@FXML
	private TableView <Musica> tabelam;
	@FXML
	private TableColumn<String,Musica> localarquivom;
	@FXML
	private TableColumn<String,Musica> titulomusic;
	@FXML
	private TableColumn<String,Musica> descricaomusic;
	@FXML
	private TableColumn<String,Musica> generomusic;
	@FXML
	private TableColumn<String,Musica> idiomamusic;
	@FXML
	private TableColumn<String,Musica> autoresmusic;
	@FXML
	private TableColumn<String,Musica> interpretesmusic;
	@FXML
	private TableColumn<String,Musica> duracaomusic;
	@FXML
	private TableColumn<String,Musica> anomusic;
	
	@FXML
	private TableView <Filme> tabelaf;
	@FXML
	private TableColumn<String,Filme> localarquivof;
	@FXML
	private TableColumn<String,Filme> titulof;
	@FXML
	private TableColumn<String,Filme> descricaof;
	@FXML
	private TableColumn<String,Filme> generof;
	@FXML
	private TableColumn<String,Filme> idiomaf;
	@FXML
	private TableColumn<String,Filme> diretoresf;
	@FXML
	private TableColumn<String,Filme> atoresprincipaisf;
	@FXML
	private TableColumn<String,Filme> duracaf;
	@FXML
	private TableColumn<String,Filme> anof;
	

	public void acaobotaovoltar(){
		Main.changeScene("main");
	}
	public void Atualizar() {
		if(fotoid.isSelected()) {
		tabelaFoto();
		tabelam.setVisible(false);
		tabela.setVisible(true);
		tabelaf.setVisible(false);
		}else if(musicaid.isSelected()) {
			tabelaMusica();
			tabelam.setVisible(true);
			tabela.setVisible(false);
			tabelaf.setVisible(false);
		}else if(musicaid.isSelected()) {
			tabelaFilme();
			tabelaf.setVisible(true);
			tabelam.setVisible(false);
			tabela.setVisible(false);
		}
	
		
		
	}
	public void tabelaFoto() {
		 String caminholocal = null, tituloa = null, desca = null,fotografoa = null,pessoasa = null,locala = null,dataa = null,linha;
		 ObservableList<Foto> items = FXCollections.observableArrayList();
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
	              items.add(new Foto(caminholocal, tituloa, desca, fotografoa, pessoasa,locala,dataa));
	          }
	      } catch (IOException n) {System.out.println("Oi");}
			tabela.setItems(items);
			localarquivo.setCellValueFactory(new PropertyValueFactory<String,Foto>("CaminhoArquivo"));
			titulo.setCellValueFactory(new PropertyValueFactory<String,Foto>("titulo"));
			desc.setCellValueFactory(new PropertyValueFactory<String,Foto>("descricao"));
			fotografo.setCellValueFactory(new PropertyValueFactory<String,Foto>("pessoas"));
			pessoas.setCellValueFactory(new PropertyValueFactory<String,Foto>("fotografo"));
			local.setCellValueFactory(new PropertyValueFactory<String,Foto>("local"));
			data.setCellValueFactory(new PropertyValueFactory<String,Foto>("data"));
			tabela.refresh();	
		}
	
	
	public void tabelaMusica() {
		 String caminholocalm = null, titulom = null, descricaom = null,generom = null,idiomam = null,autoresm = null,interpretesm = null,duracaom = null,anom = null,linha;
		 ObservableList<Musica> itemsmusica = FXCollections.observableArrayList();
	      try {
	          FileReader fr = new FileReader(Main.musicafile());
	          BufferedReader br = new BufferedReader(fr);
	          while (br.ready()) {
	              linha = br.readLine();  
	              String dados[] = linha.split(";");
	              caminholocalm = dados[0];
	              titulom = dados[1];
	              descricaom = dados[2];
	              generom  = dados[3];
	              idiomam = dados[4];
	              autoresm = dados[5];
	              interpretesm = dados[6];
	              duracaom = dados[7];
	              anom = dados[8];
	              itemsmusica.add(new Musica(caminholocalm, titulom, descricaom, generom, idiomam, autoresm, interpretesm, duracaom,anom));
	          }
	      } catch (IOException n) {System.out.println("Oi");}
			tabelam.setItems(itemsmusica);
			localarquivom.setCellValueFactory(new PropertyValueFactory<String,Musica>("CaminhoArquivo"));
			titulomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("titulo"));
			descricaomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("descricao"));
			generomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("genero"));
			idiomamusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("idioma"));
			autoresmusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("autores"));
			interpretesmusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("interpretes"));
			duracaomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("duracao"));
			anomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("ano"));
			tabelam.refresh();	
		}
	
	public void tabelaFilme() {
		 String caminholocalf = null, titulofil = null, descricaofil = null,generofil = null,idiomafil = null,diretoresfil = null,atoresprincipaisfil = null,duracaofil = null,anofil = null,linha;
		 ObservableList<Filme> itemsfilme = FXCollections.observableArrayList();
	      try {
	          FileReader fr = new FileReader(Main.filmefile());
	          BufferedReader br = new BufferedReader(fr);
	          while (br.ready()) {
	              linha = br.readLine();  
	              String dados[] = linha.split(";");
	              caminholocalf = dados[0];
	              titulofil = dados[1];
	              descricaofil = dados[2];
	              generofil  = dados[3];
	              idiomafil = dados[4];
	              diretoresfil = dados[5];
	              atoresprincipaisfil = dados[6];
	              duracaofil = dados[7];
	              anofil = dados[8];
	              itemsfilme.add(new Filme(caminholocalf, titulofil, descricaofil, generofil, idiomafil, diretoresfil,atoresprincipaisfil , duracaofil,anofil));
	          }
	      } catch (IOException n) {System.out.println("Oi");}
			tabelaf.setItems(itemsfilme);
			localarquivom.setCellValueFactory(new PropertyValueFactory<String,Musica>("CaminhoArquivo"));
			titulomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("titulo"));
			descricaomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("descricao"));
			generomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("genero"));
			idiomamusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("idioma"));
			autoresmusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("diretores"));
			interpretesmusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("atoresprincipais"));
			duracaomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("duracao"));
			anomusic.setCellValueFactory(new PropertyValueFactory<String,Musica>("ano"));
			tabelam.refresh();	
		}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			Atualizar();
			
		}
}

