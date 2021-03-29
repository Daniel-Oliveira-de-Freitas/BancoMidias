package application; 

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import application.CadastroController;

public class ExibirController<Midia>{
	
	public void acaobotaovoltar(){
		Main.changeScene("main");
	}
	
	@FXML
	private ListView<Midia> lvMidias;
	private List<Midia> midias = new ArrayList<>();
	private ObservableList<Midia> obsMidias;
	
	
	public void initialize(URL url, ResourceBundle rb) {
		CarregarMidias();
	}
		
		
	public void CarregarMidias(){
		
		Midia m1 = new Midia(1, "Foto");
		Midia m2 = new Midia(2, "Música");
		Midia m3 = new Midia(3, "Filme");
		
		midias.add(m1);
		midias.add(m2);
		midias.add(m3);
		
		obsMidias = FXCollections.observableArrayList(midias);
		lvMidias.setItems(obsMidias);
		
	}


	public ObservableList<Midia> getObsMidias() {
		return obsMidias;
	}


	public void setObsMidias(ObservableList<Midia> obsMidias) {
		this.obsMidias = obsMidias;
	}
}
