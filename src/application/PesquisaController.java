package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PesquisaController {
	ProcessamentoMidia processo = new ProcessamentoMidia();
	@FXML 
	private TextField barradepesquisa;
	public void acaobotaovoltar(){
		Main.changeScene("main");
}
	
	public void acaobotaopesquisar() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Informações da Midia");
		alert.setContentText("texte");
		alert.setHeaderText("Titulo");
		System.out.println(processo.toString());
		System.out.println(processo.procuraFoto(barradepesquisa.getText()).toString());
		alert.showAndWait();
		
	}
	
	//avisa para ser escolhido um tipo de midia
		public void avisoMidia() {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Atenção");
			alert.setContentText("Selecione um tipo de midia");
			alert.setHeaderText(null);
			alert.showAndWait();

}
}