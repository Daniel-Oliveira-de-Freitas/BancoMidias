package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class PesquisaController {

	@FXML 
	private TextField barradepesquisa;
	@FXML 
	private RadioButton fotoid;
	@FXML 
	private RadioButton filmeid;
	@FXML 
	private RadioButton musicaid;
	
	public void acaobotaovoltar(){
		Main.changeScene("main");
}
	
	public void acaobotaopesquisar() {
	if(!barradepesquisa.getText().isEmpty()) {
		if (fotoid.isSelected()) {
		informacao(Main.instancia().procuraFoto(barradepesquisa.getText()));
		}else if(filmeid.isSelected()) {
			informacao(Main.instancia().procuraFilme(barradepesquisa.getText()));
		}else if(musicaid.isSelected()) {
			informacao(Main.instancia().procuraMusica(barradepesquisa.getText()));
		}else{
			avisoMidia("Selecione um tipo de midia");
		}
	}else {
		avisoMidia("A barra de pesquisa está vazia");
	}
		}
	public void informacao(String t) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Informações da Midia");
		alert.setHeaderText(null);
		alert.setContentText(t);
		alert.showAndWait();
	}
	
	//avisa para ser escolhido um tipo de midia
		public void avisoMidia(String t) {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Atenção");
			alert.setContentText(t);
			alert.setHeaderText(null);
			alert.showAndWait();

}
}