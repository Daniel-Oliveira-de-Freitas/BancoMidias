package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ExcluirController {
	@FXML
	private TextField barradepesquisa;
	
		public void acaobotaovoltar() {
			Main.changeScene("main");
	}
		public void botaoPesquisa() {
			String titulo = barradepesquisa.getText();
			Main.instancia().excluifoto(titulo);
			Main.instancia().salvarFoto();
	}
	
	public void avisoExclusao() {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Atenção");
		alert.setHeaderText("O seguinte item foi excluido com sucesso");
		alert.setContentText('\n'+Main.instancia().procuraFoto(barradepesquisa.getText()));
}
}
