package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ExcluirController {

	@FXML
	private RadioButton musicaid;
	@FXML
	private RadioButton filmeid;
	@FXML
	private RadioButton fotoid;
	@FXML
	private TableView<Foto> tabela;
	@FXML
	private TableColumn<String, Foto> localarquivo;
	@FXML
	private TableColumn<String, Foto> titulo;
	@FXML
	private TableColumn<String, Foto> desc;
	@FXML
	private TableView<Musica> tabelam;
	@FXML
	private TableColumn<String, Musica> localarquivom;
	@FXML
	private TableColumn<String, Musica> titulomusic;
	@FXML
	private TableColumn<String, Musica> descricaomusic;
	@FXML
	private TableView<Filme> tabelaf;
	@FXML
	private TableColumn<String, Filme> localarquivof;
	@FXML
	private TableColumn<String, Filme> titulof;
	@FXML
	private TableColumn<String, Filme> descricaof;

	public void Atualizar() {
		if (fotoid.isSelected()) {
			tabelaFoto();
			tabelam.setVisible(false);
			tabela.setVisible(true);
			tabelaf.setVisible(false);
		} else if (musicaid.isSelected()) {
			tabelaMusica();
			tabelam.setVisible(true);
			tabela.setVisible(false);
			tabelaf.setVisible(false);
		} else if (filmeid.isSelected()) {
			tabelaFilme();
			tabelaf.setVisible(true);
			tabelam.setVisible(false);
			tabela.setVisible(false);
		}
	}

	// TABELA FOTO
	public void tabelaFoto() {
		String caminholocal = null, tituloa = null, desca = null, fotografoa = null, pessoasa = null, locala = null,
				dataa = null, linha;
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
				items.add(new Foto(caminholocal, tituloa, desca, fotografoa, pessoasa, locala, dataa));
			}
		} catch (IOException n) {
			System.out.println("Oi");
		}
		tabela.setItems(items);
		localarquivo.setCellValueFactory(new PropertyValueFactory<String, Foto>("CaminhoArquivo"));
		titulo.setCellValueFactory(new PropertyValueFactory<String, Foto>("titulo"));
		desc.setCellValueFactory(new PropertyValueFactory<String, Foto>("descricao"));
		tabela.refresh();
	}

	// TABELA MÚSICA
	public void tabelaMusica() {
		String caminholocalm = null, titulom = null, descricaom = null, generom = null, idiomam = null, autoresm = null,
				interpretesm = null, duracaom = null, anom = null, linha;
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
				itemsmusica.add(new Musica(caminholocalm, titulom, descricaom, generom, idiomam, autoresm, interpretesm,
						duracaom, anom));
			}
		} catch (IOException n) {
			System.out.println("Oi");
		}
		tabelam.setItems(itemsmusica);
		localarquivom.setCellValueFactory(new PropertyValueFactory<String, Musica>("CaminhoArquivo"));
		titulomusic.setCellValueFactory(new PropertyValueFactory<String, Musica>("titulo"));
		descricaomusic.setCellValueFactory(new PropertyValueFactory<String, Musica>("descricao"));
		tabelam.refresh();
	}

	// TABELA FILME
	public void tabelaFilme() {
		String caminholocalf = null, titulofil = null, descricaofil = null, generofil = null, idiomafil = null,
				diretoresfil = null, atoresprincipaisfil = null, duracaofil = null, anofil = null, linha;
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
				itemsfilme.add(new Filme(caminholocalf, titulofil, descricaofil, generofil, idiomafil, diretoresfil,
						atoresprincipaisfil, duracaofil, anofil));
			}
		} catch (IOException n) {
			System.out.println("Oi");
		}
		tabelaf.setItems(itemsfilme);
		localarquivof.setCellValueFactory(new PropertyValueFactory<String, Filme>("CaminhoArquivo"));
		titulof.setCellValueFactory(new PropertyValueFactory<String, Filme>("titulo"));
		descricaof.setCellValueFactory(new PropertyValueFactory<String, Filme>("descricao"));
		tabelaf.refresh();
	}

	public void onDeleteButton() {
		try {
		if (fotoid.isSelected()) {
			Foto item = tabela.getSelectionModel().getSelectedItem();
			tabela.getItems().remove(item);
			if(item == null) {
				throw new NullPointerException("Não há itens para na tabela apagar foto");}
			Main.instancia().excluifoto(item.getTitulo());
			Main.instancia().salvarFoto();

		} else if (musicaid.isSelected()) {
			Musica itemm = tabelam.getSelectionModel().getSelectedItem();
			tabelam.getItems().remove(itemm);
			if(itemm == null) {
				throw new NullPointerException("Não há itens para apagar na tabela musica");}
			Main.instancia().excluimusica(itemm.getTitulo());
			Main.instancia().salvarMusica();

		} else if (filmeid.isSelected()) {
			Filme itemf = tabelaf.getSelectionModel().getSelectedItem();
			tabelaf.getItems().remove(itemf);
			if(itemf == null) {
			throw new NullPointerException("Não há itens para apagar na tabela filme");}
			Main.instancia().excluifilme(itemf.getTitulo());
			Main.instancia().salvarFilme();
		}
		}catch(NullPointerException e) {
			avisoErro(e.getMessage());
		}
		
	}
		//aviso generico
		public void avisoErro(String a) {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Atenção");
			alert.setContentText(a);
			alert.setHeaderText(null);
			alert.showAndWait();
		}
		
		public void acaoEscolha() {
			if (fotoid.isSelected()) {
				tabelaFoto();
				tabelam.setVisible(false);
				tabela.setVisible(true);
				tabelaf.setVisible(false);
			} else if (musicaid.isSelected()) {
				tabelaMusica();
				tabelam.setVisible(true);
				tabela.setVisible(false);
				tabelaf.setVisible(false);
			} else if (filmeid.isSelected()) {
				tabelaFilme();
				tabelaf.setVisible(true);
				tabelam.setVisible(false);
				tabela.setVisible(false);
			}
		}

	public void acaobotaovoltar() {
		Main.changeScene("main");
	}
}
