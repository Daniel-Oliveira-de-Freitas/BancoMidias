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
	

	public void acaobotaovoltar(){
		Main.changeScene("main");
	}
	public void Atualizar() {
		if(fotoid.isSelected()) {
		tabelaFoto();
		tabelam.setVisible(false);
		tabela.setVisible(true);
		}else if(musicaid.isSelected()) {
			tabelaMusica();
			tabelam.setVisible(true);
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
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			Atualizar();
			
		}
}

