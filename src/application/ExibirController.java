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
	
	public void acaobotaovoltar(){
		Main.changeScene("main");
	}

	
	public void refresh() {

	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 File arquivo = new File("/tmp/Foto.txt");
		 String caminholocal = null, tituloa = null, desca = null,fotografoa = null,pessoasa = null,locala = null,dataa = null,linha;
	      try {
	          if (!arquivo.exists()) {
	              arquivo.createNewFile();
	          }
	      }catch (IOException e) {}
	      try {
	          FileReader fr = new FileReader(arquivo);
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
	          	ProcessamentoMidia pm = new ProcessamentoMidia();
	              Foto foto = new Foto(caminholocal, tituloa, desca, fotografoa, pessoasa,locala,dataa);
	              System.out.println(foto);
	              pm.AdicionarFoto(foto);
	          }
	      } catch (IOException n) {System.out.println("Oi");}
	      ObservableList<Foto> items = FXCollections.observableArrayList();

			items.add(new Foto(caminholocal, tituloa, desca, fotografoa, pessoasa,locala,dataa));
			tabela.setItems(items);
			localarquivo.setCellValueFactory(new PropertyValueFactory<String,Foto>("CaminhoArquivo"));
			titulo.setCellValueFactory(new PropertyValueFactory<String,Foto>("titulo"));
			fotografo.setCellValueFactory(new PropertyValueFactory<String,Foto>("pessoas"));
			pessoas.setCellValueFactory(new PropertyValueFactory<String,Foto>("fotografo"));
			local.setCellValueFactory(new PropertyValueFactory<String,Foto>("local"));
			data.setCellValueFactory(new PropertyValueFactory<String,Foto>("data"));

			tabela.refresh();	
		
	
		}
}

